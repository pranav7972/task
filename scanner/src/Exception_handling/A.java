package Exception_handling;
import java.io.IOException;
public class A {
	
	public void m1()throws Exception
	{
		System.out.println("m1--Start");
		B b=new B();
		try
		{
			b.m2();
		}
		catch (ArithmeticException e) {
			System.out.println("catch--Block" +e.getMessage());
		}
		System.out.println("m1--end");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		System.out.println("main--end");
	}

}
