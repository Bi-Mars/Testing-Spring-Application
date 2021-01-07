package com.bimarsh.tdd;

public class MoneyConversion {

   protected double amount;

    public boolean equals(Object object){
        MoneyConversion moneyConversion = (MoneyConversion) object;
        return  this.amount == moneyConversion.amount
                                && getClass().equals(object.getClass());
    }

}
