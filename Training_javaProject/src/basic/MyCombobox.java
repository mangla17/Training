package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyCombobox {
	
	String comboboxDropdownICON = "//div[contains(@id,'RadComboBoxRegion')]//button[@class='rcbActionButton']/span[1]";
	//String comboboxOption = "//div[@id='ctl00_ContentPlaceholder1_RadComboBoxRegion_DropDown']//ul/li[contains(text(),'Austin')]";
	
	
	public String getXpathForRegin(String reginName){
		return "//div/ul/li[contains(text(),'"+reginName+"')]";
	}
	
	@Test
	public void test() throws InterruptedException{
		Reporter.log("starting script");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/combobox/examples/overview/defaultvb.aspx");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button/span[@id='ctl00_ContentPlaceholder1_RadComboBoxRegion_Arrow']")).click();
		Thread.sleep(4000);
		
		String reginXpath = getXpathForRegin("Boston");
		driver.findElement(By.xpath(reginXpath)).click();
		
		
	
//		driver.findElement(By.xpath(comboboxDropdownICON)).click();
//		Thread.sleep(5000);
//		MyCombobox obj = new MyCombobox();
//		String regionLoc = obj.getRegionLocator("Bedford");
//		driver.findElement(By.xpath(regionLoc)).click();
//		Thread.sleep(4000);
//		driver.close();
//		driver.quit();
//		Reporter.log("starting ends");
	}
	
	
	private String getRegionLocator(String regionName){
		String locator = "//div[@id='ctl00_ContentPlaceholder1_RadComboBoxRegion_DropDown']//ul/li[contains(text(),'"+regionName+"')]";
		return locator;
	}
	
	
}







