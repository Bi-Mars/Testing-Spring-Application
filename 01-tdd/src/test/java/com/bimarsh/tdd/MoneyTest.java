package com.bimarsh.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/*
 * Created By Bimarsh Sharma on 2021-01-05
 */
public class MoneyTest {

    @Test
    void testMultipyDollar(){
        Dollar five = new Dollar(5);
       //Dollar product = five.multiply(2);
        assertEquals(new Dollar(10), five.multiplyDollar(2));
       // product = five.multiply(3);
        assertEquals(new Dollar(15), five.multiplyDollar(3));
    }

    @Test
    void testEqualityDollar(){
        // Same: assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void testMultiplicationNepaliRupee(){
        NepaliRuppee nepaliRuppee = new NepaliRuppee(2);
        assertEquals(new NepaliRuppee(200), nepaliRuppee.multiplyNepaliRuppee(100));
        assertEquals(new NepaliRuppee(100), nepaliRuppee.multiplyNepaliRuppee(50));
    }

    @Test
    void testEqualityNepaliRuppe(){
        assertEquals(new NepaliRuppee(5), new NepaliRuppee(5));
        assertNotEquals(new NepaliRuppee(10), new NepaliRuppee(15));
    }
}
