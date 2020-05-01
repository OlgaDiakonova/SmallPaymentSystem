package com.go2it.edu.demo;

import com.go2it.edu.demo.entity.Payment;
import com.go2it.edu.demo.service.IPaymentProcessorService;
import com.go2it.edu.demo.validator.IPaymentValidatorService;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Application {

    @Inject
    IPaymentProcessorService pmntProcessor = null;
    @Inject
    IPaymentValidatorService pmntValidator = null;

    public void start(Payment pmnt){
        if(pmntValidator.validatePayment(pmnt) != false){
            pmntProcessor.processPayment(pmnt);
        }
    }
}
