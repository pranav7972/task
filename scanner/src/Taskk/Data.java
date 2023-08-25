package Taskk;
import java.util.Scanner;
public class Data {
	
	public static Institute setData() {
		
        Scanner scanner = new Scanner(System.in);

        Institute institute = new Institute();
        System.out.print("Enter institute name: ");
        institute.setName(scanner.nextLine());
        System.out.print("Enter institute location: ");
        institute.setLocation(scanner.nextLine());
        System.out.print("Enter institute mobile number: ");
        institute.setMobNo(scanner.nextLine());
        
        Owner owner = new Owner();
        System.out.print("Enter owner name: ");
        owner.setName(scanner.nextLine());
        System.out.print("Enter owner mobile number: ");
        owner.setMobNo(scanner.nextLine());
        
        Address address = new Address();
        System.out.print("Enter city name: ");
        address.setCityName(scanner.nextLine());
        System.out.print("Enter area name: ");
        address.setCityName(scanner.nextLine());
        
        owner.setAddress(address);
        institute.setOwner(owner);

        return institute;
        
    }
}
