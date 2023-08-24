package braindata.impl;
import java.util.Scanner;
import Org.braindata.modell.Student;
public class Display extends Student
{
	Scanner sc=new Scanner(System.in);
public void Studentfirst() 
{
	
	
    System.out.println("Enter rollno");
    setRollno(sc.nextInt());
	System.out.println("Enter name");
	setName(sc.next()); 
	System.out.println("Enter mobileno");
	setMobileno(sc.nextLong());
	System.out.println("Enter fee");
	setFees(sc.nextDouble()); 
	System.out.println("Enter address");
	setAddress(sc.next()); 
	System.out.println("Enter clg");
	setClgname(sc.next()); 
	
	
	System.out.println("Studentfirst rollno is ="+getRollno());
	System.out.println("Studentfirst name is ="+getName());
	System.out.println("Studentfirst mobileno is ="+getMobileno());
	System.out.println("Studentfirst fee is ="+getFees());
	System.out.println("Studentfirst address is =" +getAddress());
	System.out.println("Studentfirst clg is ="+getClgname());
  }
public void StudentSecond()
{ 


	System.out.println("Enter rollno");
	setRollno(sc.nextInt());
	System.out.println("Enter name");
	setName(sc.next()); 
	System.out.println("Enter mobileno");
	setMobileno(sc.nextLong());
	System.out.println("Enter fee");
	setFees(sc.nextDouble());
	System.out.println("Enter address");
	setAddress(sc.next());
	System.out.println("Enter clg");
	setClgname(sc.next());

	
	System.out.println("StudentSecond rollno is ="+getRollno());
	System.out.println("StudentSecond name is ="+getName());
	System.out.println("StudentSecond mobileno is ="+getMobileno());
	System.out.println("StudentSecond fee is ="+getFees());
	System.out.println("StudentSecond address is ="+getAddress());
	System.out.println("StudentSecond clg is ="+getClgname());

 }
public static void main (String []args) {
	
	Display s=new Display();
	s.Studentfirst();
	s.StudentSecond();

	
 }
}