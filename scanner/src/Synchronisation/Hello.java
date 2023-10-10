package Synchronisation;

public class Hello {
	public static synchronized void display(String msg)
	{
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
	}

}
