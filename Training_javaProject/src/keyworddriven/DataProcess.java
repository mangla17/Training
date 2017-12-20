

package keyworddriven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataProcess {
	
//	private String keywordCol;
//	private String locatorTypeCol;
//	private String locatorValueCol;
//	private String parameterCol;
//	
//	public DataProcess(String keyCol, String locTypeCol,String locValueCol,String paramCol){
//		keywordCol = keyCol;
//		locatorTypeCol=locTypeCol;
//		locatorValueCol=locValueCol;
//		parameterCol=paramCol;
//	}
	
	private By getElementLocator(String keyword, String locatorType, String locatorValue){
		
		switch(locatorType){
			case "className": 
					return By.className(locatorValue);
			case "id": 
					return By.id(locatorValue);
			case "cssSelector": 
					return By.cssSelector(locatorValue);
			case "xpath": 
					return By.xpath(locatorValue);
			default:
				return By.id(locatorValue);
		}
	}
	
	public By performAction(WebDriver driver ,String keyword, String locatorType, String locatorValue,String param){
		
		switch(keyword){
		
			case "openBrowser" :
					driver.get(param);
					break;
			case "click": 
					By byObj =getElementLocator(keyword, locatorType, locatorValue);
					driver.findElement(byObj).click();
					break;
			case "sendKeys": 
					By myBy = getElementLocator(keyword, locatorType, locatorValue);
					driver.findElement(myBy).sendKeys(param);
				//	driver.findElement(By.id(locatorValue)).sendKeys(param);
					break;
			case "clearText": 
					driver.findElement(getElementLocator(keyword, locatorType, locatorValue)).clear();
					break;
					
			case "selectComoboxValue": 
				driver.findElement(getElementLocator(keyword, locatorType, locatorValue)).clear();
				break;
					
			case "clearTextAnilsBox":
				driver.findElement(getElementLocator(keyword, locatorType, locatorValue)).clear();
				break;
				
			case "selectMultiValue":
				driver.findElement(getElementLocator(keyword, locatorType, locatorValue)).clear();
				break;
				
			default:
				return By.id(locatorValue);
		
		}
		return null;
		
	}

}
