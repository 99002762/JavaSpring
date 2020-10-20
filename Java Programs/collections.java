package training1;
import java.util.*;
import java.util.ArrayList;

public class collections {
	
	public static void main(String args[]) {
		
		
		List<Integer> l=new ArrayList<Integer>();  
		  l.add(2);  
		  l.add(1);  
		  l.add(5);  
		  l.add(3);   
		  Collections.sort(l); 
		  for(Integer number:l)  
		    System.out.println(number);
		
	}
	
	  
	
	
	
}
