package entities;

public class LegalPersonAbstract extends PersonAbstract {

    private Integer numberEmployees;

    public LegalPersonAbstract() {
        super();
    }

    public LegalPersonAbstract(String name, Double AnnualIncome, Integer numberEmplooyes) {
        super(name, AnnualIncome);
        this.numberEmployees = numberEmplooyes;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    @Override
    public Double tax() {
        double tax = 0.0;

        if(getNumberEmployees() < 10) {
            tax = (super.getAnnualIncome() * 0.16);
        }else {
            tax = (super.getAnnualIncome() * 0.14);
        }
        return tax;
    }
    
}
