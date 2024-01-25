package program;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();

        System.out.print("Is there an initial deposit? (y/n) ");
        char c = sc.next().charAt(0);
        double balance = 0.0;

        if(c == 'y' || c == 'Y') {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }

        Account account = new Account(accountNumber, holderName, balance);

        System.out.println();
        System.out.println("Account data:");
        System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f\n", account.getAccountNumber(), account.getHolderName(), account.getBalance());

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("\nUpdated account data:");
        System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f\n", account.getAccountNumber(), account.getHolderName(), account.getBalance());

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("\nUpdated account data:");
        System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f\n", account.getAccountNumber(), account.getHolderName(), account.getBalance());

    }
}
