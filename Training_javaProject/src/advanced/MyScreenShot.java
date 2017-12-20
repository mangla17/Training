package advanced;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyScreenShot {
	@Test
	public void test() throws IOException, InterruptedException{
		WebDriver driver = new FirefoxDriver();
		boolean result = true;
		try{
			driver.get("http://www.google.com");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@id='lst-ib1xxx']"));
		}catch(Exception e){
			TakesScreenshot obj =  (TakesScreenshot) driver;
			File srcFile=  obj.getScreenshotAs(OutputType.FILE);
			String title = driver.getTitle();
			String myTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
					.format(Calendar.getInstance().getTime());
			FileUtils.copyFile(srcFile, 
					new File("C:\\test1\\"+title+"_"+myTimeStamp+".png"));
			//error = "scripts failed";
			result =false;
		}
		Assert.assertTrue(result);
		driver.close();
		driver.quit();
		
		//driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("search text");
		
		//driver.quit();
		
		
		
		//File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File("C:\\test\\googleError2"+"myTimeStamp"+".png"));
//		driver.close();
//		Thread.sleep(3000);
		
		
//		TakesScreenshot a = (TakesScreenshot) driver;
//		a.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("C:\\test\\googleError.png"));
		
		
	}

}
