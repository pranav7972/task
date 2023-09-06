package Exception_handling;

public class A3 {
	public void m1() throws ClassNotFoundException {
		System.out.println("m1________A3_____Start");
		B3 b=new B3();
		b.m2();
		System.out.println("m1_______A3____End");
	}
	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main _________start");
		A3 a=new A3();			
			a.m1();
		System.out.println("main __________End");
	}


}
