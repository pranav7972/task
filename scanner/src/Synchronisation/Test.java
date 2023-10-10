package Synchronisation;

public class Test {
public static void main(String[] args) {
	Hello h=new Hello();
	
	Hello h1=new Hello();
	MyThread t1= new MyThread(h,"complete");
	MyThread t2= new MyThread(h,"java");
	
	MyThread t3= new MyThread(h1,"class");
	MyThread t4= new MyThread(h1,"karvenagar");
	
	
	  t1.start();
	  t2.start();
	  t3.start();
	  t4.start();
	 
    	
 }
}
