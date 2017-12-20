package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyiFrame {
	
	@Test
	public void test() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe1");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).click(); 
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span/span/span[contains(text(),'HOME')]")).click();
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		
		
	}

}
