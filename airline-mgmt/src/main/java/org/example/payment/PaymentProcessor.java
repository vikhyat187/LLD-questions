package org.example.payment;

public class PaymentProcessor {
    private static volatile PaymentProcessor instance;

    public static PaymentProcessor getInstance(){
        if (instance == null){
            synchronized(Object.class){
                if (instance == null){
                    instance = new PaymentProcessor();
                }
            }
        }
        return instance;
    }

    public void process(){
        System.out.println("Processing payments");
    }
}
