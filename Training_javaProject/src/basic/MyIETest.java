package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MyIETest {
	
	@Test
	public void iETest(){
		System.setProperty("webdriver.ie.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		driver.close();
		driver.quit();
	}

}
