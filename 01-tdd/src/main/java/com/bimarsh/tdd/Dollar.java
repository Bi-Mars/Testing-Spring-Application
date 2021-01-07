package com.bimarsh.tdd;

public class Dollar {

    double amount;

    public Dollar(double amount){
        this.amount = amount;

    }

    public void multiply(float rate){
        amount = amount * rate;

    }

    public double getAmount(){
        return amount;
    }
}
