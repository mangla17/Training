package advancedPOC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyJavaScript {
	
	
	WebDriver driver;
	@Test
	public void test() throws InterruptedException, IOException{
		
	
			driver = new FirefoxDriver();
//			driver.get("https://demos.telerik.com/aspnet-ajax/button/examples/overview/defaultvb.aspx");
//			Thread.sleep(4000);
//			driver.manage().window().maximize();
//			
//			JavascriptExecutor js = null;
//			if (driver instanceof JavascriptExecutor) {
//			    js = (JavascriptExecutor)driver;
//			} // else throw...
//
//			// later on...
//			js.executeScript("return document.getElementById('ctl00_ContentPlaceholder1_btnStandard');");
//			
				
			//Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("http://demo.guru99.com/V4/");			
	        		
	        WebElement button =driver.findElement(By.name("btnLogin"));			
	        		
	        //Login to Guru99 		
	        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
	        driver.findElement(By.name("password")).sendKeys("amUpenu");					
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", button);
			
			
			
			
			
			
			
	}

}
