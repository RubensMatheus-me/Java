package javabasics;

import java.util.Scanner;
import java.util.Locale;
import entities.ProductVect;

public class VetoresDois {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt(); 
        ProductVect[] vect = new ProductVect[e];

        for (int i = 0; i < vect.length; i++) { //vect.length pega o tamanho total do vetor sem depender de outra variavel
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductVect(price, name);
        }
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum = sum + vect[i].getPrice();
        }
        double avg = sum / e;

        System.out.printf("Average prices: %.2f%n", avg);

        sc.close();
    }
}
