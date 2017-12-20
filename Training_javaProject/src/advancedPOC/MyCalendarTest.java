package advancedPOC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyCalendarTest {
	
	@Test
	public void test() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/flights");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//div//span[contains(text(),'August')]/../../following-sibling::table//tbody//tr[4]//td//a[contains(text(),'28')]")).click();
		
		
	}

}
