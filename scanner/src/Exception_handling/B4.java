package Exception_handling;

public class B4 {
	public void m2() throws ClassNotFoundException {
		System.out.println("B3_________m2 Start");
		Class.forName("A");
		System.out.println("B3_________m2 End");
	}
}
