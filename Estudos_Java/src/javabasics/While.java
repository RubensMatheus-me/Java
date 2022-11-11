package javabasics;
import java.util.Scanner;
/* 
Sintaxe: // while = enquanto
while (condicao) {
    comando1
    comando2
} REGRA: V: EXECUTA E VOLTA AO WHILE, F : PULA FORA, PARA DE EXECUTAR
*/
public class While {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            x = sc.nextInt();
            soma += x;
        }
        System.out.println("A SOMA DIFERENTE DE 0 DEU: "+ soma);

        sc.close();
    }
}