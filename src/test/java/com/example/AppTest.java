package com.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest{

    App calculator = new App();

    @Test
    public void testAdd(){
        assertEquals(30,calculator.add(20,10));
    }

    @Test
    public void testSub(){
        assertEquals(5,calculator.sub(10,5));
    }
}