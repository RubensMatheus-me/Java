package javabasics;
import java.util.Scanner;

public class For {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
    /*
    sintaxe: 
    for (inicio ; condicao ; incremento) {
        comando1
        comando2
    }
    o incremento será lido após a primeira rodada do for.
    */

        System.out.println("Leia N quantidade de numeros e N numeros inteiros e some eles");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i = i + 1) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(" o seu for rodou "+ n + " vezes e a soma foi: " + soma);


        //Contagem com for:
    
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("Contagem: "+ i);
        }
        /*
        contagem regressiva com for:
        for (int i = 4; i >= 0; i = i - 1) {
            System.out.println("Contagem regressiva: "+ i);
        }
        */
        sc.close();
    }
}

//Contagem com for:
