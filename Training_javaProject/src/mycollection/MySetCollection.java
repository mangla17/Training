package mycollection;

import java.util.HashSet;
import java.util.Set;

import org.jboss.netty.channel.FixedReceiveBufferSizePredictorFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
//contains unique elements only.
public class MySetCollection {
	
	public static void main(String args[]){  
		
//		WebDriver driver = new FirefoxDriver();
		
		   
		  Set <String> mySet=new HashSet<String>();  
		  mySet.add("Surya");  
		  mySet.add("Shalu");  
		  mySet.add("Dhananjay");  
		  mySet.add("Mrunal");  
		  
		  
		  for (String oneItem : mySet) {
			  System.out.println(oneItem);
//				WebDriver web = driver.switchTo().window(abc);
//				System.out.println(driver.getTitle());
//				System.out.println(web.getTitle());
				///getChildWindow=getChild;
			}
		  
//		  Iterator<String> itr=al.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }  
		 }  
	

}
