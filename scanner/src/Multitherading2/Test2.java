package Multitherading2;

public class Test2 {
	public static void main(String[] args) {
		
        MyRunnable mr=new MyRunnable();
		
		Thread t1=new Thread(mr);
		
		t1.setDaemon(true);
		t1.start();
		
		for(int i=1;i<10;i++)
		{
			System.out.println("main--");
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}