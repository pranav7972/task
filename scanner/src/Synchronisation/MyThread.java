package Synchronisation;

public class MyThread extends Thread{
	Hello h;
	String msg;
	
	public MyThread(Hello fh, String msg)
	{
		this.h=h;
		this.msg=msg;
	}
    public void run()
    {
    	h.display(msg);
    }
}