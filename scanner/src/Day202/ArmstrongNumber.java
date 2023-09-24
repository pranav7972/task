package Day202;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();//153
		int t1=number;//t1=153
		int length = 0;
		while(t1!=0) {//1!=0
			t1 = t1/10;//.
			length = length+1;//3 // for find out number of digits
			
		}
		int t2 = number;//153
		int arm = 0;
		int rem ;
		while(t2!=0) {//15!=0
			int mul =1;
			rem = t2%10;//1
			for(int i=1;i<=length;i++) {
				mul = mul*rem;//1
			}
			arm = arm+mul;//153
			t2 = t2/10;//.
		}
		if(arm==number) {
			System.out.println(number +" is Armstrong number");
		}
		else {
			System.out.println(number +" is not Armstrong number");
		}
	}

}
