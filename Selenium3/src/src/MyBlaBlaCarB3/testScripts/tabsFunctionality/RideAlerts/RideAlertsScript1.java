package MyBlaBlaCarB3.testScripts.tabsFunctionality.RideAlerts;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import MyBlaBlaCarB3.AppData.common.loginPage;
import MyBlaBlaCarB3.AppData.tabs.DashobardPage;
import MyBlaBlaCarB3.AppData.tabs.RideAlertPage;

public class RideAlertsScript1 {
	
	
	@Test
	public void myFirstDashboarScript(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.blablacar.in/register");
		
		loginPage logPage = new loginPage();
		logPage.clickLoginButton(driver);
		logPage.enterLoginName(driver, "user");
		logPage.enterLoginPassword(driver, "passwor");
		logPage.clickLoginButton(driver);
		Reporter.log("Loging completed");
		
		RideAlertPage ride= new RideAlertPage();
		ride.clickOkButton(driver);
		
		}
	

}
