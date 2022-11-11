package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountTryCatch;
import exceptions.ErrorMsgException;

public class ExerciceTryCatch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();

        AccountTryCatch acc = new AccountTryCatch(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.println("Enter amount for withdraw: ");
        
        try {
            acc.withdraw(sc.nextDouble());
            System.out.println("New balance: " + acc.getBalance());
        }
        catch(ErrorMsgException error) {
            System.out.println(error.getMessage());
        }


        sc.close();
    }
}
