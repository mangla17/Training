


package advancedPOC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyActionTest {
	
	
	@Test
	public void myActionTest() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//Actions actions = new Actions(driver);
		
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		
		Actions myAction=new Actions(driver);
		
		Actions moreActions = myAction
				.moveToElement(emailTxtBox)
				.click()
		        .keyDown(emailTxtBox,Keys.SHIFT)
		           .sendKeys(emailTxtBox,"selenium");
		
		moreActions.build().perform();
		
		
		
		
		
		
		
		
//		WebElement emailTxtBox = driver.findElement(By.id("email"));
//		actions.sendKeys("myEmailId");
//		
//		actions.build().perform();
		
		
	}

}
