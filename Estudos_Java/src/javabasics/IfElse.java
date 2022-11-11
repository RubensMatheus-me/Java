package javabasics;
import java.util.Scanner;

public class IfElse {
    public static void main (String[] args) {
        /* 
        simples:( se a condição for verdadeira, irá executar o comando if)

        if ( <condição> ) {
            <comando1>
            <comando2>
        }
        else {
            <comando3>
            <comando4>
        } EXEMPLO:
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Que horas são?: ");
        int hora = sc.nextInt();
        
        if (hora < 12) {
            System.out.println("Ainda e de manha!");

        }
        else if (hora >= 18) {
                System.out.println("Boa noite!");

            }
            else {
                System.out.println("Boa tarde !");
  
            }

        sc.close();

    }    
}
