package blablacarB7.appLib.pomlib.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage extends BasePage{
	
	String userNameLoc_txt= "xpath";
	String userPwdLoc_txt= "xpath";
	String loginLoc_btn= "//div[@id='abc']";
	
	String loginButtonDisableLoca=loginLoc_btn+"/span[@state='disabled']";
	
	
	public void enterUserName(WebDriver driver, String name){
		Reporter.log("entering user name");
		driver.findElement(By.xpath(userNameLoc_txt)).sendKeys(name);
	}
	
	public void enterUserPWD(WebDriver driver, String pwd){
		driver.findElement(By.xpath(userPwdLoc_txt)).sendKeys(pwd);
	}
	
	public void clickLoginButton(WebDriver driver){
		driver.findElement(By.xpath(loginLoc_btn)).click();
	}
	
	
	
	
	
	

}
