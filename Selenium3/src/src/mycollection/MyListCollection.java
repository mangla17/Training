package mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//dynamic array for storing the elements.
//It extends AbstractList class and implements List interface.
//can contain duplicate elements.
//maintains insertion order.
//Java ArrayList allows random access because array works at the index basis.
public class MyListCollection {
	
	public static void main(String[] args){
		 List<String> al=new ArrayList<String>();//creating arraylist  
		  al.add("Vishal");//adding object in arraylist  
		  al.add("Akhilesh");  
		  al.add("Sanjeevani");  
		  al.add("Vivek");  
		  
		  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
	

}
