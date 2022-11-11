package exercises;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_1 {
    public static void main (String[] args) {
        System.out.println("Olá, vamos fazer exercicios");

        System.out.printf("Exercicio 1%nSomar 2 numeros%n");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double soma = x + y;

        System.out.printf("A soma deu: %.1f", soma);

        sc.close();
    }
}
