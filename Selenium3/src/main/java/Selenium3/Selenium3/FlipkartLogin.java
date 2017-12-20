package Selenium3.Selenium3;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlipkartLogin {
	WebDriver driver;
	String url = "flipKartURL";

	@BeforeMethod
	public void setDriver() {
		// WebDriver driverl = getDriver(url);
		// this.driver = driverl;
//		 System.setProperty("webdriver.chrome.driver", "D://Mangla//Tools//ChromeDriver//chromedriver.exe");
//
//		 driver = new ChromeDriver();

		
		
		System.setProperty("webdriver.gecko.driver","D://Mangla//Tools//geckodriver-v0.16.1-win64//geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "shopping")
	public void loginFlipkart(Map map) throws Exception {

		String userId = map.get("userId").toString();
		String phoneNumber = map.get("phoneNumber").toString();
		String password = map.get("password").toString();

		System.out.println("Flipkart is opened");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//span[text()='Appliances']")).click();
		// jsclick(driver.findElement(By.xpath("//a[text()='Log In']")));
		// SeleniumUtility.waitForPageToLoad(driver);
		//SeleniumUtility.waitForElement(driver, "//a[text()='Log In']");
//		driver.findElement(By.xpath("//a[text()='Log In']")).click();
//		//SeleniumUtility.waitForElement(driver, "//input[@class='_2zrpKA']");
//		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys(phoneNumber);
//		//SeleniumUtility.enterTextUSingXpath(driver,
//		//		"//input[@class='_2zrpKA']", phoneNumber);
//		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"))
//				.sendKeys(password);
//		Thread.sleep(300);
//		driver.findElement(By.cssSelector("button._1LctnI")).click();

		//SeleniumUtility.waitForPageToLoad(driver);
		System.out.println("done");
		

	}

	@AfterMethod
	public void myTearDown() {
		driver.close(); // close will close current window
		//driver.quit();
	}

	@DataProvider(name = "shopping")
	public Object[][] myDataForShopping() throws Exception {
		Map testDataMap = new HashMap<Object, Object>();
		testDataMap.put("userId", "mangla.chaturvedi17@gmail.com");
		testDataMap.put("phoneNumber", "8888813834");
		testDataMap.put("password", "damnfool");

		Object[][] obj = new Object[1][1];
		obj[0][0] = testDataMap;
		return obj;

	}

}
