package com.go2it.edu.demo.service;

import org.springframework.beans.factory.annotation.Value;

import javax.inject.Named;
import java.time.LocalDate;

@Named
public class PaymentService implements IPaymentProcessorService {
    @Value("123")
    private int number;
    @Value("2020-04-03")
    private String date;
    @Value("Ivan Ivanov")
    private String clientName;
    @Value("123.00")
    private double sum;

    public PaymentService() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public void processPayment() {
        System.out.println("Payment is processed!");
    }
}
