package BlaBlaCarProjectB4.appData.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage extends BasePage{
	
	String locUserName = "//xpath";
	String locUserPwd = "//xpath";
	String locLoginBtn = "//xpath";
	
	
	public void enterUserName(WebDriver driver,String userName){
		Reporter.log("Entering user name"+userName);
		driver.findElement(By.xpath(locUserName)).sendKeys(userName);
	}
	
	public void enterUserPwd(WebDriver driver,String userpwd){
		//driver.fi
	}
	
	public void clickLoginButton(){
		//driver.fi
	}
	
	
	public boolean isUserNameTexboxPresent(String userName){
		//provide try catch block
		return false;
	}
	
	public void loginTest(WebDriver driver, String userName, String userpwd){
		
		LoginPage page = new LoginPage();
		page.enterUserName(driver, userName);
		page.enterUserPwd(driver, userpwd);
		page.clickLoginButton();
	}
	
	

}
