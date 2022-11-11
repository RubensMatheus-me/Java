package entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

import entities.enums.OrderStatus2;

public class Order2 {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus2 status;

    private Client client;

    private List<OrderItems> items = new ArrayList<>();

    public Order2(){
    }

    public Order2(Date moment, OrderStatus2 status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public Client getClient() {
        return client;
    }

    public OrderStatus2 getStatus() {
        return status;
    }

    public List<OrderItems> getItems() {
        return items;

    }
    public void setStatus(OrderStatus2 status) {
        this.status = status;
    }

    public void addItems(OrderItems item) {
        items.add(item);
    }

    public void removeItems(OrderItems item) {
        items.remove(item);
    }

    public double total() {
		double sum = 0.0;
		for (OrderItems itens : items) {
			sum += itens.subTotal();
		}
		return sum;
    }

    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItems item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
    }
}
