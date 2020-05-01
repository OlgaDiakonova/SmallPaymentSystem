package com.go2it.edu.demo.service;

import com.go2it.edu.demo.entity.Payment;

import javax.inject.Named;

@Named
public class PaymentProcessService implements IPaymentProcessorService {

    public PaymentProcessService() {

    }

    @Override
    public void processPayment(Payment pmnt) {
        System.out.println("Payment is processed!");
    }
}
