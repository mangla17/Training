package basic;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



public class MyChromeDriverExtension {
	
	@Test
	public void chromeTest() throws InterruptedException{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches",  
				Arrays.asList("--disable-extensions"));
		
		System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://google.com");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
