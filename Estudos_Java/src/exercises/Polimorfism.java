package exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProductPolimorfism;
import entities.ProductPolimorfism;
import entities.UsedProductPolimorfism;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;



public class Polimorfism {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<ProductPolimorfism> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int p = sc.nextInt();

        for(int i = 0; i < p; i++ ) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i) ? ");
            char ch = sc.next().charAt(0);

            if(ch == 'i') {
                System.out.print("Name: ");
                sc.nextLine();
                String product = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                ProductPolimorfism pp = new ImportedProductPolimorfism(product, price, customsFee);
                list.add(pp);

            }else if (ch == 'c') {
                System.out.print("Name: ");
                sc.nextLine();
                String product = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                ProductPolimorfism pp = new ProductPolimorfism(product, price);
                list.add(pp);

            }else if (ch == 'u') {
                System.out.print("Name: ");
                sc.nextLine();
                String product = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                Date manufacture = sdf.parse(sc.nextLine());
                ProductPolimorfism pp = new UsedProductPolimorfism(product, price, manufacture);
                list.add(pp);

            } else {
                System.out.println("Value Incorrect!");
            }
        }
    
            System.out.println();
            System.out.println("PRICE TAGS:");
            for (ProductPolimorfism products : list) {
                System.out.println(products.priceTag());
            }
        sc.close();       
    }
}
