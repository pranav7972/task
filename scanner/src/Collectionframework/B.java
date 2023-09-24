package Collectionframework;
import java.util.*;
public class B {
	
	public static void main(String[] args) {
		
		List<String> al=new ArrayList<>();
		             al.add("abc");
		             al.add("pqr");
		             al.add("lmn");
		             al.add("xyz");
		     System.out.println(al);
		 
		     Iterator<String> itr =al.iterator();
		     while(itr.hasNext())
		     {
		    	String x=itr.next();
		    	System.out.println(x);
		     }
	}

}
