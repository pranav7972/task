package Exception_handling;

public class Finally {
	public static void main(String[] args) {
		try
		{
			System.out.println("try---Block");
		    int x= 10/1;
		    System.out.println("try---End");
		}
		finally
		{
			System.out.println("Finally--Block");
		}
		{
			System.out.println("main---End");
		}
	}

}
