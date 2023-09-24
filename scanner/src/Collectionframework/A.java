package Collectionframework;
import java.util.*;

public class A {
	
	public static void main(String[] args) {
		
		List<String> a1=new ArrayList<>();
		             a1.add("a");
		             a1.add("b");
		             a1.add("c");
		             a1.add("d");
		 System.out.println(a1);
		 
		 Iterator<String> itr=a1.iterator();
		 while(itr.hasNext())
		 {
			 String x=itr.next();
			 System.out.println(x);
		 }
		             
	}

}
