package org.example.payment;

public class Payment {
    private String paymentId;
    private PaymentStatus paymentStatus;
    private double amount;
    private String paymentMethod;

    public void processPayment(){
        this.paymentStatus = PaymentStatus.SUCESS;
    }
}
