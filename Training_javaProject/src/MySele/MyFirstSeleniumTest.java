package MySele;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest {
	
	@Test
	public void test1() throws InterruptedException{
		System.out.println("i ma in test 1");
		Reporter.log("i ma in test 1");
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("http://google.com");
		ffdriver.manage().window().maximize();
		ffdriver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
		try{
			ffdriver.findElement(By.xpath("//input[@class='radical']"));
		}
		catch(Exception e){
			Assert.assertTrue("my assertion failed",false);
		}
		
			Thread.sleep(10);
	}
//	
//	@Test
//	public void test2() throws InterruptedException{
//		System.out.println("i ma in test 1");
//		WebDriver ffdriver = new FirefoxDriver();
//		ffdriver.get("http://google.com");
//		ffdriver.manage().window().maximize();
//		ffdriver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
//		try{
//			ffdriver.findElement(By.xpath("//input[@class='radical']"));
//		}
//		catch(Exception e){
//			Assert.assertTrue("my assertion failed",false);
//		}
//		
//			Thread.sleep(10);
//	}
//	
//	@Test
//	public void test3() throws InterruptedException{
//		System.out.println("i ma in test 1");
//		WebDriver ffdriver = new FirefoxDriver();
//		ffdriver.get("http://google.com");
//		ffdriver.manage().window().maximize();
//		ffdriver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
//		try{
//			ffdriver.findElement(By.xpath("//input[@class='radical']"));
//		}
//		catch(Exception e){
//			Assert.assertTrue("my assertion failed",false);
//		}
//		
//			Thread.sleep(10);
//	}

}
