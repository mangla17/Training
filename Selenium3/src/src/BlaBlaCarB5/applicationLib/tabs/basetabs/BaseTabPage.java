package BlaBlaCarB5.applicationLib.tabs.basetabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseTabPage {
	
String okLoc="xpath";
	
	public void clickOk(WebDriver driver){
		driver.findElement(By.xpath(okLoc)).click();
	}

}
