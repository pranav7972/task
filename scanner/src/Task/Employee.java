package Task;

public class Employee extends Person{
	double salary;
	public Employee (int id, String name,double salary){
		super(id, name); this.salary=salary;
	}
	public void display(){
	System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary);
	}

}
