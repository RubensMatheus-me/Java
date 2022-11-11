package exercises;
import java.util.Scanner;

public class Exercicio_2if_Else {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Exercicio 2%nFazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.%n");

        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.printf("O seu numero: %d é par!", number);
        }
        else {
            System.out.printf("O seu numero: %d é impar!", number);

        }
        sc.close();
    }
}
