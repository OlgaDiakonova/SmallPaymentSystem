package com.go2it.edu.demo;

import com.go2it.edu.demo.entity.Payment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Payment pmnt = new Payment(123,"202003","Ivanov", 200.00);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Application application = (Application)ctx.getBean("application");
        application.start(pmnt);
    }
}
