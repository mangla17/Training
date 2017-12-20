package TestNGB6;

import org.testng.annotations.Test;

public class PriorityTest {
	
	String userName;
	
	@Test(priority=-1)
	public void myTest1(){
		System.out.println("I am in test 1");
		//create user
		userName= "Anil_timestamp" ;
	}
	
	@Test(priority=2)
	public void myTest2(){
		System.out.println("I am in test 2");
		//update user
		String updateUser = userName;
	}
	
	@Test
	public void aaa(){
		System.out.println("I am in test 2");
	}

}
