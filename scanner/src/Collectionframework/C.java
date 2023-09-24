package Collectionframework;
import java.util.*;
public class C {
	
	public static void main(String[] args) {
		
		List<Character> al=new ArrayList<>();
		               al.add('a');
		               al.add('b');
		               al.add('c');
		               al.add('d');
		               al.add('e');
		    System.out.println(al);
		    
		    
		    Iterator<Character> itr=al.iterator();
		    while(itr.hasNext())
		    {
		    	Character x=itr.next();
		    	System.out.println(x);
		    }
	}

}
