package exercises;

import java.util.Scanner;
import java.util.Locale;


public class ExerciseVect1 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number size: ");
        int size = sc.nextInt();
        int[] vect = new int[size];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative Numbers: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d%n",vect[i]);
            }
        }
        sc.close();
    }    
}
