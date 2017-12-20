package blablacarB7.test.profiletab;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import blablacarB7.appLib.appflows.LoginFlows;
import blablacarB7.appLib.appflows.ProfileTabFlows;
import blablacarB7.appLib.pomlib.common.LoginPage;
import blablacarB7.utilities.PropertiesOperation;

public class VerifyMandatoryFieldOfUser {
	
	
	
	@Test
	public void testMethod1(){
		
		String name= "Ananad";
		String pwd = "pwd";
		
		PropertiesOperation pro = new PropertiesOperation();
		String url = pro.getRadicalValueBykey("hostURL");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		LoginFlows loginFlow= new LoginFlows();
		loginFlow.loginToApplication(driver, name, pwd);
		
		//navigation flow code
		
		ProfileTabFlows profFlow=new  ProfileTabFlows();
		profFlow.provideUserProfileInfo(driver, "s", "s1", "s2");
		
		
		
	}

}
