package BlaBlaCarB6.appdata.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import poc.MyLog4jReporting;

public class LoginPage extends BasePage {
	private static Logger log = Logger.getLogger(LoginPage.class.getName());
	
	
	String userNameLoc = "xpath of userName field";
	String userpwdLoc = "xpath of userpwdfield";
	String loginBtnLoc = "xpath of login button";
	
	
	
	public void enterUserName(WebDriver driver, String userName){
		Reporter.log("entering user name ");
		log.info("entering user name");
		driver.findElement(By.xpath(userNameLoc)).sendKeys(userName);
	}
	
	public String getUserName(WebDriver driver, String userName){
		Reporter.log("entering pwd ");
		return driver.findElement(By.xpath(userNameLoc)).getText();
	}
	
	public void enterUserPwd(WebDriver driver, String userpwd){
		driver.findElement(By.xpath(userpwdLoc)).sendKeys(userpwd);
	}
	
	public void clickLoginButton(WebDriver driver){
		driver.findElement(By.xpath(loginBtnLoc)).click();
	}
	
	
	public void loginTest(WebDriver driver, String userName, String userpwd, String errorMessage){
		enterUserName(driver, userName);
		enterUserPwd(driver, userpwd);
		clickLoginButton(driver);
		if(errorMessage!=null){
			//fail
		}else{
			
		}
		
	}
	

}
