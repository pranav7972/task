package Logic;
import java.util.Scanner;
public class ArrayMaxElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array::");
		int n = sc.nextInt();
		
		System.out.println("Enter the "+n+" number of Array Element::");
		
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
			
		}
		int max=a[0];//5
	   for(int i=1;i<a.length;i++) {	
		   if(a[i]>max) {//7>5
			   max=a[i];//7
		   }
	   }
	   System.out.println("Maximum Element is::"+max);
	}
	}
