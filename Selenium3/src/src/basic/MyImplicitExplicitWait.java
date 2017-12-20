package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyImplicitExplicitWait {
	
	@Test
	public void test(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		//whichever wait have higher value that will be taken by script
		WebElement myElement = (new WebDriverWait(driver, 50))
				.until(ExpectedConditions.presenceOfElementLocated
						(By.xpath("//input[@class='gsfi11']")));
		
		//driver.findElement(By.xpath("//input[@class='gsfi11']"));
		System.out.println("Script running");

	}

}



