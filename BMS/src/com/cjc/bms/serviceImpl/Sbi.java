import java.util.*;
import com.cjc.bms.service.Rbi;
import com.cjc.bms.model.Account;

public class Sbi implements Rbi {
    Scanner sc = new Scanner(System.in);
    List<Account> accounts = new ArrayList<>();

    public void createAccount() {
        try {
            System.out.println("Enter How Many Accounts You Want to Create");
            int numAccounts = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < numAccounts; i++) {
                Account account = new Account();
                System.out.println("Please Enter Full Name");
                account.setName(sc.nextLine());
                System.out.print("Enter Phone no: ");
                String mobNo = sc.nextLine();
                if (mobNo.length() == 10 && mobNo.matches("\\d+")) {
                    account.setMobNo(mobNo);
                } else {
                    throw new IllegalArgumentException("Invalid phone number. Please enter a valid 10-digit phone number.");
                }
                System.out.print("Enter Adhar no: ");
                account.setAdharNo(sc.nextLine());
                System.out.print("Enter Gender: ");
                account.setGender(sc.nextLine());
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                if (age >= 18) {
                    account.setAge(age);
                } else {
                    throw new IllegalArgumentException("Sorry, you must be at least 18 years old to create an account.");
                }
                String accountNumber = generateRandomAccountNumber();
                account.setAccountNumber(accountNumber);
                account.setBalance(1000);
                System.out.println("___Congratulations for starting your banking journey with us___");
                System.out.println("SBI - Created Account successfully");
                System.out.println("Your New Account no.: " + account.getAccountNumber());
                System.out.println("Your Account Balance is : " + account.getBalance());
                accounts.add(account);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayAllDetails() {
        for (Account account : accounts) {
            System.out.println("SBI - Displaying All Details");
            System.out.println("Name of account holder: " + account.getName());
            System.out.println("Phone number of account holder: " + account.getMobNo());
            System.out.println("Adhar no of account holder: " + account.getAdharNo());
            System.out.println("Gender of account holder: " + account.getGender());
            System.out.println("Account no.: " + account.getAccountNumber());
            System.out.println("Account Type: savings account");
        }
    }

    public void depositMoney() {
        try {
            System.out.println("Enter the account number you want to deposit into: ");
            String accountNumber = sc.nextLine();
            Account targetAccount = findAccount(accountNumber);

            if (targetAccount != null) {
                System.out.println("Enter the amount you want to deposit: ");
                double depositAmount = sc.nextDouble();

                if (depositAmount >= 100 && depositAmount <= 100000) {
                    targetAccount.setBalance(targetAccount.getBalance() + depositAmount);
                    System.out.println("SBI - Money has been deposited successfully");
                    System.out.println("Your Account Balance is: " + targetAccount.getBalance());
                } else {
                    throw new IllegalArgumentException("Invalid deposit amount. Please enter an amount between 100 and 100000.");
                }
            } else {
                throw new IllegalArgumentException("Account not found. Please check the account number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void withdrawal() {
        try {
            System.out.println("Enter the account number you want to withdraw from: ");
            String accountNumber = sc.nextLine();
            Account targetAccount = findAccount(accountNumber);

            if (targetAccount != null) {
                System.out.println("Enter the amount you want to withdraw: ");
                double withdrawalAmount = sc.nextDouble();

                if (withdrawalAmount >= 500 && withdrawalAmount <= 10000 && withdrawalAmount <= targetAccount.getBalance()) {
                    targetAccount.setBalance(targetAccount.getBalance() - withdrawalAmount);
                    System.out.println("SBI - Money withdrawn successfully");
                    System.out.println("Your Account Balance is: " + targetAccount.getBalance());
                } else {
                    throw new IllegalArgumentException("Withdrawal failed. Please ensure you have sufficient funds and enter an amount between 500 and 10000.");
                }
            } else {
                throw new IllegalArgumentException("Account not found. Please check the account number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void balanceCheck() {
        try {
            System.out.println("Enter the account number to check balance: ");
            String accountNumber = sc.nextLine();
            Account targetAccount = findAccount(accountNumber);

            if (targetAccount != null) {
                System.out.println("SBI - Checking Balance");
                System.out.println("Your Account Balance is: " + targetAccount.getBalance());
            } else {
                throw new IllegalArgumentException("Account not found. Please check the account number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private String generateRandomAccountNumber() {
        long min = 1000000000L;
        long max = 9999999999L;
        long randomNum = min + (long) (Math.random() * (max - min + 1));
        return String.valueOf("SBI" + randomNum);
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
