package Multitherading2;

public class MyRunnable implements Runnable {
    @Override
	public void run()
	{
		for(int i =1;i<100;i++)
		{
			System.out.println("MyRunnable");
		try {
			Thread.sleep(300);
		}catch (InterruptedException e) {
          e.printStackTrace();
		}
		}
	}
}
