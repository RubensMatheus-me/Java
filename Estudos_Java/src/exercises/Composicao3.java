package exercises;

import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import entities.Client;
import entities.Order2;
import entities.OrderItems;
import entities.Product2;
import entities.enums.OrderStatus2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class Composicao3 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String c_name = sc.nextLine();
        System.out.print("Email: ");
        String c_email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date c_birthDate = sdf.parse(sc.next());
        
        Client client = new Client(c_name, c_email, c_birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus2 orderstatus = OrderStatus2.valueOf(sc.next());

        Order2 order = new Order2(new Date(), orderstatus, client);

        System.out.println("How many items to this order ?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " items data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String p_name = sc.nextLine();
            System.out.print("Product price: ");
            double p_price = sc.nextDouble();

            Product2 product = new Product2(p_name, p_price);

            System.out.print("Quantity: ");
            int p_quantity = sc.nextInt();

            OrderItems orderitems = new OrderItems(p_quantity, p_price, product);
            order.addItems(orderitems);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}