package exercises;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_4 {
    public static void main (String[] args) {
        System.out.printf("Exercicio 4%nFazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.%n");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int NUMBER = sc.nextInt();
        int HOURS = sc.nextInt();
        double VALUE_HOURS = sc.nextDouble();
        
        double SALARY = HOURS * VALUE_HOURS;

        System.out.printf("NUMBER: " + NUMBER + "%nSALARY = U$ %.2f", SALARY);


        sc.close();
    }    
}