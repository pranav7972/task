package Taskloophospital;
import java.util.Scanner;
public class Info {
	Scanner sc=new Scanner(System.in);
	public void hospitaldata()
	{
		for(int x=0;x<4;x++)
		{
			Hospital h= new Hospital();
			System.out.println("Enter name :");
			h.setName(sc.nextLine());
			System.out.println("Enter address :");
			h.setAddress(sc.nextLine());
			System.out.println("Enter mobno :");
			h.setMobno(sc.nextInt());
			
			System.out.println(h.getName());
			System.out.println(h.getAddress());
			System.out.println(h.getMobno());
		}
	}
	public void doctordata()
	{
		for(int x=1;x<4;x++)
		{
		Doctor d=new Doctor();
		System.out.println("Enter name :");
		d.setName(sc.nextLine());
		System.out.println("Enter address :");
		d.setAddress(sc.nextLine());
		System.out.println("Enter mobno :");
		d.setMobno(sc.nextInt());
		System.out.println("Enter Fee");
		d.setFees(sc.nextInt());
		
		System.out.println(d.getName());
		System.out.println(d.getAddress());
		System.out.println(d.getMobno());
		System.out.println(d.getFees());
		}
	}
	public void patientdata()
	{
		while(x<3);
		{
			Patient p=new Patient();
			System.out.println("Enter name :");
			p.setName(sc.nextLine());
			System.out.println("Enter address :");
			p.setAddress(sc.nextLine());
			System.out.println("Enter mobno :");
			p.setMobno(sc.nextInt());
			System.out.println("Enter bloodgroup");
			p.setBloodgroup(sc.nextLine());	
			System.out.println("Enter Disease");
			p.setDisease(sc.nextLine());
			x++;
		}
		
	}

}
