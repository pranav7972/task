package Taskloop;

public class Factorial {

	public static void main(String[] args) {
	int num =5;
	long fac=1;
	for(int i=1;i<=num;i++)
	{
		 fac *= i;
	}
	System.out.printf("Fac of %d = %d", num, fac);
	
 }
}
