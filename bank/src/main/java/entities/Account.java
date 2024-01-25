package entities;

public class Account {
    private final int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, String holderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        deposit(initialDeposit);
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void deposit(double n) {
        this.balance += n;
    }

    public void withdraw(double n) {
        this.balance -= n + 5.0;
    }

}
