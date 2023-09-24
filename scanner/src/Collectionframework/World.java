package Collectionframework;
import java.util.*; 
public class World {
 
	public static void main(String[] args) {
		
		List<String> mumbai= new ArrayList<>();
		             mumbai.add("parel");
		             mumbai.add("dadar");
		 
	    List<String> pune= new ArrayList<>();
	                 pune.add("karvenagar");
	                 pune.add("hinjavdi"); 
	
	    List<List<String>> india=new ArrayList<>();
	                 india.add(mumbai);
	                 india.add(pune);
	                
	    List<String> tokyo= new ArrayList<>();
		             tokyo.add("Ebisu"); 
		             tokyo.add("asakusa");
		             
	    List<String> hiroshima= new ArrayList<>();
	                 hiroshima.add("nagasaki"); 
	                 hiroshima.add("okayama"); 
	                 
	   List<List<String>> japan=new ArrayList<>();
	                japan.add(tokyo);
	                japan.add(hiroshima);             
	                 
	   List<String> LA= new ArrayList<>();
		            LA.add("uptown");  
		            LA.add("downtown");
		            
	   List<String> NewYork= new ArrayList<>();
	                NewYork.add("uptown");  
	                NewYork.add("downtown");
	                
	   List<List<String>> usa=new ArrayList<>();
	                usa.add(LA);
	                usa.add(NewYork); 
	                
	   List<List<List<String>>> World=new ArrayList<>();
	                World.add(usa);
	                World.add(japan);
	                World.add(india);
	                
	   Iterator<List<List<String>>> itr = World.iterator();
	   
	   while(itr.hasNext())
	   {
		   List<List<String>> list= itr.next();
		  
	       Iterator<List<String>> itr1 = list.iterator();  
		   
	       while(itr1.hasNext())
		   {
	    	  List<String> list1= itr1.next();
	    	  
	    	  Iterator<String> itr2 = list1.iterator();
	    	  
	    	  while(itr2.hasNext())
	    	  {
	    		  String s=itr2.next();
	    		  System.out.println(s);
	    	  }
		   }
		   
	   }
	               
		            
	}
}
