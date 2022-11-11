package entities;

public abstract class PersonAbstract {
    
    private String name;
    private Double annualIncome;

    public PersonAbstract() {
    }

    public PersonAbstract(String name, Double annuualIncome) {
        this.name = name;
        this.annualIncome = annuualIncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract Double tax();

}
