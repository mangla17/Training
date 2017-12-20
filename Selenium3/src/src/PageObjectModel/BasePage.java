package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	
	public void clickLink(WebDriver driver, String locator){
		driver.findElement(By.xpath(locator)).click();
	}
	
	
	public void clickButton(WebDriver driver, String locator){
		driver.findElement(By.xpath(locator)).click();
	}

}
