package myBlaBlaCar.AppFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseTabPage extends BasePage{
	
	
	String okTabLoc= "//button[@name='OK']";
	
	
	public void clickOk(WebDriver driver){
		driver.findElement(By.xpath(okTabLoc)).click();
	}

}
