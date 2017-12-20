package mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
//contains unique elements only.
public class MySetCollectionJava {
	
	public static void main(String args[]){  
		   
		//Set <String> mySet = new HashSet<String>();  
		Set <String> mySet = new LinkedHashSet<String>();
		//LinkedHashSet <String> mySet=(LinkedHashSet<String>) new LinkedHashSet <String>();  
		  mySet.add("Surya");  
		  mySet.add("Shalu");  
		  mySet.add("Dhananjay");  
		  mySet.add("Mrunal");
		  mySet.add("Vivek"); 
		  mySet.add("Nitin"); 
		  
		  for (String oneItem : mySet) {
			  System.out.println(oneItem);
		  }
		  
		  
//		  Iterator<String> itr=al.iterator();  
//		  while(itr.hasNext()){  
//			  System.out.println(itr.next());  
//		  }  
		 }  
	

}
