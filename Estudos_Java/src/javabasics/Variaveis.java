package javabasics;
import java.util.Locale;

public class Variaveis {
    public static void main (String[] args) {
        System.out.println("Olá Mundo");
        int idade = 25; // #criando variavel idade com valor 25
        
        double altura = 1.75; //o tipo double é para variavel com tipo flutuante (float)
        System.out.println(altura);

        char sexo = 'F'; // variavel do tipo char que atribui apenas 1 letra na string
        System.out.println(sexo);

        //System.out.printf("%2.f%n", x) #pega os 2 primeiros numeros decimais 

        int y = 32;
        double x = 10.324565;
        System.out.println(y);
        System.out.printf("%.2f%n", x);
         //pegou só 10.32 (2 numeros após o ponto e arredondou o numero.)

        System.out.printf("%.4f%n", x); // 4 numeros dps do ponto

        // A formatação deixa o float com virgula, para arrumar usaremos o comando Locale para deixar o padrao dos EUA. Para isso o import.locale sera necessário
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        //Para concatenar (juntar variaveis em uma string), utiliza-se o +

        System.out.println("Resultado = " + x + " Metros");
        //Para o printf
        System.out.printf("Resultado = %.2f metros%n", x);

        //------------------------------------------------------------------
        
        //para a formatação de String utiliza-se o %s, para int %d, para float %f e o %n para a quebra de linha, e para char utiliza-se %c
        String nome = "Maria";
        //int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        /* 
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
        */
    }
}
