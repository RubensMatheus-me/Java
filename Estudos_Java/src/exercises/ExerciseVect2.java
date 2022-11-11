package exercises;

import java.util.Scanner;

import java.util.Locale;


public class ExerciseVect2 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("size number? ");
        int size = sc.nextInt();
        double[] vect = new double[size];
        double sum = 0.0;
        double avg = 0.0;

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
            sum = sum + vect[i];
        }
        
        System.out.print("Valores = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
        avg = sum / vect.length;
        
        System.out.printf("%nSum: %.2f%nAverage:%.2f%n",sum, avg);

        sc.close();
    }
}
