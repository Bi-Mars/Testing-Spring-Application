package com.bimarsh.tdd;

public abstract class MoneyConversion {

   protected double amount;

   public abstract MoneyConversion convertCurr(float rate);

   public static MoneyConversion dollar(double amount){
       return new Dollar(amount);
   }

   public static MoneyConversion nepaliRuppee(double amount){
       return new NepaliRuppee(amount);
   }

    public boolean equals(Object object){
        MoneyConversion moneyConversion = (MoneyConversion) object;
        return  this.amount == moneyConversion.amount
                                && getClass().equals(object.getClass());
    }

}
