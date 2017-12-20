package BlaBlaCarB5.testScripts.functionalTabs.profileTab;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BlaBlaCarB5.applicationLib.common.LoginPage;
import datadriven.ReadExcelSheet;

public class EditExistingProfileInfo {
	WebDriver driver;
	String excelPath ="";
	@Test
	public void verifyMyProfileDetailsUI(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.blablacar.in/register");
		
		LoginPage login = new LoginPage();
		login.enterUserName(driver, "");
		
		login.enterPWD(driver, "");
		login.clickLoginButton(driver);
		
		
		
		
		
		
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
