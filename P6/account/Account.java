package P6.account;

public abstract class Account {
    protected final String holderName;
    protected final double balance;

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract void displayDetails();
}