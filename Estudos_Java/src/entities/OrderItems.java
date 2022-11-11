package entities;

public class OrderItems {

    private Integer quantity;
    private double price;

    private Product2 product;

    public OrderItems() {
    }

    public OrderItems(Integer quantity, double price, Product2 product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Product2 getPoduct() {
        return product;
    }

    public double subTotal() {
        return quantity * price;
    }

    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
