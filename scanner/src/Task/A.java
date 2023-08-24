package Task;

public class A {
	public void display(){
		System. out. println("display_method");
		}
		public int display(int x){
		return x; }
		public void display(String msg){ System.out.println("display_String_method msg: "+msg); }
		public double display(double a,double b){
		return a+b; }
		public static void main(String[] args) { A a=new A();
		int x=a.display(20);
		System.out.println("display_int_method output:"+x); 
		double y = a.display(10.1d, 30.2d);
		System.out.println("display_double_method output: "+y); a.display("Hello");
		a.display(); }
		}