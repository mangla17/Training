package TestNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;



public class MyDependencyTest {
	
	@Test
	public void mySetup(){
		System.out.println(" in setup ");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods={"mySetup"})
	public void test(){
		System.out.println("my test method");
	}
}
