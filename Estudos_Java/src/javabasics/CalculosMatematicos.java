package javabasics;
import java.util.Scanner;
import java.util.Locale;

public class CalculosMatematicos {
    public static void main (String[] args) {
        /*
        Calculos matematicos em Java
        calcular o trapézio 
        area = bmenor + Bmaior dividido por 2 vezes altura(h)
        a = b + B / 2 * h

        *Funções matematicas em java (não precisa de biblioteca)
        *math.sqrt(x) recebe o raiz quadrada e volta o valor correto
        *math.pow(x,y) recebe o valor de x elevado a y
        *math.abs(x) recebe o valor absoluto de x (deixa todo numero negativo em positivo)
        */

        double bmenor, bmaior, altura, area;
        bmenor = 6.0;
        bmaior = 8.0;
        altura = 5.0;

       area = (bmenor + bmaior) / 2 * altura;
        System.out.println(area);

        //para o usuário digitar os valores qnd iniciar o programa importar.scanner e utilizar o comando:

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Voce digitou: " + x);

        //digitar o numero inteiro
        int y;
        y = sc.nextInt();
        System.out.println("O numero digitado foi: " + y);

        //digitar o numero double
        double z;
        z = sc.nextDouble();
        System.out.println("Voce digitou o double: " + z);

        //digitar o string char, pega apenas o primeiro digito
        char c;
        c = sc.next().charAt(0);
        System.out.println("O char que voce digitou foi: " + c);

        /*
        int x;
        String s1, s2, s3;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        */

        sc.close();

    }
}
