package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyChromeDriverTest {
	
	@Test
	public void chromeTest() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
		
		
		driver.get("http://docs.seleniumhq.org/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Technical references and guides']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("q")).sendKeys("Selenium");
		Thread.sleep(4000);
		
		boolean result = false;
		try{
			driver.findElement(By.xpath("//a[@title='Selenium Projectswqwqwqw']"));
			result=true;
			
		}catch(Exception e ){
			System.out.println("tab missing");
		}
		
		Assert.assertTrue(result,"Failed : tab missing");
		driver.quit();
	}

}
