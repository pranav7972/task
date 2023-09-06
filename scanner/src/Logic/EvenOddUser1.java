package Logic;
import java.util.Scanner;
public class EvenOddUser1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number::");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}

	
	}
}
