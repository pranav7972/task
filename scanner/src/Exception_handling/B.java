package Exception_handling;
import java.io.IOException;
public class B extends A {
	public void m1()throws Exception
	{
		System.out.println("m1--Start");
		B b=new B();
		try
		{
			b.m2();
		}
		catch (ArithmeticException e) 
		{
			System.out.println("catch--Block");
		}
	public void m2()
	{
		System.out.println("m2--start");

		int x=10/0;
		System.out.println("m2-end");
	}

}
