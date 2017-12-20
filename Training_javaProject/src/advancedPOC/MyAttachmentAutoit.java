package advancedPOC;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyAttachmentAutoit {
	
	@Test
	public void addAttachment() throws InterruptedException, AWTException, IOException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.2shared.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.id("upField")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\TrainingContent\\SeleniumJars_Software\\AutoitFileUpload.exe");
		Thread.sleep(5000);

	}

}
