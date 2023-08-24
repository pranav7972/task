package Day17;

public class B extends A {

	public int m1()
	{
		System.out.println("child m1-B");	
		return 10;
	}

	void m2(char c)
	{
		System.out.println("child m2-B"+c);
	}
	@Override
	private int m3()
	{
		return 10;
	}
	protected void m4()
	{
		System.out.println("child m4-B");
	}
	public A m5()
	{
		System.out.println("chlid m5-B");
		return new A() ;
	}
    public static void main (String []args)
    {
    	A a=new B();
    	a.m1();
    	a.m2('a');
  //	a.m3();
    	a.m4();
    	a.m5();
    }
}


