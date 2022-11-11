package javabasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Names:");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Acess position: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) { //erro de colocar a posicao que nao existe no vetor
            System.out.println("Invalid Position!");
        }
        catch (InputMismatchException e) { //erro de colocar letra em um int de posicao do vetor
            System.out.println("Input Error!");
        }
        System.out.println("End of program");

        sc.close();
    }
}
