package blablacarB7.appLib.appflows;

import org.openqa.selenium.WebDriver;

import blablacarB7.appLib.pomlib.tabs.ProfilePersonalInfoPage;

public class ProfileTabFlows {
	
	
	
	public void provideUserProfileInfo(WebDriver driver, String s, String s1, String s2){
		ProfilePersonalInfoPage obj = new ProfilePersonalInfoPage();
		obj.enterFirstName(driver, s1);
		obj.enterLastName(driver, s2);
	}

}
