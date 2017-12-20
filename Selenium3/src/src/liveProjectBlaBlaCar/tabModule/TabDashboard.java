package liveProjectBlaBlaCar.tabModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import liveProjectBlaBlaCar.common.BasePage;

public class TabDashboard extends BasePage{
	
	
	String dashboarTabLoc= "";
	String addYourPhotoLinkLoc= "";
	
	public void clickDashboardTab(WebDriver driver){
		driver.findElement(By.xpath(dashboarTabLoc)).click();
		Reporter.log("clicking on Dashoard tab");
	}
	
	public boolean isAddyourPhotoLinkPresent(WebDriver driver){
		Reporter.log("In Verification method");
		boolean state =false;
		
		try{
			driver.findElement(By.xpath(addYourPhotoLinkLoc));
		}catch(Exception e){
			state= true;
		}
		
		if(state){
			System.out.println("");
		}else{
			driver.findElement(By.xpath(addYourPhotoLinkLoc)).click();
		}
		return state;
		
	}

}
