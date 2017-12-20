package TestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataproviderTest {
	
	   @DataProvider(name = "dataName")
	   public static Object[][] primeNumbers() {
	      return new Object[][] {{"Anil", "1"}, {"Chetan", "2"}, {"Ganesh", "3"}, {"Sandeep", "4"}};
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   
		@Test(dataProvider="dataName")
	    public void testPrimeNumberChecker(String name,String pwd) throws InterruptedException {
			
			System.out.println("Name  = "+name+ " pwd ="+pwd);
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://facebook.com");
			
			if(name.equals("Anil")){
				
				Assert.assertTrue(false);
			}
			
			driver.findElement(By.id("email")).sendKeys(name);
			driver.findElement(By.id("pass")).sendKeys(pwd);
			Thread.sleep(5000);
		 
	     
	   }

}
