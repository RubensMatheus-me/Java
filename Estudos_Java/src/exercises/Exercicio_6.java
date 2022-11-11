package exercises;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_6 {
    public static void main (String[] args) {
        System.out.printf("Exercicio 6%nFazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:%na) a área do triângulo retângulo que tem A por base e C por altura.%nb) a área do círculo de raio C. (pi = 3.14159)%nc) a área do trapézio que tem A e B por bases e C por altura.%nd) a área do quadrado que tem lado B.%ne) a área do retângulo que tem lados A e B.%n");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(); // base(a)
        double b = sc.nextDouble();
        double c = sc.nextDouble(); // altura(a)

        double areaTriangle =  (a * c) / 2;

        double pi = 3.14159;
        double areaCircle = pi * Math.pow(c,2);

        double areaTrapeze = ((a + b) * c) / 2;

        double areaSquare = Math.pow(b,2);

        double areaRectangle = a * b;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", areaTriangle, areaCircle, areaTrapeze, areaSquare, areaRectangle);

        sc.close();
    }
}
