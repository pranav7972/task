package Collectionframework;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
        List<getsetinter> a1=new ArrayList<>();
        
        getsetinter s1 = new getsetinter();
        System.out.println("Enter Rollno s1");
                   s1.setRollno(sc.nextInt());
        System.out.println("Enter name s1");
                   s1.setName(sc.next());
                   
       
        getsetinter s2 = new getsetinter();
        System.out.println("Enter Rollno s2");
                s2.setRollno(sc.nextInt());
        System.out.println("Enter name s2");        
                s2.setName(sc.next());
                
                a1.add(s1);
                a1.add(s2);
       
       Iterator<getsetinter> itr = a1.iterator();
       
       while(itr.hasNext())
       {
    	   
    	   getsetinter d=itr.next();
    	   System.out.println("Rollno is:- " +d.getRollno());
    	   System.out.println("Name is:- " +d.getName());
      }
	}

}
