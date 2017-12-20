package TestNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
		@Test
	   @Parameters({"name","surname"})
	   public void parameterTest(String name, String surname) {
	      System.out.println("Parameter value is : " + name);
	      System.out.println("Parameter value is : " + surname);
	   }

}
