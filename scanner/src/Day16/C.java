package Day16;

public class C {
	
	public C() {
		System.out.println("non Parameter constructor");
	}
	public C(int x) {
		System.out.println("int constructor");
	}
	public C(String S) {
		System.out.println("String constructor");
	}
   public static void main (String []args) {
	   C c=new C("x");
   }
  
}
