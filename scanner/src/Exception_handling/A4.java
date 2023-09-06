package Exception_handling;

public class A4 {
	public void m1()throws ClassNotFoundException  {
		System.out.println("m1________A3_____Start");
		B4 b=new B4();
		   b.m2();
		System.out.println("m1_______A3____End");
	}
	public static void main(String[] args)throws ClassNotFoundException{
		System.out.println("main _________start");
		A4 a=new A4();
		try 
		{
			a.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch-end");
		}
		System.out.println("main __________End");
	}

}
