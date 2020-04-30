package com.go2it.edu.demo.service;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ValidatorService implements IPaymentValidatorService{

    @Inject
    PaymentService payment = null;

    public PaymentService getPayment() {
        return payment;
    }

    public void setPayment(PaymentService payment) {
        this.payment = payment;
    }

    public ValidatorService() {
    }

    public boolean validatePayment() {
        if(payment != null){
            System.out.println("Payment is validated!");
            return true;
        }else{
            return false;
        }

    }
}
