package com.go2it.edu.demo.validator;

import com.go2it.edu.demo.entity.Payment;

import javax.inject.Named;

@Named
public class ValidatorService implements IPaymentValidatorService {

    public ValidatorService() {
    }

    public boolean validatePayment(Payment payment) {
        if(payment != null){
            System.out.println("Payment is validated!");
            return true;
        }else{
            return false;
        }

    }
}
