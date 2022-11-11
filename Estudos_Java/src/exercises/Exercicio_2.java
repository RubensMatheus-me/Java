package exercises;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_2 {
    public static void main (String[] args){
        System.out.printf("Exercicio 2%nFaça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais%n");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();
        double raioQuadrado = Math.pow(raio, 2);
        
        double area = pi * raioQuadrado;

        System.out.printf("Area = %.4f", area);

        sc.close();
    }

}
