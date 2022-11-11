package entities;

public class ProductVect {
    
    private String name;
    private double price;

    public ProductVect(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
