package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript {
	
	

	@Test(priority=1)
	public void myScript1() throws InterruptedException{
		Reporter.log("test ng log");
		WebDriver ffdriver = new FirefoxDriver();
		Reporter.log("creating ff driver");
		ffdriver.get("http://docs.seleniumhq.org/");
		Thread.sleep(5000);
		Reporter.log("Clicking on Project tab");
		ffdriver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		Thread.sleep(4000);
		Reporter.log("Clicking on Download tab");
		ffdriver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		Thread.sleep(4000);
		Reporter.log("Clicking on Documentation tab");
		ffdriver.findElement(By.xpath("//a[@title='Technical references and guides']")).click();
		Thread.sleep(4000);
		Reporter.log("enter search string");
		ffdriver.findElement(By.id("q")).sendKeys("Selenium");
		Thread.sleep(4000);
		Reporter.log("verifying on project tab");
		boolean result = false;
		try{
			
			ffdriver.findElement(By.xpath("//a[@title='Selenium Project']"));
			result=true;
			Reporter.log("Passed : Project tab present");
			
		}catch(Exception e ){
			System.out.println("Failed : tab missing");
		}
		Assert.assertTrue(result,"Failed : tab missing");
		Reporter.log("Test successful");
		
		
		//ffdriver.quit();
	}
	
	
	@Test(priority=2)
	public void myScript2() throws InterruptedException{
		Reporter.log("test2 ng log");
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("http://docs.seleniumhq.org/");
		Thread.sleep(5000);
		ffdriver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		Thread.sleep(4000);
		ffdriver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		Thread.sleep(4000);
		ffdriver.findElement(By.xpath("//a[@title='Technical references and guides']")).click();
		Thread.sleep(4000);
		ffdriver.findElement(By.id("q")).sendKeys("Selenium");
		Thread.sleep(4000);
		
		boolean result = false;
		try{
			ffdriver.findElement(By.xpath("//a[@title='Selenium Projects']"));
			result=true;
			
		}catch(Exception e ){
			System.out.println("tab missing");
		}
		
		Assert.assertTrue(result,"Failed : tab missing");
		
		
		
		//ffdriver.quit();
	}
	
	

}
