package liveProjectBlaBlaCar.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopBarPage extends BasePage {
	
	String messageIconLoc= "";
	
	
	public void clickMessageIcon(WebDriver driver){
		driver.findElement(By.xpath(messageIconLoc)).click();
	}

}
