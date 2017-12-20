package TestNGExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngannotation1 {
	
	@Test
	public void test4(){
		System.out.println("in test1");
		Reporter.log("mylogging statement1");
		
	}
	
	
	@Test
	public void test5(){
		System.out.println("in test2");
		Reporter.log("mylogging statement2");
	}
	
	
	@Test
	public void test6(){
		System.out.println("in test3");
		Reporter.log("mylogging statement3");
	}

}
