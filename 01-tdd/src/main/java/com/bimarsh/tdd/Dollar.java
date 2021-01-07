package com.bimarsh.tdd;

public class Dollar {

    double amount;

    public Dollar(double amount){
        this.amount = amount;

    }

    public Dollar multiply(float rate){
        return new Dollar(amount*rate);
    }

    public double getAmount(){
        return amount;
    }
}
