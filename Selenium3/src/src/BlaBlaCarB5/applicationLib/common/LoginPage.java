package BlaBlaCarB5.applicationLib.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	String userNameLoc ="xpath";
	String pwdLoc ="xpath";
	String loginButtonLoc ="xpath";
	
	
	
	
	public void enterUserName(WebDriver driver, String userName){
		driver.findElement(By.xpath(userNameLoc)).sendKeys(userName);
	}
	
	public void enterPWD(WebDriver driver, String pwd){
		driver.findElement(By.xpath(pwdLoc)).sendKeys(pwd);
	}
	
	public void clickLoginButton(WebDriver driver){
		driver.findElement(By.xpath(loginButtonLoc)).click();
	}
	
	public void loginBasicDetails(WebDriver driver, String userName, String pwd){
		enterUserName(driver, userName);
		
		enterPWD(driver, pwd);
		clickLoginButton(driver);
	}

}
