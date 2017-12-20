package blablacarB7.appLib.pomlib.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import blablacarB7.appLib.pomlib.common.BasePage;

public class BaseTabPage extends BasePage{
	
	String okloc = "//div[@id='OK']";
	
	
	public void clickOkButton(WebDriver driver){
		driver.findElement(By.xpath(okloc)).click();
	}

}
