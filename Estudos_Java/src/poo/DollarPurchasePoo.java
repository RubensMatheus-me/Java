package poo;

import java.util.Scanner;
import java.util.Locale;

import util.CurrencyConverter;

public class DollarPurchasePoo {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is dollar price?: ");
        double dollar = sc.nextDouble();
        System.out.print("Price to buy: ");
        double price = sc.nextDouble();

        double total = CurrencyConverter.total(dollar, price);
        double converter = CurrencyConverter.converter(total);

        System.out.printf("Amout to be paid in reais: %.2f%n", converter);


        sc.close();
    }
}
