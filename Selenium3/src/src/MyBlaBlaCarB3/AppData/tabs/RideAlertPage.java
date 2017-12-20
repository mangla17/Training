package MyBlaBlaCarB3.AppData.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import MyBlaBlaCarB3.AppData.common.TabCommonPage;

public class RideAlertPage extends TabCommonPage {

	String okButonXpath ="_1";
	
	
	public void clickOkButton(WebDriver driver){
		driver.findElement(By.xpath(okButonXpath)).click();
	}
}
