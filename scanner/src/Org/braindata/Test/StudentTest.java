package Org.braindata.Test;
import Org.braindata.model.Student;
public class StudentTest {
	public void Studentfirst()
	{
	Student d=new Student();
	d.setRollno(1);
	d.setName("pranav");
	d.setMobileno(77588992677l);
	d.setFees(1000);
	d.setAddress("pune");
	d.setClgname("cjc");
	
	System.out.println("rollno is ="+d.getRollno());
	System.out.println("name is ="+d.getName());
	System.out.println("mobileno is ="+d.getMobileno());
	System.out.println("fee is ="+d.getFees());
	System.out.println("address is =" +d.getAddress());
	System.out.println("clg is ="+d.getClgname());
	
	}
	public void StudentSecond()
	{
		Student d1=new Student();
		d1.setRollno(2);
		d1.setName("pratik");
		d1.setMobileno(77588992677l);
		d1.setFees(10000);
		d1.setAddress("pune");
		d1.setClgname("cjc");
		
		System.out.println("rollno is ="+d1.getRollno());
		System.out.println("name is ="+d1.getName());
		System.out.println("mobileno is ="+d1.getMobileno());
		System.out.println("fee is ="+d1.getFees());
		System.out.println("address is ="+d1.getAddress());
		System.out.println("clg is ="+d1.getClgname());
		
	
	}
	public static void main (String []args) {
		StudentTest s=new StudentTest();
		s.Studentfirst();
		s.StudentSecond();
	}
}
