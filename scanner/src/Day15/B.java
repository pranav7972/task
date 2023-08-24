package Day15;

public class B extends A{
	public B()
	{
		this("ABC");
		System.out.println("Constructor--B");
	}
	public B(int i)
	{
		System.out.println("Constructor--B--int");
	}
	public B(String s)
	{
		this(10);
		System.out.println("Constructor--B--String");
	}

}
