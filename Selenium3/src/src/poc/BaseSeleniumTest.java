package com.ibm.core;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.ibm.core.utility.PropertiesOperation;
import com.ibm.core.utility.XMLProperties;
import com.ibm.core.utility.XMLUtil;
/**
 * This Class needs to be extended by all the automation scripts(tests) work flow  
 * @author akale
 *
 */
public class BaseSeleniumTest {
	
	/**
	 * 
	 * @return return the instance of driver as per browser under test
	 * @author akale
	 */
	public WebDriver getDriver() throws MalformedURLException,
			InterruptedException {
		PropertiesOperation prop = new PropertiesOperation();
		WebDriver driver = LocalDriverFactory.createInstance(prop
				.getSourcingValueBykey("browser"));
		LocalDriverManager.setWebDriver(driver);
		System.out.println("Thread id = " + Thread.currentThread().getId());
		System.out.println("Hashcode of webDriver instance = "
				+ LocalDriverManager.getDriver());
		driver = LocalDriverManager.getDriver();
		driver.get(prop.getSourcingValueBykey("hostURL"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		return driver;
	}
	
	/**
	 * 
	 * @param fileLocation
	 * @param testNodeName
	 * @param sharedDatamap
	 *            : map which contains the keyvalue pair which needs to be
	 *            shared with in the test node OR Flow
	 * @return map :
	 * @throws Exception
	 * @author akale
	 */
	public Map getTestData(String fileLocation, String testNodeName,
			Map sharedDatamap) throws Exception {

		Map testDataMap = new HashMap();
		// String s = context.getCurrentXmlTest().getName();
		// //String key = context.getName();
		// String key =(String) context.getAttribute("currentMethodName");
		// System.out.println("Executing Test case : "+key);
		// String fileNameSuite =
		// context.getSuite().getXmlSuite().getFileName();
		// String fileName = (String) context.getAttribute("fileLocation");
		Node suiteRoot = getRootNode(new File(fileLocation));

		List testNodes = XMLUtil.getListOfNodes(suiteRoot, "//suite/test");
		Iterator testIter = testNodes.iterator();

		while (testIter.hasNext()) {
			Node testNode = (Node) testIter.next();
			String testName = getAttributeValue(testNode.getAttributes(),
					"name");
			System.out.println(testName);

			if (testName.equals(testNodeName)) {
				Node datasetNode = XMLUtil.getStrictChildNode(testNode,
						"dataset");
				// Node dataNode = XMLUtil.getStrictChildNode(datasetNode,
				// "data");
				// String keyParam = getAttributeValue(dataNode.getAttributes(),
				// "key");
				// System.out.println(keyParam);
				// String value = getAttributeValue(dataNode.getAttributes(),
				// "value");
				// System.out.println(keyParam);
				// testDataMap.put(keyParam, value);

				List dataNode = XMLUtil
						.getStrictChildNodes(datasetNode, "data");

				for (Iterator iterator = dataNode.iterator(); iterator
						.hasNext();) {
					Node object = (Node) iterator.next();
					String keyParam = getAttributeValue(object.getAttributes(),
							"key");
					String value = null;
					String refValue = null;
					String refGlobalValue = null;
					NamedNodeMap att = object.getAttributes();
					Node refNode = att.getNamedItem("ref");

					if (refNode != null) {
						refValue = getAttributeValue(object.getAttributes(),
								"ref");
						refGlobalValue = (String) sharedDatamap.get(refValue);
						value = refGlobalValue;

					} else {
						value = getAttributeValue(object.getAttributes(),
								"value");
					}

					testDataMap.put(keyParam, value);

				}

			}
		}

		if (sharedDatamap != null) {
			if (!sharedDatamap.isEmpty()) {
				// testDataMap.putAll(sharedDatamap);
			}
		}

		return testDataMap;

	}
	
	
	public Map getTestData(String fileLocation, String testNodeName)
			throws Exception {

		Map testDataMap = new HashMap();
		// String s = context.getCurrentXmlTest().getName();
		// //String key = context.getName();
		// String key =(String) context.getAttribute("currentMethodName");
		// System.out.println("Executing Test case : "+key);
		// String fileNameSuite =
		// context.getSuite().getXmlSuite().getFileName();
		// String fileName = (String) context.getAttribute("fileLocation");
		Node suiteRoot = getRootNode(new File(fileLocation));

		List testNodes = XMLUtil.getListOfNodes(suiteRoot, "//suite/test");
		Iterator testIter = testNodes.iterator();

		while (testIter.hasNext()) {
			Node testNode = (Node) testIter.next();
			String testName = getAttributeValue(testNode.getAttributes(),
					"name");
			System.out.println(testName);

			if (testName.equals(testNodeName)) {
				Node datasetNode = XMLUtil.getStrictChildNode(testNode,
						"dataset");
				// Node dataNode = XMLUtil.getStrictChildNode(datasetNode,
				// "data");
				// String keyParam = getAttributeValue(dataNode.getAttributes(),
				// "key");
				// System.out.println(keyParam);
				// String value = getAttributeValue(dataNode.getAttributes(),
				// "value");
				// System.out.println(keyParam);
				// testDataMap.put(keyParam, value);

				List dataNode = XMLUtil
						.getStrictChildNodes(datasetNode, "data");

				for (Iterator iterator = dataNode.iterator(); iterator
						.hasNext();) {
					Node object = (Node) iterator.next();
					String keyParam = getAttributeValue(object.getAttributes(),
							"key");
					String value = null;
					String refValue = null;
					String refGlobalValue = null;
					NamedNodeMap att = object.getAttributes();
					Node refNode = att.getNamedItem("ref");

					if (refNode != null) {
						// refValue =getAttributeValue(object.getAttributes(),
						// "ref");
						// refGlobalValue =(String) globalMap.get(refValue);
						// value = refGlobalValue;

					} else {
						value = getAttributeValue(object.getAttributes(),
								"value");
					}

					testDataMap.put(keyParam, value);

				}

			}
		}

		// if(globalMap != null){
		// if(!globalMap.isEmpty()){
		// testDataMap.putAll(globalMap);
		// }
		// }

		return testDataMap;

	}
	
	
	/**
	 * 
	 * @param attrs
	 * @param attrName
	 * @return
	 */
	public static Node getRootNode(File xmlFile) throws Exception {
		Node node = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		Document doc;
		Node tcNode;

		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(xmlFile);

			doc.getDocumentElement().normalize();
			System.out.println("Root element  : "
					+ doc.getDocumentElement().getNodeName());
			// tcNode = doc.getParentNode();
			// String s = tcNode.getNodeName();

			XMLProperties props = new XMLProperties(doc.getDocumentElement());

			node = props.getRootPropertyNode();
		} catch (Exception e) {
			Reporter.log("Failed to get root node for " + xmlFile + " due to "
					+ e);
		}

		return node;
	}
		
	/**
	 * 
	 * @param attrs
	 * @param attrName
	 * @return
	 */
	public static String getAttributeValue(NamedNodeMap attrs, String attrName) {
		String attrValue = null;
		Node nodeAttr = attrs.getNamedItem(attrName);

		if (nodeAttr != null) {
			attrValue = nodeAttr.getNodeValue();
		}

		return attrValue;
	}
			
	public static final void waitForPagetoLoad(final WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String readyState = js.executeScript("return document.readyState")
					.toString();
			;
			while (!readyState.equalsIgnoreCase("complete")) {
				System.out.println("ReadyState = " + readyState);
				Thread.sleep(1000);
				readyState = js.executeScript("return document.readyState")
						.toString();
			}
		} catch (InterruptedException e) {
			System.out.println("Logs " + e.toString());
		}

	}

	public void myTearDown(WebDriver driver) throws InterruptedException {
		driver.close();
		driver.quit();
		System.out.println("Tear Down successfull successfull");
	}


}
