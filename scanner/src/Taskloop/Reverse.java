package Taskloop;
import java.util.Scanner;
public class Reverse {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n, reverse = 0;
		System.out.println("Enter no ");
	    n=sc.nextInt();
	    while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n = n/10;
	    }
	    System.out.println("Reverse of the number is " + reverse);		
	}

}
