package BlaBlaCarB6.tests.profile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BlaBlaCarB6.appdata.common.LoginPage;
import BlaBlaCarB6.appdata.tab.dashboard.DashboardPage;
import BlaBlaCarB6.appdata.tab.profile.ProfilePage;
import BlaBlaCarB6.utilites.PropertiesOperation;

public class VerifyAllFiledsOfProfilePage {
	
	
	@Test
	public void testProfilePage(){
		try{
				WebDriver driver = new FirefoxDriver();
				
				
				
				
				PropertiesOperation obj = new PropertiesOperation();
				String blablaCarURL =obj.getRadicalValueBykey("hostURL");
				String user1 =obj.getRadicalValueBykey("user1");
				driver.get(blablaCarURL);
				
				LoginPage login = new LoginPage();
				login.loginTest(driver, "", "", "error message");
				login.loginTest(driver, "", "", null);
				
				ProfilePage profPage = new ProfilePage();
				profPage.clickOkButton(driver);
				
				DashboardPage dashObj = new DashboardPage();
				dashObj.clickOkButton(driver);
		
		}catch(Exception e){
			//take screen shot.
		}
		
	}
	
	
	@DataProvider(name="anilsdata")
	public Object[][] getData(){
		
		
		
		return null;
		
	}

}
