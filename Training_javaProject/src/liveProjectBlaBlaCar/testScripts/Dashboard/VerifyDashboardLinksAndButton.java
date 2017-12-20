package liveProjectBlaBlaCar.testScripts.Dashboard;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import liveProjectBlaBlaCar.common.TopBarPage;
import liveProjectBlaBlaCar.common.loginPage;
import liveProjectBlaBlaCar.tabModule.TabDashboard;

public class VerifyDashboardLinksAndButton {
	
	@Test
	public void verifyDashboardLinksAndButtonTest(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.blablacar.in/register");
		
		loginPage logPage = new loginPage();
		logPage.clickLoginButton(driver);
		logPage.enterLoginName(driver, "user");
		logPage.enterLoginPassword(driver, "passwor");
		logPage.clickLoginButton(driver);
		Reporter.log("Loging completed");
		
		TopBarPage topBar = new TopBarPage();
		topBar.clickMessageIcon(driver);
		
		TabDashboard tabDash = new TabDashboard();
		tabDash.clickDashboardTab(driver);
		
		boolean photLinkResult = tabDash.isAddyourPhotoLinkPresent(driver);
		
		Assert.assertTrue("Photo link not present",photLinkResult);
				
		
	}

}
