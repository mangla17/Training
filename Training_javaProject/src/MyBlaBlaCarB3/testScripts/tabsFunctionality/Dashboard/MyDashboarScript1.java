package MyBlaBlaCarB3.testScripts.tabsFunctionality.Dashboard;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import MyBlaBlaCarB3.AppData.common.loginPage;
import MyBlaBlaCarB3.AppData.tabs.DashobardPage;


public class MyDashboarScript1 {
	
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
		
		DashobardPage obj = new DashobardPage();
		obj.clickDashboardTab();
		boolean result = obj.isLinkPresent(driver, "Dashboard");
		Assert.assertTrue(result);
		boolean linkResult = obj.isEditYourProfileLinkPresent(driver);
		Assert.assertTrue(linkResult);
		
		obj.clickOkButton(driver);
		
		}
	
	
		
	}


