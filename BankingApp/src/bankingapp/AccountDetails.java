package bankingapp;

import java.util.Scanner;

public class AccountDetails {

    private String accno;
    private String name;
    private String acc_type;
    private long balance;

    Scanner sc = new Scanner(System.in);

    //method to open new account  
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Select your Account type: ");
        System.out.println("\n 1. Current Account");
        System.out.println("2. Savings Account");
        System.out.println("3. Salary Account");
        System.out.println("4. Fixed Deposit Account");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    //method to display account details  
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    //method to deposit money  
    public void deposit() {
        long amount;
        System.out.println("Enter the amount you want to deposit: ");
        amount = sc.nextLong();
        balance = balance + amount;
        
        System.out.println("Cuurent Balance :" + balance);
    }

    //method to withdraw money  
    public void withdrawal() {
        
        long amount;
        System.out.println("Enter the amount you want to withdraw: ");
        amount = sc.nextLong();
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!");
        }
    }

    //method to search an account number  
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
