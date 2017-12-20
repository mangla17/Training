package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MySeleniumGoogle1 {
	
	
	String projectTabLoc = "//a[@title='Selenium Projects']";
	String docTabLoc ="//a[@title='Technical references and guides']";
	
	
	@Test
	public void myMethod1() throws InterruptedException{
		
		System.out.println("Starting my script");
		Reporter.log("Starting my script");
		String expTab1Name = "Projects1";
		
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.get("http://www.seleniumhq.org/");
		System.out.println("Launching web");
		Reporter.log("Launching web");
		Thread.sleep(5000);
		System.out.println("Click on Project");
		Reporter.log("Click on Project");
		ffDriver.findElement(By.xpath(projectTabLoc)).click();
		
		Thread.sleep(5000);
		System.out.println("Get Project text");
		Reporter.log("Get Project text");
		String actTabName = ffDriver.findElement(By.xpath(projectTabLoc)).getText();
		boolean result = expTab1Name.equals(actTabName);
		Assert.assertTrue(result);
		
		System.out.println("Click on Documentaion");
		ffDriver.findElement(By.xpath("docTabLoc")).click();
		Thread.sleep(5000);
		
		boolean result1=true;
		try{
			ffDriver.findElement(By.xpath("//a[contains(text(),'Selenium Documentation')]"));
			
		}catch(Exception obj){
			result1=false;
		}
		System.out.println("VErify link");
		Assert.assertTrue(result1, "Link not present");
		Thread.sleep(5000);
		
		ffDriver.findElement(By.id("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		System.out.println("Exit");
		Reporter.log("Exit");
		
		
		
	}
	
	
	

}
