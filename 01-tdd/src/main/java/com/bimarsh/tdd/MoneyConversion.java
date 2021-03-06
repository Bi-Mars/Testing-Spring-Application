package com.bimarsh.tdd;

public class MoneyConversion implements Expression {

    // private field cannot be inherited
   protected double amount;
   protected  String currency;

    public MoneyConversion(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected String getCurrency(){
        return currency;
    }

   public MoneyConversion convertCurr(float rate){
        return new MoneyConversion(amount*rate, this.currency);
   }

   @Override
   public MoneyConversion reduce(String toCurrency){
        return this;
   }

   public static MoneyConversion dollar(double amount){
       return new MoneyConversion(amount, "USD");
   }

   public static MoneyConversion nepaliRuppee(double amount){
       return new MoneyConversion(amount, "NRS");
   }

   public Expression add(MoneyConversion addMoney){
    return new Sum(this, addMoney);
   }

    public boolean equals(Object object){
        MoneyConversion moneyConversion = (MoneyConversion) object;
        // dollar should not equal to nrs; thus check the currency
        return  this.amount == moneyConversion.amount
                                && this.currency == moneyConversion.currency;
    }

    @Override
    public String toString(){
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency+"\'" +
                '}';
    }



}
