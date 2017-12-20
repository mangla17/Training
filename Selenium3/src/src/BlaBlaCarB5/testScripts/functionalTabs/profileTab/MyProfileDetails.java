package BlaBlaCarB5.testScripts.functionalTabs.profileTab;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BlaBlaCarB5.applicationLib.common.LoginPage;
import BlaBlaCarB5.applicationLib.tabs.dashboard.DashboardPage;
import BlaBlaCarB5.applicationLib.tabs.profile.ProfileTabPersonalInfoPage;
import datadriven.ReadExcelSheet;

public class MyProfileDetails {
	WebDriver driver;
	String excelPath ="";
	@Test
	public void verifyMyProfileDetailsUI(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.blablacar.in/register");
		
		LoginPage login = new LoginPage();
		login.loginBasicDetails(driver, "userName", "pwd");
		
		
		ProfileTabPersonalInfoPage profileInfo= new ProfileTabPersonalInfoPage();
		profileInfo.clickOk(driver);
		
		DashboardPage dashPage= new DashboardPage();
		profileInfo.clickOk(driver);
		
	}
	
	@DataProvider(name="MyDataProvider")
	public Object[][] getData() throws InvalidFormatException, IOException{
		ReadExcelSheet excelObj = new ReadExcelSheet(excelPath);
		int rowCount = excelObj.getRowCount(0);
		Object[][] data = new Object[rowCount][2];
		
		for(int i=0;i<rowCount;i++ ){
			data[i][0]=excelObj.getCellData(0,i, 0);
			data[i][1]=excelObj.getCellData(0,i, 1);
		}
		return data;
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
