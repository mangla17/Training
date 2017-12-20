package MyBlaBlaCarB3.AppData.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import MyBlaBlaCarB3.AppData.common.TabCommonPage;

public class DashobardPage extends TabCommonPage{
	
	DashobardPage obj = new DashobardPage();
	
	String editProfileLinkxpath = "";
	
	
	public void clickDashboardTab(){
		obj.clickTab("xpath");;
	}
	
	public boolean isLinkPresent(WebDriver driver,String linkName){
		//tryCatc to checck code for element preesent
		return false;
	}
	
	public void clickEditYourProfileLink(WebDriver driver){
		driver.findElement(By.xpath(editProfileLinkxpath)).click();;
	}
	
	public boolean isEditYourProfileLinkPresent(WebDriver driver){
		//tryCatc to checck code for element preesent
		//driver.findElement(By.xpath(editProfileLinkxpath)).click();;
		return true;
		//return false;
	}

}
