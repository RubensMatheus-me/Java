package entities;

public class PhysicalPersonAbstract extends PersonAbstract {

    private Double healthExpenditures;

    public PhysicalPersonAbstract(){
        super();
    }

    public PhysicalPersonAbstract(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double tax = 0.0;
        if (getAnnualIncome() < 20000.00) {
            tax = (super.getAnnualIncome() * 0.15) - (getHealthExpenditures() * 0.5);

        }else {
            tax = (super.getAnnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
        }
        return tax;
    }
}
