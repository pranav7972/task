package Multitherading;

public class Test1 {
public static void main(String[] args) {
	
	MyThread t1=new MyThread();
	
	t1.start();
	for(int i=0;i<10;i++)
		System.out.println("main-start");
	
	try {
		t1.join();
	}catch (InterruptedException e) {
      e.printStackTrace();
	}
	for (int i=0; i<10;i++)
		System.out.println("main-end");
 }
}