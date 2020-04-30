package com.go2it.edu.demo;

import com.go2it.edu.demo.service.IPaymentProcessorService;
import com.go2it.edu.demo.service.IPaymentValidatorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Application {

    @Inject
    IPaymentProcessorService pmntProcessor = null;
    @Inject
    IPaymentValidatorService pmntValidator = null;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Application application = (Application)ctx.getBean("application");
        application.start();
    }


    public void start(){
        if(pmntValidator.validatePayment() != false){
            pmntProcessor.processPayment();
        }
    }
}
