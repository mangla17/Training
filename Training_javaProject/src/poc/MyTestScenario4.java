package com.ibm.test;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.core.BaseSeleniumTest;



public class MyTestScenario4 extends BaseSeleniumTest{
	
	public WebDriver driver;
	String dataFileName = "src/com/ibm/testdata/one.xml"; 
	Map myTestClassMap= new HashMap();
	
	@Test
	public void rfxCreationTest() throws Exception{
		
		AuthTest auth = new AuthTest();
		Map loginDataMap = getTestData(dataFileName, "login");
		Map loginSharedMap =auth.login(loginDataMap,driver);
		updateClassMap(loginSharedMap);
		
		NavTest nav = new NavTest();
		//Map navDataMap = getTestData(dataFileName, "navigation", myTestClassMap);
		Map navMap = nav.navigateMainMenu(getTestData(dataFileName, "navigation", myTestClassMap),driver);
		updateClassMap(navMap);
		
		Map navMap1 =getTestData(dataFileName, "navigation1", myTestClassMap);
		nav.navigateMainMenu1(navMap1,driver);
		
	}
	
	
	@BeforeClass
	public void  mySetup(ITestContext context) throws MalformedURLException, SecurityException, IllegalArgumentException, InterruptedException, NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException{
		driver = getDriver();
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		super.myTearDown(driver);
	}
	
	public void updateClassMap(Map map){
		if(map!=null){
			myTestClassMap.putAll(map);
	}
		
		
	}

}
