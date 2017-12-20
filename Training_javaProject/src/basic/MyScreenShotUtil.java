package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MyScreenShotUtil {
	
	public static void takeAnilsScreenShot(WebDriver driver) throws IOException{
		TakesScreenshot a = (TakesScreenshot) driver;
		File srcFile=  a.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\test1\\googleError2"+"myTimeStamp"+".png"));
		driver.quit();
	}

}
