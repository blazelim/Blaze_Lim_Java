package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void init() {
        calc = new Calculator();
    }

    @Test
    public void adding2IntegersShouldReturnAnInteger() {
        assertEquals(14, calc.add(10,4));
        assertEquals(852, calc.add(426,426));
    }

    @Test
    public void subtracting2IntegersShouldReturnAnInteger() {
        assertEquals(10, calc.subtract(14,4));
        assertEquals(420, calc.subtract(465,45));
    }

    @Test
    public void multiplying2IntegersShouldReturnAnInteger() {
        assertEquals(78,calc.multiply(6,13));
        assertEquals(16, calc.multiply(2,8));
    }

    @Test
    public void dividing2IntegersShouldReturnAnInteger() {
        assertEquals(5, calc.divide(23,4));
        assertEquals(9, calc.divide(63,7));
    }

    @Test
    public void adding2DoublesShouldReturnADouble() {
        assertEquals(5.5, calc.add(2.3,3.2),.001);
        assertEquals(10.0, calc.add(5.3,4.7),.001);
    }

    @Test
    public void subtracting2DoublesShouldReturnADouble() {
        assertEquals(-0.9, calc.subtract(2.3,3.2),.001);
        assertEquals(0.6, calc.subtract(5.3,4.7),.001);
    }

    @Test
    public void multiplying2DoublesShouldReturnADouble() {
        assertEquals(4.32, calc.multiply(1.08,4),.001);
        assertEquals(10, calc.multiply(5.0,2.0),.001);
    }

    @Test
    public void dividing2DoublesShouldReturnADouble() {
        assertEquals(9.3333333, calc.divide(28.0,3),.001);
        assertEquals(7, calc.divide(72,10.2857),.01);
    }
}