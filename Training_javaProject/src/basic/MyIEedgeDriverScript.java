package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyIEedgeDriverScript {
	
	@Test
	public void myMethod() throws InterruptedException{
//		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//		 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		System.setProperty("webdriver.edge.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Selenium IDE");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Selenium IDE Plugins')]")).click();
		Thread.sleep(5000);
		
		String actProjectString = driver.findElement(By.xpath("//a[@title='Selenium Projects']")).getText();
		String myExpProjectString = "Projects";
		
		boolean result = actProjectString.equals(myExpProjectString);
		
		Assert.assertTrue(result,"Project string not matching");
		
	
		driver.quit();
	}


}
