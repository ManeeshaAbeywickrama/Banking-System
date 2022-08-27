package bankingapp;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //create initial accounts 
        System.out.print("How many Accounts you want to open :  ");
        int n = sc.nextInt();
        AccountDetails C[] = new AccountDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new AccountDetails();
            C[i].openAccount();
        }

        int ch;
 
        // loop runs until number 5 is not pressed to exit 
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details");
            System.out.println("2. Search by Account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5.Exit");

            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            if (ch < 0) {
                throw new ArithmeticException("something wrong");
            } else {
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].showAccount();
                        }
                        break;
                    case 2:
                        System.out.print("Enter account no. you want to search: ");
                        String ac_no = sc.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(ac_no);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed! Account doesn't exist..!!");
                        }
                        break;
                    case 3:
                        System.out.print("Enter Account no. : ");
                        ac_no = sc.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(ac_no);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed! Account doesn't exist..!!");
                        }
                        break;
                    case 4:
                        System.out.print("Enter Account No : ");
                        ac_no = sc.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(ac_no);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed! Account doesn't exist..!!");
                        }
                        break;
                    case 5:
                        System.out.println("See you soon...");
                        break;
                }
            }
        } while (ch != 5);

    }

}
