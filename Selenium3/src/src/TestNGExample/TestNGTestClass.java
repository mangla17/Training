package TestNGExample;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTestClass {
	
	@BeforeClass
	public void beforeClasss(){
		System.out.println("I am in before class");
	}
	@AfterClass
	public void afterClasss(){
		System.out.println("I am in After class");
	}
	
	@Test
	public void test1(){
		System.out.println("I am in test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("I am in test 2");
		Assert.assertTrue(false);
	}

}
