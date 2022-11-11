package javabasics;

public class Heranca2 extends Heranca {

    private Double loanLimit;

    public Heranca2() {
        super();
    }

    public Heranca2(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }   

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance -= amount - 10.0; //deve-se utilizar o protected (balance) no Heranca para liberar acesso a subclasses
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
