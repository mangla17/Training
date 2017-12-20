package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyListBox {
	
	@Test
	public void test() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//find USA
//		driver.findElement(By.xpath("//ul[@class='rlbList']/li[contains(text(),'Canada')]")).click();;;
//		driver.findElement(By.xpath("//ul/li/button[@title='To Right']")).click();
		String xpathCon = getXpathForCountry("Canada");
		driver.findElement(By.xpath(xpathCon)).click();
		driver.findElement(By.xpath("//ul/li/button[@title='To Right']")).click();
		
		String xpathCon1 = getXpathForCountry("China");
		driver.findElement(By.xpath(xpathCon1)).click();
		driver.findElement(By.xpath("//ul/li/button[@title='To Right']")).click();
		
	}
	
	public String getXpathForCountry(String countryName){
		return "//ul[@class='rlbList']/li[contains(text(),'"+countryName+"')]";
	}
		
		
		
		
//		//Selecting selection list using loop
//		int i=0;
//		String [] arr={"Mexico","Chile","Canada"};
//		while(i<3)
//		{
//			driver.findElement(By.xpath("//ul[@class='rlbList']/li[contains(text(),'"+arr[i]+"')]")).click();
//			driver.findElement(By.xpath("//ul/li/button[@title='To Right']")).click();
//			i++;
//		}
//		driver.quit();
	}
	
//	private String getContryLocatior(String contryName){
//		String mycontry = "//ul/li[contains(text(),'"+contryName+"')]";
//		return mycontry;
//	}


