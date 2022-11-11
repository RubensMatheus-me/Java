package javabasics;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        System.out.println("Olá Mundo");

        /*
         int idade = 25; , #criando variavel idade com valor 25
        
         double altura = 1.75; , #o tipo double é para variavel com tipo flutuante (float)

         char sexo = 'F'; , # variavel do tipo char que atribui apenas 1 letra na string

        System.out.printf("%2.f%n", x) #pega os 2 primeiros numeros decimais 

        int y = 32;
        double x = 10.324565;
        System.out.println(y);
        System.out.printf("%.2f%n", x);
         pegou só 10.32 (2 numeros após o ponto e arredondou o numero.)

        System.out.printf("%.4f%n", x);

         A formatação deixa o float com virgula, para arrumar usaremos o comando Locale para deixar o padrao dos EUA. Para isso o import.locale sera necessário
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        Para concatenar (juntar variaveis em uma string), utiliza-se o +

        System.out.println("Resultado = " + x + " Metros");
        Para o printf
        System.out.printf("Resultado = %.2f metros%n", x);

    ------------------------------------------------------------------
        
        para a formatação de String utiliza-se o %s, para int %d, para float %f e o %n para a quebra de linha, e para char utiliza-se %c
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        -------------------ATIVIDADE-------------------------------------
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5923;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("Products:%n%s, which price is %.2f%n%s, which price is %.2f%n%nRecord: %d years old, code %d and gender %c%n%n Measue with eight decimal places: %.8f%nRouded (three decimal places): %.3f", product1, price1, product2, price2, age, code, gender, measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("%nUS decimal point: %.3f%n", measure);

        Calculos matematicos em Java
        calcular o trapézio 
        area = bmenor + Bmaior dividido por 2 vezes altura(h)
        a = b + B / 2 * h

        double bmenor, bmaior, altura, area;
        bmenor = 6.0;
        bmaior = 8.0;
        altura = 5.0;

       area = (bmenor + bmaior) / 2 * altura;
        System.out.println(area);

        para o usuário digitar os valores qnd iniciar o programa importar.scanner e utilizar o comando:
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* 
        String x;
        x = sc.next();
        System.out.println("Voce digitou: " + x);

        digitar o numero inteiro
        int y;
        y = sc.nextInt();
        System.out.println("O numero digitado foi: " + y);

        digitar o numero double
        double z;
        z = sc.nextDouble();
        System.out.println("Voce digitou o double: " + z);

        digitar o string char, pega apenas o primeiro digito
        char c;
        c = sc.next().charAt(0);
        System.out.println("O char que voce digitou foi: " + c);


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
        
        Funções matematicas em java
        math.sqrt(x) recebe o raiz quadrada e volta o valor correto
        math.pow(x,y) recebe o valor de x elevado a y
        math.abs(x) recebe o valor absoluto de x (deixa todo numero negativo em positivo)
        */

        //ATIVIDADE
        double largura, comprimento, valorm2, area, preco;
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        valorm2 = sc.nextDouble();

        area = largura * comprimento;
        preco = area * valorm2;

        System.out.printf("O terreno de area 300 vale: %.2f por metro quadrado e ficou com o preco de: %.2f", area, preco);


        sc.close();

    }   
}


