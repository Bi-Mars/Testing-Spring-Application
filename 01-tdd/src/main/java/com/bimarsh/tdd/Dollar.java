package com.bimarsh.tdd;

public class Dollar {

    double amount;

    public Dollar(double amount){
        this.amount = amount;

    }

    public Dollar multiplyDollar(float rate){
        return new Dollar(amount*rate);
    }

    public double getAmount(){
        return amount;
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount==dollar.amount;
    }
}
