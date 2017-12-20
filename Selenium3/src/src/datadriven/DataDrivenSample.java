package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataDrivenSample {
	
	@Test
	public void testMethod(){
		
		String userName ="user1";
		String pdw = "pwd1";
//		String res = "true";
//		String homePage = "true";
//		String error = "NA";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("");
		driver.findElement(By.xpath("")).sendKeys(userName);
		driver.findElement(By.xpath("")).sendKeys(pdw);
		driver.findElement(By.xpath("")).click();
		
		if(res.equals("true")){
			//verify home page selenium code
		}
		

		
		if(res.equals("true")){
			////verify error code
		}
		
		
	}
	

}
