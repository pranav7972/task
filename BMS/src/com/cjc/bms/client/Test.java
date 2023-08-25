package com.cjc.bms.client;
import java.util.Scanner;
import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImpl.Sbi;

public class Test {
    public static void main(String[] args) {
    	Scanner sc=new Scanner (System.in);
        Rbi bank = new Sbi();
        
        System.out.println("---select---"); 
        System.out.println("1 createAccount");
        System.out.println("2 displayAllDetails");
  		System.out.println("3 depositMoney"); 
   		System.out.println("4 withdrawal");
        System.out.println("5balanceCheck");
   		System.out.println("6 Exit");

       while(true)
       {
    	   System.out.println("Please Enter Your Choice");
    	   int choice=sc.nextInt();
    	   
        if (choice == 1) {
            bank.createAccount();
        } else if (choice == 2) {
            bank.displayAllDetails();
        } else if (choice == 3) {
            bank.depositMoney();
        } else if (choice == 4) {
            bank.withdrawal();
        } else if (choice == 5) {
            bank.balanceCheck();
        } else if (choice == 6) {
        	System.out.println("Exit");
        	break;
        } else {
            System.out.println("Invalid choice");
        }
    }
 }
}
