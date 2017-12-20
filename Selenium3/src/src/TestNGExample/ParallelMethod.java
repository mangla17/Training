package TestNGExample;

import org.testng.annotations.Test;

public class ParallelMethod {
	
	@Test
	public void test1() throws InterruptedException{
		System.out.println("Start test 1");
		Thread.sleep(10000);
		System.out.println("End test 1");
	}
	
	@Test
	public void test2() throws InterruptedException{
		System.out.println("Start test 2");
		Thread.sleep(10000);
		System.out.println("End test 2");
	}
	
	@Test
	public void test3() throws InterruptedException{
		System.out.println("Start test 3");
		Thread.sleep(10000);
		System.out.println("End test 3");
	}

}
