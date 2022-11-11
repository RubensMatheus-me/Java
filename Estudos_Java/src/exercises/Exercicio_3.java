package exercises;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio_3 {
    public static void main (String[] args){
        System.out.printf("Exercicio 3%nFazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).%n");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        double diferença =  (A * B - C * D);
        System.out.println("A diferença dos valores são: " + diferença);

        sc.close();
    }    
}
