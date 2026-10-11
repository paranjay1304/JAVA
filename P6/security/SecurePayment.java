package P6.security;

import P6.payment.Payment;

public interface SecurePayment extends Payment {
    void verifyPayment();
}