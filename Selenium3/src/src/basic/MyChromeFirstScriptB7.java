package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyChromeFirstScriptB7 {
	
	
	@Test
	public void test1() throws InterruptedException{
		System.out.println("in test method");
		System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://docs.seleniumhq.org/support/");
		driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_download")).click();
		Thread.sleep(5000);
		try{
			driver.findElement(By.xpath("//a[@title='XXXTechnical references and guides']"));
		}catch(Exception e){
			Assert.assertTrue(false,"Documentaion tab missing");
		}
		System.out.println("rest of the code");
		
	}
	
	
	
	

}
