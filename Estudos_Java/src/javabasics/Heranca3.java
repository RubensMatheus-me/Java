package javabasics;

public class Heranca3 extends Heranca {
    private Double interestRate;

    public Heranca3() {
        super();
    }

    public Heranca3(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override 
    public void withdraw(double amount) {
        balance -= amount;
    }
}
