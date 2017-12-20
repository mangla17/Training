package BlaBlaCarProjectB4.testScripts.tabs.dashboardTab;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BlaBlaCarProjectB4.appData.common.CapArea;
import BlaBlaCarProjectB4.appData.common.LoginPage;
import BlaBlaCarProjectB4.appData.objectRepoCommon.CommonObjectRepository;
import BlaBlaCarProjectB4.appData.tabs.dashboard.DashboardPage;
import datadriven.ReadExcelSheet;

public class VerifyEditYourProfileLink {
	String excelPath = "";
	
	@Test(dataProvider="MyDataProvider")
	public void VerifyEditYourProfileLinkTest(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.blablacar.in/register");
		
		LoginPage loginObj= new LoginPage();
		loginObj.loginTest(driver, "Anil", "pwd");
		
		loginObj.clickMyOk();
		
		
		CapArea cap = new CapArea();
		cap.clickTabOptions("Dashboard");
		
		DashboardPage dashPage = new DashboardPage();
		boolean result = dashPage.isDashboardTabPresent();
		Assert.assertTrue(result);
		
		dashPage.clickMyOk();
		
		
		
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
	
	

}
