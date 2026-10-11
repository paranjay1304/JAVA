package P6.account;

public class SavingsAccount extends Account {
    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void displayDetails() {
        System.out.println("Savings Account: " + holderName +
                ", Balance: Rs." + balance);
    }
}