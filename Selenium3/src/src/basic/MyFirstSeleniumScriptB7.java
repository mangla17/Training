package basic;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScriptB7 {
	
	@Test
	public void test1() throws InterruptedException{
		System.out.println("in test method");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/support/");
		driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		Thread.sleep(5000);
		try{
			driver.findElement(By.xpath("//a[@title='XXXTechnical references and guides']"));
		}catch(Exception e){
			Assert.assertTrue(false,"Documentaion tab missing");
		}
		System.out.println("rest of the code");
		
	}
	
	

}
