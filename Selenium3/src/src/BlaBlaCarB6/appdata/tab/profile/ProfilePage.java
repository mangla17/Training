package BlaBlaCarB6.appdata.tab.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BlaBlaCarB6.appdata.tab.common.TabBasePage;

public class ProfilePage extends TabBasePage {

	String commonXpathOKBtn = "ok_1";
	
	public void clickOkButton(WebDriver driver){
		driver.findElement(By.xpath(commonXpathOKBtn)).click();
	}
}
