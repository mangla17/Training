package TestNGB6;

import org.testng.annotations.Test;

public class TestNGenabledDisabled {
	
	
	@Test(enabled=false)
	public void myTest1(){
		System.out.println("I am in test 1");
	}
	
	@Test(enabled=true)
	public void myTest2(){
		System.out.println("I am in test 2");
	}

}
