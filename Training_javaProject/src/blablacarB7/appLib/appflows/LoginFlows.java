package blablacarB7.appLib.appflows;

import org.openqa.selenium.WebDriver;

import blablacarB7.appLib.pomlib.common.LoginPage;

public class LoginFlows {
	
	
	public void loginToApplication(WebDriver driver, String name, String pwd){
		LoginPage login = new LoginPage();
		login.enterUserName(driver, name);
		login.enterUserPWD(driver, pwd);
		login.clickLoginButton(driver);
	}

}
