package TestNGExample;


import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class MyBeforeClassB5 {
	WebDriver driver;
	
	
	@Test
	public void myMethod112(){
		System.out.println("In test 1");
		//driver.findElement(By.xpath("")).clear();
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void myMethod21(){
		System.out.println("In test 1");
		//driver.findElement(By.xpath("")).clear();
		Assert.assertTrue(false);
	}
	
	@Test
	public void myMethod35dfdisauf(){
		System.out.println("In test 1");
		//driver.findElement(By.xpath("")).clear();
		Assert.assertTrue(false);
	}
	
	
	
}
