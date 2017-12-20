package advancedPOC;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTabChangeTest {
	
	@Test
	public void test1() throws InterruptedException{		
//	System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver = new ChromeDriver();
		
		
		
		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		
//		String baseUrl = "http://www.google.co.uk/";
		driver.get("http://www.google.co.uk/");
//		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		Thread.sleep(6000);
		
		driver.get("https://www.facebook.com/");
	        // considering that there is only one tab opened in that point.
	    String oldTab = driver.getWindowHandle();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
	    Thread.sleep(6000);
		
		
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		//System.out.println(tabs.get(0));
		//System.out.println(tabs.get(1));
		driver.switchTo().window(tabs.get(1)); //switches to new tab
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("user");
		Thread.sleep(4000);
		driver.switchTo().window(tabs.get(0)); // switch back to main screen        
		driver.get("https://www.news.google.com");
		System.out.println(driver.getTitle());
		
		//Set<String> titles= driver.getWindowHandles();
		//for (String string : titles) {
		//	
		//	System.out.println(driver.getTitle());
		//}

}


}
