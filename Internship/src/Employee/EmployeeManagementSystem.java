package Employee;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("Employee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Employee ID: ");
                    int employeeId = scanner.nextInt();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee(name, employeeId, salary);
                    employees.add(employee);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    // Display All Employees
                    if (employees.isEmpty()) {
                        System.out.println("No employees to display.");
                    } else {
                        System.out.println("Employee List:");
                        for (Employee emp : employees) {
                            emp.displayEmployeeInfo();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting Employee Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
