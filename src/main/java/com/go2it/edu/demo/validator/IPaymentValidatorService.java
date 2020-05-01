package com.go2it.edu.demo.validator;

import com.go2it.edu.demo.entity.Payment;

public interface IPaymentValidatorService {
    boolean validatePayment(Payment pmnt);
}
