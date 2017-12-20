package PageObjectModel;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	String findaRadiButton = "";
	String offeraRadiButton = "";
	
	public void clickFindaRideButton(WebDriver driver){
		super.clickButton(driver,findaRadiButton);
	}
	
	public void offeraRideButton(WebDriver driver){
		super.clickButton(driver,offeraRadiButton);
	}

}
