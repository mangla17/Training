package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyBasicForm {
	
	
	@Test
	public void testMethod1() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
//		//textbox
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Netra");
//		Thread.sleep(4000);
//		//textarea
//		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune");
//		Thread.sleep(4000);
		
//		driver.findElement(By.xpath("//div/select[@id='countries']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div/select[@id='countries']/option[@value='Albania']")).click();
//		Thread.sleep(5000);
//		
//		//select combobox
//		Thread.sleep(2000);
//		Select select=new Select(driver.findElement(By.xpath("//div/select[@id='countries']")));
//		select.selectByVisibleText("Austria");
//		driver.findElement(By.xpath("//input[@id='checkbox1']"));
		
		//Checkbox
		checkboxAction(driver, true, "//input[@id='checkbox1']");
		checkboxAction(driver, false, "//input[@id='checkbox2']");
		checkboxAction(driver, true, "//input[@id='checkbox3']");
		driver.close();
		driver.quit();
	}
	
	
	private void checkboxAction(WebDriver driver, boolean b, String xpath){
		boolean userInput= b;
		boolean existingState = driver.findElement(By.xpath(xpath)).isSelected();
		if(userInput){
			if(existingState){
				System.out.println("already checked");
			}else{
				driver.findElement(By.xpath(xpath)).click();
			}
		}
		
		if(!userInput){
			if(existingState){
				driver.findElement(By.xpath(xpath)).click();
			}else{
				System.out.println("already unchecked");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void testMethod1() throws InterruptedException{
//		System.out.println("My fist script");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		driver.manage().window().maximize();
//		//textbox
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Astha");
//		Thread.sleep(4000);
//		//textarea
//		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune");
//		Thread.sleep(4000);
//		//Checkbox
//		boolean userInput= false;
//		boolean existingState = driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected();
//		if(userInput){
//			if(existingState){
//				System.out.println("already checked");
//			}else{
//				driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
//			}
//		}
//		
//		if(!userInput){
//			if(existingState){
//				driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
//			}else{
//				System.out.println("already unchecked");
//			}
//		}
//		
//		//select combobox
//		Select select=new Select(driver.findElement(By.xpath("//div/select[@id='countries']")));
//		select.selectByVisibleText("Austria");
//		
//		//button
//		driver.findElement(By.xpath("//button[@id='Button1']")).click();
//	}
}
