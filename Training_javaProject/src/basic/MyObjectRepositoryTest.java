package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyObjectRepositoryTest {
	
	
	
	
	@Test
	public void testMethod(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("docs.seleniumhq.org");
		
		driver.findElement(By.xpath(MyCentralRepo.projectLoc));
		driver.findElement(By.xpath(MyCentralRepo.downloadLoc));
		driver.findElement(By.xpath(documentationLoc));
		driver.findElement(By.xpath(supportLoc));
		driver.findElement(By.xpath(aboutLoc));
		
	}
	
	@Test
	public void testMethod2(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("docs.seleniumhq.org");
		
		driver.findElement(By.xpath(projectLoc));
		driver.findElement(By.xpath(downloadLoc));
		driver.findElement(By.xpath(documentationLoc));
		driver.findElement(By.xpath(supportLoc));
		driver.findElement(By.xpath(aboutLoc));
		
	}

}
