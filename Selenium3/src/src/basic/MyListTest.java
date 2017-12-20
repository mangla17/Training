package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyListTest {
	
	WebDriver driver;
	private String getContryLocatior(String contryName){
		String mycontry = "//ul/li[contains(text(),'"+contryName+"')]";
		return mycontry;
	}
	@Test
	public void test() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.get("http://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String contryArray[] = {"Canada", "Brazil","China"};
		for (int i = 0; i < contryArray.length; i++) {
			String contryNameXpath =getContryLocatior(contryArray[i]);
			moveToRight(contryNameXpath);
		}
	}
	private void moveToRight(String contryNameXpath ) throws InterruptedException{
		driver.findElement(By.xpath(contryNameXpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='To Right']/span")).click();
		
	}

}
