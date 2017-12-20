package basic;

import org.apache.poi.util.SystemOutLogger;

public class MyMethodStudyTest {
	
	public static void main(String args[]){
		System.out.println("in method3");
		MyMethodStudy obj = new MyMethodStudy();
		int s= obj.method1(90);
		System.out.println(s);
	}

}
