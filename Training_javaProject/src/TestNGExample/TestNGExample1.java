package TestNGExample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample1 {
	

	@BeforeMethod
	public void startBrowser(){
		System.out.println("I am in before method");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("I am in After method");
	}
	
	@BeforeTest
	public void myBeforeTest(){
		System.out.println("I am in before Test");
		//Driver open fire
	}
	
	@AfterTest
	public void myAfterTest(){
		System.out.println("I am in After Test");
		//close browser
	}
	
	@Test	
	public void test1(){
		System.out.println("I am in Test 1");
	}
	
	@Test	
	public void test2(){
		System.out.println("I am in Test 2");
	}

}
