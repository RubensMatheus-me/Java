package entities;

import exceptions.ErrorMsgException;

public class AccountTryCatch {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    
    public AccountTryCatch() {
    }

    public AccountTryCatch(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit (Double amount) {
        balance += amount;
    }

    public void withdraw (Double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            throw new ErrorMsgException("withdrawal error: the amount exceeds the limit");
        }
        if (amount > getBalance()) {
            throw new ErrorMsgException("withdrawal error: insufficient balance");
        }
    }
}
