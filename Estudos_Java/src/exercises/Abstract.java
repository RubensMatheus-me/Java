package exercises;

import java.util.Scanner;

import entities.LegalPersonAbstract;
import entities.PersonAbstract;
import entities.PhysicalPersonAbstract;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Abstract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<PersonAbstract> list = new ArrayList<>();
    
        System.out.print("Enter the number of tax payers ");
        int p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            System.out.println("Tax payer #" + i +" data:");
            System.out.print("Individual or company (c/i)? ");
            char ch = sc.next().charAt(0);

            if(ch == 'i') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Annual Income: ");
                Double annualIncome = sc.nextDouble();
                System.out.print("Health Expeditures: ");
                Double healthExpenditures = sc.nextDouble();

                PersonAbstract pa = new PhysicalPersonAbstract(name, annualIncome, healthExpenditures);
                list.add(pa);

            }else if (ch == 'c') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Annual Income: ");
                Double annualIncome = sc.nextDouble();
                System.out.print("Number of employees : ");
                Integer numberEmployees = sc.nextInt();

                PersonAbstract pa = new LegalPersonAbstract(name, annualIncome, numberEmployees);
                list.add(pa);

            }else {
                System.out.println("ERROR ERROR ERROR");
                break;     
            }
        }
            System.out.println();
            System.out.println("Taxes Paid:");

            for(PersonAbstract persons : list) {
                System.out.println(persons.getName() + ": $" + String.format("%.2f",persons.tax()));
            }

            System.out.println();
            double sum = 0.0;
            
            for(PersonAbstract persons : list) {
                sum += persons.tax();
            }
            System.out.println("Total Taxes: $ " + String.format("%.2f",sum));
        
        sc.close();
    }
}
