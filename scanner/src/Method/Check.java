package Method;

public class Check {
public void disp(int a, double b)
{ System.out.println("Method A");
}
public void disp(int a, double b, double c)
{ System.out.println("Method B");
}
public void disp(int a, int b){
System.out.println("Method C"); }
public static void main(String args[])
{ Check c= new Check();
c.disp(100, 20.67f); }
}