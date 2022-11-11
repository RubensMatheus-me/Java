package poo;

import java.util.Scanner;
import java.util.Locale;
import entities.BankDeposit;


public class BankDepositPoo {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankDeposit bank;

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Initial deposit ? (y/n): ");
        char initial = sc.next().charAt(0);
        
        if (initial == 'y') {
            System.out.println("Enter initial deposit: ");
            double initialDeposity = sc.nextDouble();
            System.out.println("Account data:");
            bank = new BankDeposit(account, name, initialDeposity);
            System.out.println(bank);

        }else {
            bank = new BankDeposit(account, name);
            System.out.println("Goodbye");
        }

        System.out.println("Enter a deposit value: ");
        double depositvalue = sc.nextDouble();
        bank.depositvalue(depositvalue);
        System.out.printf("Updated account value: %.2f%n",depositvalue);
        System.out.print(bank);

        System.out.print("Enter a withdraw value: ");
        double removevalue = sc.nextDouble();
        bank.removevalue(removevalue);
        System.out.println("Updated Account data:");
        System.out.printf("Updated account value: %.2f%n",removevalue);
        System.out.print(bank);

        sc.close();
    }
}
