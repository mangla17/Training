package basic1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MySeleniumGoogle3 {
	
	WebDriver ffDriver;
	
	@BeforeClass
	public void myBeforeClass(){
		ffDriver = new FirefoxDriver();
		ffDriver.get("http://www.seleniumhq.org/");
	}
	@Test
	public void myMethod1() throws InterruptedException{
		String expTab1Name = "Projects";
		Thread.sleep(5000);
		ffDriver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		Thread.sleep(5000);
		String actTabName = ffDriver.findElement(By.xpath("//a[@title='Selenium Projects']")).getText();
		boolean result = expTab1Name.equals(actTabName);
		Assert.assertTrue(result);
		ffDriver.findElement(By.xpath("//a[@title='Technical references and guides']")).click();
		Thread.sleep(5000);
		boolean result1=true;
		try{
			ffDriver.findElement(By.xpath("//a[contains(text(),'Selenium Documentation')]"));
			
		}catch(Exception obj){
			result1=false;
		}
		Assert.assertTrue(result1, "Link not present");
		Thread.sleep(5000);
		ffDriver.findElement(By.id("q")).sendKeys("Selenium");
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void myAfterClass(){
		ffDriver.quit();
	}
	
	

}
