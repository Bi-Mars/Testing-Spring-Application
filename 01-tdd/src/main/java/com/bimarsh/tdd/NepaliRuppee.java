package com.bimarsh.tdd;

//Built class 1st
public class NepaliRuppee extends MoneyConversion {

    //constructor -  2nd
    public NepaliRuppee(double amount){
        this.amount = amount;
    }

    public NepaliRuppee multiplyNepaliRuppee(float conversionRate){
        return new NepaliRuppee(amount*conversionRate);
    }


}
