package com.bimarsh.tdd;

public class Dollar extends MoneyConversion {

    public Dollar(double amount){
        this.amount = amount;

    }

    public MoneyConversion convertCurr(float rate){
        return new Dollar(amount*rate);
    }

    public double getAmount(){
        return amount;
    }

}
