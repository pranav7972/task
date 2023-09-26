package com.cjc.ims.app.client;
import  com.cjc.ims.app.serviceimpl.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        karvenagar karvenagarInstance = new karvenagar();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Add Faculty");
            System.out.println("4. View Faculty");
            System.out.println("5. Add Batch");
            System.out.println("6. View Batches");
            System.out.println("7. Add Student");
            System.out.println("8. View Students");
            System.out.println("9. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    karvenagarInstance.addCourse();
                    break;
                case 2:
                    karvenagarInstance.viewCourse();
                    break;
                case 3:
                    karvenagarInstance.addFaculty();
                    break;
                case 4:
                    karvenagarInstance.viewFaculty();
                    break;
                case 5:
                    karvenagarInstance.addBatch();
                    break;
                case 6:
                    karvenagarInstance.viewBatch();
                    break;
                case 7:
                    karvenagarInstance.addStudent();
                    break;
                case 8:
                    karvenagarInstance.viewStudent();
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
