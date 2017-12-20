package advanced;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class MultipleWindow {
	
	@Test
	public static void testMultipleWindow() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","D:\\Training\\software\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='fbbtnl']")).click();
		Thread.sleep(4000);
		String parentWin = driver.getWindowHandle();
		Set<String> titles= driver.getWindowHandles();
		//LinkedHashSet <String> titles= (LinkedHashSet<String>) driver.getWindowHandles();
		//String getChildWindow;
		for (String abc : titles) {
			WebDriver web = driver.switchTo().window(abc);
			System.out.println(driver.getTitle());
			System.out.println(web.getTitle());
		}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		driver.switchTo().window(parentWin);
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
