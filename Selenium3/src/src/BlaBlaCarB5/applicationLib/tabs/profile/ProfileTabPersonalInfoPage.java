package BlaBlaCarB5.applicationLib.tabs.profile;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BlaBlaCarB5.applicationLib.tabs.basetabs.BaseTabPage;
import poc.MyLog4jReporting;

public class ProfileTabPersonalInfoPage extends BaseTabPage {
	
	String firstNameLoc ="xpath";
	String lastNameLoc ="xpath";
	String emailLoc ="xpath";
	String mobileContryCodeLoc ="xpath";
	String mobileLoc ="xpath";
	String okLoc="new xpath";
	
	private static Logger log = Logger.getLogger(MyLog4jReporting.class.getName());
	
	public void clickOk(WebDriver driver){
		log.info("clicking ok button");
		driver.findElement(By.xpath(okLoc)).click();
	}	
	
	public void enterFirstName(WebDriver driver, String firstName){
		log.info("entering first name ");
		driver.findElement(By.xpath(firstNameLoc)).sendKeys(firstName);
	}
	
	public String getFirstName(WebDriver driver){
		log.info("entering first name ");
		return driver.findElement(By.xpath(firstNameLoc)).getText();
	}
	
	public boolean isFirstNameTxtBoxEnabled(WebDriver driver){
		try{
			driver.findElement(By.xpath(firstNameLoc));
		}catch(Exception e){
			
		}
		return true;
	}
	
	
	
	
	
	

}
