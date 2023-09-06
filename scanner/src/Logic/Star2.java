package Logic;

public class Star2 {
	public static void main(String[] args) {

		for(int i=1;i<=8;i++) 		    
		{
			    for(int j=8;j>=i;j--)			    
			    {
				   System.out.print(" ");
			    }
			    for(int k=1;k<=i;k++) {
			    	System.out.print("* ");
			    } 
			  System.out.println(" ");
		    }
	}

}

