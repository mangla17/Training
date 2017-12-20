package myBlaBlaCar.testScripts.tabs.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import myBlaBlaCar.AppFunctionality.tabs.DashboardTabPage;

public class VerifyLinktestcase1 {
	
	@Test
	public void mytestMethod(){
		
		WebDriver driver = new FirefoxDriver();
		DashboardTabPage dash= new DashboardTabPage();
		dash.clickOk(driver);
		dash.clickSeeAllMessagesLink(driver);
		
		
	}

}
