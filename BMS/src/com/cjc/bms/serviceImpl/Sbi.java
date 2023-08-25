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
    	account.setMobNo(sc.nextLine());
    	System.out.print("Enter Adhar no: ");
    	account.setAdharNo(sc.nextLine());
    	System.out.print("Enter Gender : ");
    	account.setGender(sc.nextLine());
    	System.out.print("Enter Age : ");
    	account.setAge(sc.nextInt());
        System.out.println("SBI ---created Account successfully---");
        System.out.println("Your New Account no.: 161310110007356");
    }

    public void displayAllDetails() {
        System.out.println("SBI - Displaying All Details");
        System.out.println("Name of account holder : "+account.getName());
        System.out.println("Phone number of account holder : "+account.getMobNo());
        System.out.println("Gender of account holder : "+account.getGender());
        System.out.println("Account no.: 161310110007356");
        System.out.println("Account Type:: savings account");
    }

    public void depositMoney() {
    	System.out.println("Enter the amount you want to deposit: ");  
    	account.setBalance(sc.nextDouble());
    	System.out.println("SBI - money has deposited successfully");
    	System.out.println("Your Account Balance is : "+account.getBalance());
    }

    public void withdrawal() {
    	System.out.println("Enter the amount you want to withdrawal : ");
    	double withdrawalAmount = sc.nextDouble();
    	if (withdrawalAmount > 0 && withdrawalAmount <= account.getBalance()) {
            account.setBalance(account.getBalance() - withdrawalAmount);
            System.out.println("SBI --__Money withdrawn successfully__--");
            System.out.println("Your Account Balance is: " + account.getBalance());
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }

    public void balanceCheck() {
        System.out.println("SBI ----Checking Balance----");
        System.out.println("Your Account Balance is : "+account.getBalance());
        
    }
}
