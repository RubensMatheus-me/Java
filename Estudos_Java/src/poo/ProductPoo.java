package poo;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class ProductPoo {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Enter the Product name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product data: " + product);
        System.out.print("add to stock: ");

        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        
        System.out.print("Remove to stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
    
}
