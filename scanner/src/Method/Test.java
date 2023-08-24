package Method;

public class Test {
public static void main(String[] args)
{ System.out.println("Normal main method"); main("cjc");
}
public static void main(String arg1){
System.out.println("without array main method: " + arg1); main("cjc", "karvenagar");
}
public static void main(String arg1, String arg2) 
{
	System.out.println("two paramerter main method: "+ arg1 +", "+arg2);
	}
}

