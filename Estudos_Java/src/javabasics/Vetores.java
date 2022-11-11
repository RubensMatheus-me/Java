package javabasics;

import java.util.Scanner;
import java.util.Locale;

public class Vetores {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura de x pessoas: ");
        int x = sc.nextInt(); 
        double[] vect = new double[x];
        double soma = 0.0;

        for (int i = 0; i < x; i++) {
            vect[i] = sc.nextDouble();
            soma = soma + vect[i];
        } 
        double average = soma / x;
        System.out.println(soma);
        System.out.printf("average heights: %.2f%n", average);
    
        sc.close();
    }
}