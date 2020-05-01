package com.go2it.edu.demo.entity;

import org.springframework.beans.factory.annotation.Value;

public class Payment {

    private int number;
    private String date;
    private String clientName;

    public Payment(int number, String date, String clientName, double sum) {
        this.number = number;
        this.date = date;
        this.clientName = clientName;
        this.sum = sum;
    }

    private double sum;

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

    public Payment() {
    }
}
