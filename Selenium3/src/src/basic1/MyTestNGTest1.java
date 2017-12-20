package basic1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestNGTest1 {
	
	
	@Test
	public void method1(){
		System.out.println("test ng method");
		String expectedResult = "Checkbook request submitted";
		boolean result = expectedResult.equals("Checkbook request NOT submitted");
		//Assert.assertTrue(result);
	}
	

}
