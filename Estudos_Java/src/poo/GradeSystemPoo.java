package poo;

import java.util.Scanner;
import java.util.Locale;
import entities.GradeSystem;

public class GradeSystemPoo {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        GradeSystem gradesystem = new GradeSystem();

        System.out.print("Name: ");
        gradesystem.name = sc.nextLine();

        System.out.println("Concept's: ");
        gradesystem.value = sc.nextDouble();
        gradesystem.value = sc.nextDouble();
        gradesystem.value = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", gradesystem.finalGrade());
        if (gradesystem.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", gradesystem.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
