package Task2;

public class Info {
	
	public Employee setEmp()
	{
	
    Employee emp=new Employee();
	emp.setId(1);
	emp.setName("pranav");
	emp.setSalary(10000l);	
	
	return emp;
	
	}
	public void getEmp(Employee emp)
	{
		System.out.println("Employee id is"+emp.getId());
		System.out.println("Employee id is"+emp.getName());
		System.out.println("Employee id is"+emp.getSalary());
	}
}
