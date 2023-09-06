package Exception_handling;

public class Test {
	
	public static void main(String[] args) 
	  {
		
		try
		{
			String sc = args[0];
            int x = Integer.parseInt(sc);
            int a = 10 / x;
	    }
		catch (NumberFormatException e)
		{
			System.out.println("Enter number");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter Input Value");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter Value");
		}
		
	  }

}
