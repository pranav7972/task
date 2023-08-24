package Task;

public class Aa {

	
	public static void main(int x)
	{
		System.out.println(x);
	
	}
	public static void main(float y)
	{
		System.out.println(y);
	}

	public static void main(char c)
	{
		System.out.println(c);
	
	}

	public static void main(double d)
	{
		System.out.println(d);
	
	}
	public static void main(String []args)
	{
		Aa a=new Aa();
		a.main(10);
		a.main(50.0f);
		a.main('A');
		a.main(100);
		
	}
	
}
