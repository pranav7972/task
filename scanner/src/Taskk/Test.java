package Taskk;

public class Test {
    public static void main(String[] args) {
        Institute institute = Data.setData();

        System.out.println("\nInstitute Information:");
        System.out.println("Name: " + institute.getName());
        System.out.println("Location: " + institute.getLocation());
        System.out.println("Mobile Number: " + institute.getMobNo());

        Owner owner = institute.getOwner();
        System.out.println("\nOwner Information:");
        System.out.println("Name: " + owner.getName());
        System.out.println("Mobile Number: " + owner.getMobNo());

        Address address = owner.getAddress();
        System.out.println("\nAddress Information:");
        System.out.println("City Name: " + address.getCityName());
        System.out.println("Area Name: " + address.getAreaName());
    }
}