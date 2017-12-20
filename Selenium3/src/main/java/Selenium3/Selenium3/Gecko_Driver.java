package Selenium3.Selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Gecko_Driver {

//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","D://Mangla//Tools//geckodriver-v0.16.1-win64//geckodriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new FirefoxDriver(capabilities);
//		driver.get("http://www.toolsqa.com");
// 
//		Thread.sleep(5000);
//		driver.quit();
//	}
	
	@Test
	public void testGecko() throws Exception{
		System.setProperty("webdriver.gecko.driver","D://Mangla//setups//geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.toolsqa.com");
 
		Thread.sleep(5000);
		driver.quit();
	}
}
