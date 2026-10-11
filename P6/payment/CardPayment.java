package P6.payment;

import P6.tagging.OnlineTransaction;

public class CardPayment implements Payment, OnlineTransaction {
    @Override
    public void pay(double amount) {
        System.out.println("Card payment: Rs." + amount);
    }
}