package poo;

import java.util.Scanner;

import entities.Triangle;

import java.util.Locale;

public class TrianglePoo{

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Triangle 1: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();    

        System.out.println("Triangle 2: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle 1 : %.4f%n", areaX);
        System.out.printf("Triangle 2 : %.4f%n", areaY);

        double max = higherT(areaX, areaY);
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