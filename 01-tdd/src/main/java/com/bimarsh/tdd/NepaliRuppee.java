package com.bimarsh.tdd;

//Built class 1st
public class NepaliRuppee {

    private double amount;

    //constructor -  2nd
    public NepaliRuppee(double amount){
        this.amount = amount;
    }

    public NepaliRuppee multiplyNepaliRuppee(float conversionRate){
        return new NepaliRuppee(amount*conversionRate);
    }

    public boolean equals(Object object){
        NepaliRuppee nepaliRuppee = (NepaliRuppee) object;
        return nepaliRuppee.amount == this.amount;
    }

}
