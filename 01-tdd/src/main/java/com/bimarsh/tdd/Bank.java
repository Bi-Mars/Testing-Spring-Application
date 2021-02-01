package com.bimarsh.tdd;

public class Bank {
    MoneyConversion reduce(Expression source, String toCurrency){
       return source.reduce(toCurrency);
    }
}
