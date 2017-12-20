package TestNGExample;

import org.testng.annotations.Test;

public class ParallelClassA {
	
	@Test
	public void myTest1() throws InterruptedException{
		System.out.println("ClassA : I am in test 1");
		Thread.sleep(10000);
	}
	
	@Test
	public void myTest2() throws InterruptedException{
		System.out.println("ClassA :  I am in test 2");
		Thread.sleep(10000);
	}

}
