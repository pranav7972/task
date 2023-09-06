package Exception_handling;

public class B3 {
	   
		public void m2() throws ClassNotFoundException {
			System.out.println("B3_________m2 Start");
			Class.forName("Exception_handling.B3");
			System.out.println("B3_________m2 End");
			//Exception_handling/B3.java
		}
	}

	

