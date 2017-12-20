package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertAndConfirmation {
	
	@Test
	public static void test() throws InterruptedException{
		
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(4000);
		
		//Alert
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		Alert  myObj = driver.switchTo().alert();
		String s = myObj.getText();
		driver.switchTo().alert().accept();
		System.out.println("===" + s);
		boolean result =s.equals("I am an alert box!");
		Assert.assertTrue(result, "Message alert wrong");
		Thread.sleep(2000);
		
		//Confirmation
		//driver.findElement(By.xpath("//input[@id='btnConfirm']")).click();\
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
		Thread.sleep(2000);
		Alert myConfi = driver.switchTo().alert();
		String s1 = myConfi.getText();
		System.out.println("===" + s1);
		boolean result1 =s1.equals("Press a Button !");
		Assert.assertTrue(result1, "Message confirmation wrong");
		Assert.assertEquals(s1, "Press a Button !xxxxxxxxxxxx");
		myConfi.dismiss();
		
		
		
	}

}
