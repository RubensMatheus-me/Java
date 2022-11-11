package javabasics;

import java.util.Scanner;

public class Funcoes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int x = sc.nextInt();        

        System.out.println("Valor 2: ");
        int y = sc.nextInt();

        System.out.println("Valor 3: ");
        int z = sc.nextInt();

        int max = higher(x, y, z);
        result(max);

        sc.close();
    }

    public static int higher(int a, int b, int c) { //funcao que pega o maior valor e retorna o valor
        int aux;
        if (a > b && a > c) {
            aux = a;

        } else if (b > c) {
            aux = b;

        } else {
            aux = c;
        }
        return aux;
    }
    
    public static void result (int value) { //funcao que mostra na tela o resultado do maior valor (void) sem retorno
        System.out.println("Higher: " + value);
    }
}
