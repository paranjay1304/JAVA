package P6;

import P6.account.*;
import P6.payment.*;
import P6.tagging.OnlineTransaction;

public class Main {
    public static void main(String[] args) {
        Account account = new SavingsAccount("John Smith", 25000);
        account.displayDetails();

        account = new CurrentAccount("Mary Jones", 50000);
        account.displayDetails();

        Payment upi = new UIPayment();
        Payment card = new CardPayment();

        upi.pay(1500);
        ((UIPayment) upi).verifyPayment();

        card.pay(3000);

        System.out.println("UPI is online: " +
                (upi instanceof OnlineTransaction));
        System.out.println("Card is online: " +
                (card instanceof OnlineTransaction));
    }
}