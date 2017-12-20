package TestNGExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGBeforClass {
	
	@BeforeClass
	public void myBeforeClass(){
		System.out.println("I am in before class");
	}
	
	
	@Test
	public void myTest1(){
		System.out.println("I am in test 1");
	}
	
	@Test
	public void myTest2(){
		System.out.println("I am in test 2");
	}
	
	@AfterClass
	public void myAfterClass(){
		System.out.println("I am in After class");
		
	}

}
