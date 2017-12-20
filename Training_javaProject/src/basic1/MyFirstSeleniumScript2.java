package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript2 {
	
	WebDriver ffdriver;
	
	@BeforeClass
	public void  mySetup(){
		System.out.println("in setup");
		ffdriver = new FirefoxDriver();
	}
	

	@Test
	public void myScript1() throws InterruptedException{
		
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
			ffdriver.findElement(By.xpath("//a[@title='Selenium Project']"));
			result=true;
			
		}catch(Exception e ){
			System.out.println("tab missing");
		}
		Assert.assertTrue(result,"Failed : tab missing");

	}
	
	@Test
	public void myScript2() throws InterruptedException{
		
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
			ffdriver.findElement(By.xpath("//a[@title='Selenium Project']"));
			result=true;
			
		}catch(Exception e ){
			System.out.println("tab missing");
		}
		Assert.assertTrue(result,"Failed : tab missing");
		
		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("In tear donw");
		ffdriver.quit();
		
	}
	
		
	

}
