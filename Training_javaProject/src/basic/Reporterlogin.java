package basic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporterlogin {
	
	@Test
	public void test(){
		Reporter.log("starting the script");
		System.out.println("script started");
		Reporter.log("create driver");
		Reporter.log("enter user name");
		Reporter.log("end script");
	}
	
	@Test
	public void test1(){
		Reporter.log("starting the script");
		System.out.println("script started");
		Reporter.log("create driver");
		Reporter.log("enter user name");
		Reporter.log("end script");
	}
	
	
	@Test
	public void test3(){
		Reporter.log("starting the script");
		System.out.println("script started");
		Reporter.log("create driver");
		Reporter.log("enter user name");
		Reporter.log("end script");
	}
	
	@Test
	public void test4(){
		Reporter.log("starting the script");
		System.out.println("script started");
		Reporter.log("create driver");
		Assert.assertTrue(false);
		Reporter.log("enter user name");
		Reporter.log("end script");
	}

}
