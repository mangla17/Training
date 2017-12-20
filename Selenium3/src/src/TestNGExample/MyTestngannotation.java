package TestNGExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngannotation {
	
	@Test
	public void test1(){
		System.out.println("in test1");
		Reporter.log("mylogging statement1");
		
	}
	
	
	@Test
	public void test2(){
		System.out.println("in test2");
		Reporter.log("mylogging statement2");
	}
	
	
	@Test
	public void test3(){
		System.out.println("in test3");
		Reporter.log("mylogging statement3");
	}

}
