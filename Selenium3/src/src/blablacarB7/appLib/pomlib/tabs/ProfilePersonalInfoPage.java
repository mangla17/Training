package blablacarB7.appLib.pomlib.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePersonalInfoPage extends BaseTabPage {
	
	String fnameloc = "xpath of f name";
	String lnameloc = "xpath of l name";
	
	
	
	public void enterFirstName(WebDriver driver, String param){
		driver.findElement(By.xpath(fnameloc)).sendKeys(param);
	}
	
	public void isFirstNamePrsent(WebDriver driver){
		try{
			driver.findElement(By.xpath(fnameloc));
		}catch(Exception e){
			
		}
	}
	
	
	public void enterLastName(WebDriver driver, String param){
		
	}
	

}
