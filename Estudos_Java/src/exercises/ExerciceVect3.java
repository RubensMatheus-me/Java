package exercises;

import java.util.Scanner;

import entities.Person;

import java.util.Locale;

public class ExerciceVect3 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        Person[] vect = new Person[size];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%d person: %n",  i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            double height = sc.nextDouble();
            vect[i] = new Person(name, age, height);
        }

        double sumH = 0.0;
        int sizeA = 0;
        double sizeTotal;

        for (int i = 0; i < vect.length; i++) {
            sumH = sumH + vect[i].getHeight();
            if (vect[i].getAge() < 16) {
                sizeA = sizeA + 1;
            }
        }

        sumH = sumH / size;
        sizeTotal = ((double)sizeA/ size) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", sumH);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", sizeTotal);
        
        for (int i = 0; i < vect.length; i++) {

	        if (vect[i].getAge() < 16) {
	        	System.out.printf("%s\n", vect[i].getName());
            }
        }

        sc.close();
    }
}
