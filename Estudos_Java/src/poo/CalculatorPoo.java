package poo;

import java.util.Scanner;

import util.Calculator;

import java.util.Locale;

public class CalculatorPoo {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        
        double radius = sc.nextDouble();

        double c = Calculator.circunference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Radius: %.2f%nCircumference: %.2f%nVolume: %.2f%nPI value: %.2f%n", radius, c, v, Calculator.PI);

        sc.close();
    }
}
