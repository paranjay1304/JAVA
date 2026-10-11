package P6.account;

public class CurrentAccount extends Account {
    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void displayDetails() {
        System.out.println("Current Account: " + holderName +
                ", Balance: Rs." + balance);
    }
}