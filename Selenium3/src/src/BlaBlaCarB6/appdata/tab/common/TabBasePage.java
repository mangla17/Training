package BlaBlaCarB6.appdata.tab.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TabBasePage {
	
	String commonXpathOKBtn = "OK";
	
	
	public void clickOkButton(WebDriver driver){
		driver.findElement(By.xpath(commonXpathOKBtn)).click();
	}

}
