package com.cjc.bms.serviceImpl;
import java.util.Scanner;
import com.cjc.bms.service.Rbi;
import com.cjc.bms.model.Account;
public class Sbi implements Rbi {
	Scanner sc=new Scanner(System.in);
	Account account=new Account();
    
    public void createAccount() {
    	System.out.println("Please Enter Full Name");
    	account.setName(sc.nextLine());
    	System.out.print("Enter Phone no: ");
        String mobNo = sc.nextLine();
        if (mobNo.length() == 10 && mobNo.matches("\\d+")) {
            account.setMobNo(mobNo);
        } else {
            System.out.println("Invalid phone number. Please enter a valid 10-digit phone number.");
            return;
        }
    	System.out.print("Enter Adhar no: ");
    	account.setAdharNo(sc.nextLine());
    	System.out.print("Enter Gender : ");
    	account.setGender(sc.nextLine());
    	System.out.print("Enter Age : ");
        //account.setAge(sc.nextInt());
    	int age = sc.nextInt();
    	if (age >= 18) {
            account.setAge(age);
            account.setBalance(1000);
        } else {
            System.out.println("Sorry, you must be at least 18 years old to create an account.");
        }
    	System.out.println("___Congratulations for starting banking journey with us___");
        System.out.println("SBI ---created Account successfully---");
        System.out.println("Your New Account no.: 161310110007356");
    }

    public void displayAllDetails() {
        System.out.println("SBI - Displaying All Details");
        System.out.println("Name of account holder : "+account.getName());
        System.out.println("Phone number of account holder : "+account.getMobNo());
        System.out.println("Adhar no of account holder is :"+account.getAdharNo());
        System.out.println("Gender of account holder : "+account.getGender());
        System.out.println("Account no.: 161310110007356");
        System.out.println("Account Type:: savings account");
    }

    public void depositMoney() { 
    	System.out.println("Enter the amount you want to deposit: ");
        double depositAmount = sc.nextDouble();

        if (depositAmount >= 100 && depositAmount <= 100000) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("SBI - Money has been deposited successfully");
        System.out.println("Your Account Balance is: " + account.getBalance());
        } else {
        System.out.println("Invalid deposit amount. Please enter an amount between 100 and 100000.");
    }
}

    public void withdrawal() {
    	System.out.println("Enter the amount you want to withdraw: ");
        double withdrawalAmount = sc.nextDouble();
        if (withdrawalAmount >= 500 && withdrawalAmount <= 10000 && withdrawalAmount <= account.getBalance()) {
            account.setBalance(account.getBalance() - withdrawalAmount);
            System.out.println("SBI - Money withdrawn successfully");
            System.out.println("Your Account Balance is: " + account.getBalance());
        } else {
            System.out.println("Withdrawal failed. Please ensure you have sufficient funds and enter an amount between 500 and 10000.");
        }
    }

    public void balanceCheck() {
        System.out.println("SBI ----Checking Balance----");
        System.out.println("Your Account Balance is : "+account.getBalance());
        
    }
}
