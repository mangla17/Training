package advancedPOC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTabChange  {
	
	@Test
	public void test1() throws InterruptedException{		

		
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.co.uk/");
		Thread.sleep(4000);
		//open tab
		String tab1 = driver.getTitle();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		Thread.sleep(6000);
		
		driver.get("https://www.facebook.com/");
	    Thread.sleep(6000);
	    String tab2 = driver.getTitle();
	    driver.findElement(By.id("email")).sendKeys("user");
	    Thread.sleep(4000);
	    //switch between tab
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
	    tab1 = driver.getTitle();
		
}


}
