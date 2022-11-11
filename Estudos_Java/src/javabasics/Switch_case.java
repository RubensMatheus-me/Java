package javabasics;
import java.util.Scanner;

public class Switch_case {
    static public void main (String[] args) {
        System.out.println("Sistema que leia os dias da semana qnd o usuario colocar o numero de 1 a 7");

        //usando switch-case, switch = avaliar, para não utilizar vários if's, e else's
        //sempre utilizar break; depois do comando dentro do case

        Scanner sc = new Scanner(System.in);

        System.out.println("Day number: ");
        int number = sc.nextInt();
        String dia;

        switch (number) {
        case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terca";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sabado";
            break;
        default:
            dia = "escreveu errado cara";
            break;  
        }

        System.out.println("O dia da semana é: " + dia);
        sc.close();

    }
}
