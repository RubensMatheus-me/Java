package javabasics;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;


public class Enum {
    public static void main (String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.PROCESSING;
        OrderStatus os2 = OrderStatus.valueOf("PROCESSING");
        System.out.println("1:" + os1 + " 2: " + os2);
    }
}
