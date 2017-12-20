package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyCheckBox1 {
	
	
	@Test
	public void testMethod() throws InterruptedException{
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		boolean userInput = true;
		
		boolean  actualState= driver.findElement(By.id("checkbox1")).isSelected();
		
		//if user wants to check the checkbox
		if(userInput){
			if(actualState){
				System.out.println("Already checked");
			}else{
				driver.findElement(By.id("checkbox1")).click();;
			}
		}
		//if user wants to uncheck the checkbox
		if(!userInput){
			if(actualState){
				driver.findElement(By.id("checkbox1")).click();;
			}else{
				System.out.println("Already unchecked");
			}
			
		}
		
		
		
	}

}
