package com.bimarsh.unittestspring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void bar() {
        //What are we testing? ClassName
        // Get an Instance of foo class that we are testing
        Foo foo = new Foo();

        // What are we testing in the class? Method
        String result = foo.bar();

        // what are we testing against?
        assertEquals("fooBar", result);
    }
}