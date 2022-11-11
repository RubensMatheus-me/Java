package exercises;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_5 {
    public static void main (String[] args) {
        System.out.printf("Exercicio 5%nFazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.%n");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int numberParts = sc.nextInt();
        double valueParts = sc.nextDouble();

        double total1 = numberParts * valueParts;

        int code2 = sc.nextInt();
        int numberParts2 = sc.nextInt();
        double valueParts2 = sc.nextDouble();

        double total2 = numberParts2 * valueParts2;
        double totally = total1 + total2;

        System.out.printf("CODES: " + code + " and " + code2 + "%nVALOR TOTAL: %.2f", totally);

        sc.close();
    }

}