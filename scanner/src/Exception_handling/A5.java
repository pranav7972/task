package Exception_handling;

import java.io.FileNotFoundException;

public class A5 {
    public void m1() throws ClassNotFoundException {
        System.out.println("m1________A5___Start");
        B5 b = new B5();
        b.m2();
        System.out.println("m1_______A5____End");
    }

    public static void main(String[] args) {
        System.out.println("main _________start");
        A5 a = new A5();
        try {
            a.m1();
        } catch (ClassNotFoundException e) {
            System.out.println("catch-end");
            e.printStackTrace();
        }
        System.out.println("main __________End");
    }
}
