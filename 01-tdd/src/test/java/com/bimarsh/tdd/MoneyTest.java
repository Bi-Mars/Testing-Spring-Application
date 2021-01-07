package com.bimarsh.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created By Bimarsh Sharma on 2021-01-05
 */
public class MoneyTest {

    @Test
    void testMultipy(){
        Dollar five = new Dollar(5);
       Dollar product = five.multiply(2);
        assertEquals(10, product.getAmount());
        product = five.multiply(3);
        assertEquals(15, product.getAmount());
    }
}
