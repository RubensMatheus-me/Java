package exercises;
import java.util.Scanner;

public class Exercicio_5if_Else {
    public static void main (String[] args) {
        System.out.printf("Exercicio 5%n Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.%n");
        
        Scanner sc = new Scanner(System.in);

        System.out.printf("");

        System.out.print("Qual o código: ");
        int code = sc.nextInt();

        System.out.print("Qual a quantidade: ");
        int quantity = sc.nextInt();

        double preco;
        if (code >= 5 || code <= 0) {
            System.out.println("Nao tem isso ai nao");
        }
        else if (code == 1) {
            preco = 4.00;
            double quantity_total = preco * quantity;
            System.out.printf("O total deu: %.2f", quantity_total);
        }
        else if (code == 2) {
            preco = 4.50;
            double quantity_total = preco * quantity;
            System.out.printf("O total deu: %.2f", quantity_total);
        }
        else if (code == 3) {
            preco = 5.00;
            double quantity_total = preco * quantity;
            System.out.printf("O total deu: %.2f", quantity_total);
        }
        else if (code == 4) {
            preco = 2.00;
            double quantity_total = preco * quantity;
            System.out.printf("O total deu: %.2f", quantity_total);
        }
        else {
            preco = 1.50;
            double quantity_total = preco * quantity;
            System.out.printf("O total deu: %.2f", quantity_total);
        }
    
        sc.close();
    }

}