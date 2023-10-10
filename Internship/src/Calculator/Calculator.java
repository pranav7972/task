package Calculator;
import java.util.Scanner;
public class Calculator {
    public void addition(int a,int b) {

        int c = a + b;
        System.out.println(c);
    }

    public void subtraction(int a,int b) {
        int c = b - a;
        System.out.println(c);
    }

    public void multiply(int a,int b) {
        int c = a * b;
        System.out.println(c);
    }
    public static void main (String [] args)
    {
     Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter First no");
        int i=sc.nextInt();
        System.out.println("Enter Second no");
        int j=sc.nextInt();

        System.out.println("---select---\n"
                + "1 Addition\n"
                + "2 Subtraction\n"
                + "3 Multiplication\n"
                + "4 Exit");

        while (true) {
            System.out.println("---Enter your choice---");
            int ch = sc.nextInt();

            if (ch==1)
                c.addition(i,j);
            else if (ch==2)
                c.subtraction(i,j);
            else if (ch==3)
                c.multiply(i,j);
            else if (ch==4)
            	break;
            else
                System.out.println("Enter valid choice from 1-4");
     }
   }
}
 