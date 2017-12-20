package basic1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstSeleniumScriptB5 {
	
	@Test
	public void method() throws InterruptedException{
		
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("http://docs.seleniumhq.org/projects/");
		System.out.println("start end");
		ffdriver.findElement(By.xpath("//li[@id='menu_about']/a")).click();
		Thread.sleep(5000);
//		ffdriver.findElement(By.xpath("//li[@id='menu_about']/a")).click();
//		Thread.sleep(5000);
		System.out.println("script end");
		Assert.assertTrue(false,"tab missing");
		
	
		boolean result = false;
		try{
			
			ffdriver.findElement(By.xpath("//a[@title='Selenium ProjectXXX']"));
			result=true;
			System.out.println("Passed : Project tab present");
			
		}catch(Exception e ){
			System.out.println("Failed : tab missing");
		}
		Assert.assertTrue(result);
	}
	
	
}
