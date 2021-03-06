package com.bimarsh.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/*
 * Created By Bimarsh Sharma on 2021-01-05
 * Dollar and Nepali Rupees have similar characterisitcs like equals method:
 * Don't have any direct reference to subclasses
 */
public class MoneyTest {

    @Test
    void testConvertCurrency(){
       // Dollar five = new Dollar(5);
        MoneyConversion five = MoneyConversion.dollar(5); // use static method
       //Dollar product = five.multiply(2);
        assertEquals(MoneyConversion.dollar(10), five.convertCurr(2));
       // product = five.multiply(3);
        assertEquals(MoneyConversion.dollar(15), five.convertCurr(3));

        MoneyConversion nepaliRuppee = MoneyConversion.nepaliRuppee(2);
        assertEquals(MoneyConversion.nepaliRuppee(200), nepaliRuppee.convertCurr(100));
        assertEquals(MoneyConversion.nepaliRuppee(100), nepaliRuppee.convertCurr(50));
    }

    @Test
    void testEqualityCurrency(){
        // Same: assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertEquals(MoneyConversion.dollar(5), MoneyConversion.dollar(5));
        assertNotEquals(MoneyConversion.dollar(5), MoneyConversion.dollar(8));

        assertEquals(MoneyConversion.nepaliRuppee(5), MoneyConversion.nepaliRuppee(5));
        assertNotEquals(MoneyConversion.dollar(5), MoneyConversion.nepaliRuppee(5));

    }

    @Test
    void testCurrency(){
        assertEquals("USD", MoneyConversion.dollar(1).getCurrency());
        assertEquals("NRS", MoneyConversion.nepaliRuppee(5).getCurrency());
    }

    @Test
    void testAdditionSameCurrency(){
        MoneyConversion five = MoneyConversion.dollar(5);
        Expression sum = five.add(five);
        Bank bank = new Bank();
        MoneyConversion reduced = bank.reduce(sum, "USD");
        assertEquals(MoneyConversion.dollar(10), reduced);
    }

    @Test
    void testPlusReturnSum(){
        MoneyConversion five = MoneyConversion.dollar(5);
        Expression result = five.add(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augmend);
        assertEquals(five, sum.addmend);
    }

    @Test
    void testReduceSum(){
        Expression sum = new Sum(MoneyConversion.dollar(3), MoneyConversion.dollar(4));
        Bank bank = new Bank();
        MoneyConversion result = bank.reduce(sum, "USD");
        assertEquals(MoneyConversion.dollar(7), result);
    }

    @Test
    void testReduceMoney(){
        Bank bank = new Bank();
        MoneyConversion result = bank.reduce(MoneyConversion.dollar(1), "USD");
        assertEquals(MoneyConversion.dollar(1), result);
    }

}
