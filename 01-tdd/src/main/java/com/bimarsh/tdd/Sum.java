package com.bimarsh.tdd;

public class Sum implements Expression{
    MoneyConversion augmend;
    MoneyConversion addmend;

    public Sum(MoneyConversion augmend, MoneyConversion addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public MoneyConversion reduce(String toCurrency){
        double amount = augmend.amount + addmend.amount;
        return new MoneyConversion(amount, toCurrency);
    }
}
