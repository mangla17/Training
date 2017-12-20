package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyCombobox1 {
	
	
	@Test
	public void testMethod() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		Select select=new Select(driver.findElement(By.xpath("//div/select[@id='countries']")));
		select.selectByVisibleText("Austria");
//		select.selectByIndex(0);
//		select.selectByValue("value");
	}

}
