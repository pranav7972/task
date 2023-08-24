package Calculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator c = new Calculator();

        System.out.println("---select---\n"
                + "1 Addition\n"
                + "2 Subtraction\n"
                + "3 Multiplication\n"
                + "4 Exit");

        while (true) {
            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            if (ch==1)
                c.addition();
            else if (ch==2)
                c.subtraction();
            else if (ch==3)
                c.multiply();
            else if (ch==4)
            	break;
            else
                System.out.println("Wrong choice");

        }
    }
}
