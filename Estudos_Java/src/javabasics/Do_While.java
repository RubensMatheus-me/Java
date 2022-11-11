package javabasics;
import java.util.Scanner;
import java.util.Locale;

public class Do_While {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US); // locale precisa ser antes do scanner para conseguir usar ponto nos inputs
        Scanner sc = new Scanner(System.in);

        /*
        Sintaxe:
        do { 
          comando1
          comando2
        } while (condicao);
        Regra: se for V volta pro do, se for F, vai embora
        */

        char resp;
        do {
            System.out.print("Qual a temperatura em Celsius ? ");
            double c = sc.nextDouble();
            double f = (9.0 * c) / 5.0 + 32.0;
            System.out.printf("Equivalente em Farenheit: %.1f%n", f);
            System.out.print("Deseja repetir ? (s/n) ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
