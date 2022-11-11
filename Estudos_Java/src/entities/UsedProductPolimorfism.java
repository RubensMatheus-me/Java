package entities;

import java.util.Date;
import java.text.SimpleDateFormat;


public class UsedProductPolimorfism extends ProductPolimorfism{

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manuFactureDate;
    
    public UsedProductPolimorfism(String name, Double price, Date manufacturDate) {
        super(name, price);
        this.manuFactureDate = manufacturDate;
    }
    
    public Date getManuFactureDate() {
        return manuFactureDate;
    }

    public void setManuFactureDate(Date manufacDate) {
        this.manuFactureDate = manufacDate;
    }

    @Override
    public String priceTag() {
        return "(Used)" + super.priceTag() + " (Manufacture date: " + sdf.format(getManuFactureDate()) + ")";
    }
}
