package exercises;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.EmployeeList;

public class ExerciseList1 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<EmployeeList> listId = new ArrayList<>();

        System.out.println("How many employess will be registred ?");
        int size = sc.nextInt();
        
        EmployeeList[] vect = new EmployeeList[size];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Employee #%d:%n", i + 1);

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Salry: ");
            double salary = sc.nextDouble();
            EmployeeList empt = new EmployeeList(id, name, salary);

            listId.add(empt);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = findId(listId, idsalary);

        if(pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Enter the percent: ");
            double percent = sc.nextDouble();
            listId.get(pos).increseSalary(percent);
        }

        System.out.println("List of Employee");
        for (EmployeeList empt : listId) {
            System.out.println(empt);
        }

        sc.close();
    }
    public static Integer findId(List<EmployeeList> list, int id) {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getId() == id ) {
                return i;

            }
        }   
        return null;
    }

}
