package entities;

public class BankDeposit {
    private int account;
    private String name;
    private double balance;
    
    public BankDeposit(int account, String name) {
        this.account = account;
        this.name = name;
    }
    public BankDeposit(int account, String name, double balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    public double setBalance(double balance) {
        return this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void depositvalue(double depositvalue) {
        balance += depositvalue;
    }

    public void removevalue (double removevalue) {
        balance = (balance - removevalue) - 5.0;
    }

    public String toString() {
        return "Acount " + account
            + ", " + "Holder: "
            + name + ", " + "Balance: "
            + "$ " + String.format("%.2f%n", balance);
    }
}
