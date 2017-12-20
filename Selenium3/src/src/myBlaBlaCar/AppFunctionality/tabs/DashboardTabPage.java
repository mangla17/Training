package myBlaBlaCar.AppFunctionality.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import myBlaBlaCar.AppFunctionality.BaseTabPage;

public class DashboardTabPage extends BaseTabPage{
	String seeAllMsgsLoc = "";
	String seeAllMsgsLoc1 = "";
	String seeAllMsgsLoc2 = "";
	String seeAllMsgsLoc3 = "";
	String seeAllMsgsLoc4 = "";
	
	
	public void clickSeeAllMessagesLink(WebDriver driver){
		Reporter.log("clicking on Messageling");
		driver.findElement(By.xpath(seeAllMsgsLoc)).click();
	}

}
