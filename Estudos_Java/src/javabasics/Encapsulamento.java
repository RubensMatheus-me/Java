package javabasics;

public class Encapsulamento {;

public class Product { // entities
    private String name; // não pode ser alterado nem acessado por conta do private.
    private double price;
    private int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public String getName() { // para pegar o que esta na string name utiliza getName
        return name;
    }
    public void setName(String name) { // para alterar o que esta na string name utiliza setName
        this.name = name;
    }

    public void addProducts(int quantity) { 
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
            + ",  $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());   
    }
}
}
