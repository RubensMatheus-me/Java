package exercises;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioDemoSemPoo {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ache a area de 2 triangulos X,Y e mostre o resultado na tela e informe qual o maior");
        
        double tX1, tX2, tX3, tY1, tY2, tY3;
        System.out.println("Triangle 1: ");
        tX1 = sc.nextDouble();
        tX2 = sc.nextDouble();
        tX3 = sc.nextDouble();    

        System.out.println("Triangle 2: ");
        tY1 = sc.nextDouble();
        tY2 = sc.nextDouble();
        tY3 = sc.nextDouble();

        double p = (tX1 + tX2 + tX3) / 2.0;
        double area = Math.sqrt(p * (p - tX1) * (p - tX2) * (p - tX3));
        
        p = (tY1 + tY2 + tY3) / 2.0;
        double area2 = Math.sqrt(p * (p - tY1) * (p - tY2) * (p - tY3));

        System.out.printf("Triangle 1 : %.4f%n", area);
        System.out.printf("Triangle 2 : %.4f%n", area2);

        double max = higherT(area, area2);
        System.out.printf("Larger Triangle: %.4f%n ", max); 

        sc.close();

    }
    public static double higherT (double area, double area2) {
        double aux;
        if (area > area2) {
            aux = area;
        }
        else {
            aux = area2;
        }
        return aux;
    }
}