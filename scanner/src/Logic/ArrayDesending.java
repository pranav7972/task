package Logic;
import java.util.Scanner;
public class ArrayDesending {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n= sc.nextInt();
		
		int a[] = new int [n];
		int i,j,temp=0;
		
		
		System.out.println("Enter " + n +" number of array elements:  ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("All array elements are: ");
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}
		
		for(i=0;i<n;i++) {//i=2
			for(j=i+1;j<n;j++) {//j=2
				if(a[i]<a[j]) {//6>1
					temp=a[i];//6
					a[i]=a[j];//1
					a[j]=temp;//6
				}
			}
		}
		
		System.out.println("\nArray Elements in Desending Order: ");
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}

 }
}
