package liveProjectBlaBlaCar.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class loginPage extends BasePage{
	String loginButtonLoc ="//a[contains(text(),'Login')]";
	
	String loginTextBoxLoc ="//input[@id='email']";
	String passTextBoxLoc ="//input[@id='email']";
	String okLoc ="";
	
	public void enterLoginName(WebDriver driver, String value){
		Reporter.log("enter loggin name");
		driver.findElement(By.xpath(loginTextBoxLoc)).sendKeys(value);
		
	}
	
	public void enterLoginPassword(WebDriver driver,String value){
		driver.findElement(By.xpath(passTextBoxLoc)).sendKeys(value);
	}
	
	public void clickLoginButton(WebDriver driver){
		driver.findElement(By.xpath(loginButtonLoc)).click();
	}

}
