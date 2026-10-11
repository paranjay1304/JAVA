package P6.payment;

import P6.security.SecurePayment;
import P6.tagging.OnlineTransaction;

public class UIPayment implements SecurePayment, OnlineTransaction {
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment: Rs." + amount);
    }

    @Override
    public void verifyPayment() {
        System.out.println("UPI payment verified.");
    }
}