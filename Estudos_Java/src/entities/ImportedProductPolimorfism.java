package entities;

public class ImportedProductPolimorfism extends ProductPolimorfism {

    private Double customsFee;

    public ImportedProductPolimorfism() {
        super();
    }

    public ImportedProductPolimorfism(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + " (Customs fee: $ " + getCustomsFee() + ")";
    }

    public Double totalPrice() {
        return super.getPrice() + customsFee;
    } 
}
