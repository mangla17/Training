package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GridTest1 {
	
	/* This is an example of Selenium GRID
	 * 
	 * Before executing, please start a HUB and atleast 1 NODE
	 * By default, a Selenium node will run 5 sessions of Firefox, 
	 * 5 sessions of Chrome 
	 * and 	 * 1 session of IE, 
	 * but it can only run a total of 5 sessions on parallel.
	 * 
	 * HUB and NODE needs to be started before this file is executed.
	 * To Start HUB: Go to the folder where Selenium Standalone Jar is present
	 * and type the following command
	 * 
	 * java -jar selenium-server-standalone-2.53.1.jar -role hub
	 * 
	 * console URL : http://192.168.1.104:4444/grid/console
	 * 
	 * To Start NODE: Go to the folder where Selenium Standalone Jar is present
	 * and type the following command
	 * 
	 * java -jar selenium-server-standalone-2.53.1.jar -role node -hub http://localhost:4444/grid/register
	 * 
	 * Here, we are starting the node on the same machine as the HUB, hence 'localhost' above.
	 * 
	 * 
	 * Please note that Internet Explorer can run only 1 instance on 1 node. Hence if you select
	 * Internet Explorer as the browser, it will execute sequentially.
	 * 
	 * Firefox and Chrome can run 5 instances on 1 node.
	 * 
	 * 
	*/
	
	@Parameters({ "browser" })
	@Test
	public void test1(String browserName) throws MalformedURLException, InterruptedException{
	
		WebDriver driver = null;
		if(browserName.equals("firefox")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities =DesiredCapabilities.firefox();
			capabilities.setBrowserName(browserName);
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(nodeURL, capabilities);
		}
		if(browserName.equals("chrome")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities =DesiredCapabilities.chrome();
			capabilities.setBrowserName(browserName);
			capabilities.setCapability("chrome.switches", Arrays.asList("--disable-extensions"));
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
			driver = new RemoteWebDriver(nodeURL, capabilities);
		}
		
		driver.get("http://www.google.com");
		Thread.sleep(14000);
		System.out.println("test1: Google: ");
		driver.quit();
	}

	@Parameters({ "browser" })
	@Test
	public void test2(String browserName) throws MalformedURLException, InterruptedException{
	
		WebDriver driver = null;
		if(browserName.equals("firefox")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities =DesiredCapabilities.firefox();
			capabilities.setBrowserName(browserName);
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(nodeURL, capabilities);
		}
		if(browserName.equals("chrome")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities =DesiredCapabilities.chrome();
			capabilities.setBrowserName(browserName);
			capabilities.setCapability("chrome.switches", Arrays.asList("--disable-extensions"));
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
			driver = new RemoteWebDriver(nodeURL, capabilities);
		}
		driver.get("http://www.google.com");
		Thread.sleep(14000);
		System.out.println("test2: Google: ");
		driver.quit();
	}
	
	@Parameters({ "browser" })
	@Test
	public void test3(String browserName) throws MalformedURLException, InterruptedException{
		
		WebDriver driver = null;
		if(browserName.equals("firefox")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities =DesiredCapabilities.firefox();
			capabilities.setBrowserName(browserName);
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(nodeURL, capabilities);
		}
		if(browserName.equals("chrome")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities =DesiredCapabilities.chrome();
			capabilities.setBrowserName(browserName);
			capabilities.setCapability("chrome.switches", Arrays.asList("--disable-extensions"));
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
			driver = new RemoteWebDriver(nodeURL, capabilities);
		}
		driver.get("http://www.google.com");
		Thread.sleep(14000);
		System.out.println("test3: Google: ");
		driver.quit();
	}
	
}
