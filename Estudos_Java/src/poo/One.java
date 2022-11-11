package poo;

import java.util.Scanner;
import java.util.Locale;
import entities.OneEmployee;

public class One {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        OneEmployee employee = new OneEmployee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.print("add percent: ");
        double quantity = sc.nextDouble();
        employee.increaseSalary(quantity);

        System.out.println("Updated: " + employee);

        sc.close();
    }
}