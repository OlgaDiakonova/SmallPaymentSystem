package com.go2it.edu.demo.validator;

import com.go2it.edu.demo.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class ValidatorService implements IPaymentValidatorService {

    public ValidatorService() {
    }

    public boolean validatePayment(Payment payment) {

        if (payment != null &&
                payment.getSum() >= 0
                && payment.getClientName() != "Vasya") {
            System.out.println("Payment is validated!" + payment.getSum());
            return true;
        } else {
            //  throw  new Exception();
            return false;
        }

    }

}
