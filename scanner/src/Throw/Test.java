package Throw;

public class Test {
	
	public void m1(int age)throws AgeInvalideException
	{
		System.out.println("m1--Start");
		if(age<0)
			throw new AgeInvalideException("Age Problem");
		System.out.println("m1--end");
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		try
		{
			t.m1(-5);
		}
		catch(AgeInvalideException e) {
			System.out.println(e.getMessage());
		}
	}

}
