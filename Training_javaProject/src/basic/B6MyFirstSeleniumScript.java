package basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B6MyFirstSeleniumScript {
	
	@Test
	public void testMethod1() throws InterruptedException{
		System.out.println("My fist script");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/");
		driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("menu_support")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("radical");;
		Thread.sleep(4000);
		try{
			driver.findElement(By.id("info"));
		}catch (Exception e ){
			System.out.println("Radical info tab missing");
			//Assert.assertTrue(false);
		}
		String tabText =driver.findElement(By.xpath("//a[@title='Technical references and guides']")).getText();
		Assert.assertEquals(tabText, "Doc");
		boolean tabExistResult =tabText.equals("Doc");
		Assert.assertTrue(tabExistResult);
		
		
		
		//a[@title='Selenium Projects']
	}
	
	

}
