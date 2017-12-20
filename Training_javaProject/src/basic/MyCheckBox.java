package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyCheckBox {
	
	@Test
	public void myTest() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/checkbox/overview/defaultvb.aspx");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button/span[@class='rbText rbToggleCheckboxChecked']"));
		boolean userInput = true;
		
		boolean state =false;
		try{
			driver.findElement(By.xpath("//button/span[@class='rbText p-i-checkbox rbToggleCheckbox']"));
		}catch(Exception e){
			state= true;
		}
	    //if user wants to check the checkbox
		if(userInput){
			if(state){
				System.out.println("Already checked");
			}else{
				driver.findElement(By.xpath("//button/span[@class='rbText p-i-checkbox rbToggleCheckbox']")).click();
			}
		}
		//if user wants to uncheck the checkbox
		if(!userInput){
			if(state){
				driver.findElement(By.xpath("//button/span[@class='rbText p-i-checkbox-checked rbToggleCheckboxChecked']")).click();
			}else{
				System.out.println("Already unchecked");
			}
			
		}
		
		
		
		
		Thread.sleep(4000);
		driver.close();
		driver.quit();
	}
	
//	@Test
//	public void myTest() throws InterruptedException{
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://demos.telerik.com/aspnet-ajax/checkbox/overview/defaultvb.aspx");
//		Thread.sleep(4000);
//		driver.manage().window().maximize();
//		Thread.sleep(10000);
//		//driver.findElement(By.xpath("//button/span[@class='rbIcon rbToggleCheckboxChecked']"));
//		
//		boolean state =false;
//		
//		try{
//			driver.findElement(By.xpath("//button/span[@class='rbIcon rbToggleCheckbox']"));
//			
//		}catch(Exception e){
//			state= true;
//		}
//		
//		if(state){
//			System.out.println("Already checked");
//		}else{
//			driver.findElement(By.xpath("//button/span[@class='rbIcon rbToggleCheckbox']")).click();
//			
//		}
//		
//		//driver.findElement(By.xpath("//button/span[@class='rbIcon rbToggleCheckboxChecked']")).click();
//		Thread.sleep(4000);
//		driver.close();
//		driver.quit();
//	}
	
//	@Test
//	public void myTest() throws InterruptedException{
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://demos.telerik.com/aspnet-ajax/checkbox/overview/defaultvb.aspx");
//		Thread.sleep(4000);
//		driver.manage().window().maximize();
//		Thread.sleep(10000);
//		//driver.findElement(By.xpath("//button/span[@class='rbIcon rbToggleCheckboxChecked']"));
//		
//		boolean state =false;
//		
//		try{
//			driver.findElement(By.xpath("//button/span[@class='rbIcon rbToggleCheckbox']"));
//			
//		}catch(Exception e){
//			state= true;
//		}
//		
//		if(state){
//			System.out.println("Already checked");
//		}else{
//			driver.findElement(By.xpath("//button/span[@class='rbIcon rbToggleCheckbox']")).click();
//			
//		}
//		
//		//driver.findElement(By.xpath("//button/span[@class='rbIcon rbToggleCheckboxChecked']")).click();
//		Thread.sleep(4000);
//		driver.close();
//		driver.quit();
//	}

}
