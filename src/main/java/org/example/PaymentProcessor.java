package org.example;

public class PaymentProcessor {

    public boolean pay(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        return true;
    }
}
