package exercises;
import java.util.Scanner;


public class Exercicio_3if_Else {
    public static void main (String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.printf("Exercicio 3%n Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem Sao Multiplos ou Nao saoMultiplos, indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente%n");

        System.out.print("A: ");
        int a = sc.nextInt();

        System.out.print("B: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) { 
            System.out.println("Os numeros são multiplos entre si.");

        }
        else {
            System.out.println("Os numeros não são multiplos entre si.");
        }

        sc.close();
    }
}
