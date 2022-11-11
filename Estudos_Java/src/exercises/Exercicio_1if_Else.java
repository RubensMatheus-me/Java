package exercises;
import java.util.Scanner;

public class Exercicio_1if_Else {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Exercicio1%nFazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.%n");

        System.out.println("Int number (- or +): ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.printf("Seu numero %d é negativo.%n", number);
        }
        else {
            System.out.printf("Seu numero %d e positivo%n", number);
        }

        sc.close();
    }
}
