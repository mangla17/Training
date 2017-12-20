package MyBlaBlaCarB3.AppData.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TabCommonPage extends BasePage{
	
	String okButonXpath = "";
	
	public void clickTab(String string){
		//selenium code
	}
	
	public void clickSubTab(){
		
	}
	
	public void clickOkButton(WebDriver driver){
		driver.findElement(By.xpath(okButonXpath)).click();
		System.out.println("in tab common");
	}

}
