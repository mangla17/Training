package basic;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class MyPhantumDriver {
	
	//download phantum driver zip file and extract it to program files
	//you can download phantum driver jar and put in class file (this file is available in selenium standalone server)
	
	@Test
	public void test(){
						
        System.setProperty("phantomjs.binary.path", "C:\\Program Files\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");		
        WebDriver driver = new PhantomJSDriver();	
        driver.get("http://www.google.com");         
        WebElement element = driver.findElement(By.name("q"));	
        element.sendKeys("Selenium");					
        element.submit();         			
        System.out.println("Page title is: " + driver.getTitle());		
        driver.quit();	
	}
	

}
