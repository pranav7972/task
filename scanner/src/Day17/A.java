package Day17;

public class A {
	
	public int m1()
	{
		return 10;
	}

	void m2(char c)
	{
		System.out.println("m1 of A");
	}
	private int m3()
	{
		return 10;
	}
	protected void m4()
	{
		return ;
	}
	public A m5()
	{
		System.out.println("m5 of A");
		return new A() ;
	}
}
