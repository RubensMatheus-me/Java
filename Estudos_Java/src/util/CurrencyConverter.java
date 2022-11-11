package util;

public class CurrencyConverter {
    
    public static double total (double dollar, double price) {
    return dollar * price;
    }

    public static double converter (double total) {
        return (total * 6.0 / 100.0) + total; 
    }
}
