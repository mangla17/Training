package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//An explicit waits is code you define to wait for a certain condition to 
//occur before proceeding further in the code.
public class MyExplicitWait {
	
	@Test
	public void test(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		WebElement myElement = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated
						(By.xpath("//input[@class='gsfizzzz']")));
		
//		myElement.
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.withMessage("I am waiting");1111
//		driver.findElement(By.xpath("//input[@class='gsfi']"));
		
		
	}

}
