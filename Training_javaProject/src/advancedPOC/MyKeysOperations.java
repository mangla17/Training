package advancedPOC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyKeysOperations {
	
	
	@Test
	public void test(){
		WebDriver driver = new FirefoxDriver();
		WebElement webElement = driver.findElement(By.xpath("my xpath"));
		webElement.sendKeys(Keys.TAB);
		webElement.sendKeys(Keys.ENTER);
	}

}
