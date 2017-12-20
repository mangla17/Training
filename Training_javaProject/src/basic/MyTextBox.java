package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTextBox {
	
	@Test
	public static void test() throws InterruptedException{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demos.telerik.com/aspnet-ajax/textbox/overview/defaultvb.aspx");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Enter username']")).sendKeys("My user Name");
		Thread.sleep(4000);
		driver.close();
		driver.quit();
	}
}
