package com.codingblackfemales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    // Multiplication tests
    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Integer mul = Calculator.multiply(2, 3);

        assertEquals(6, mul);
    }
    @Test
    @DisplayName("multiply two negative numbers")
    public void testNegMultiplication() {
        final Integer mul = Calculator.multiply(-2, -3);

        assertEquals(6, mul);
    }
    @Test
    @DisplayName("multiply a positive number and negative number")
    public void testNegAndPosMultiplication() {
        final Integer mul = Calculator.multiply(-2, 3);

        assertEquals(-6, mul);
    }
    @Test
    @DisplayName("multiply a number by zero")
    public void testZeroMultiplication() {
        final Integer mul = Calculator.multiply(0, 3);

        assertEquals(0, mul);
    }
    @Test
    @DisplayName("multiply two large numbers")
    public void testLargeMultiplication() {
        final Integer mul = Calculator.multiply(10000, 99999);

        assertEquals(999990000, mul);
    }

    // Division tests
    @Test
    @DisplayName("divide two numbers")
    public void testDivision() {
        final Integer numDivision = Calculator.divide(6, 3);

        assertEquals(2, numDivision);
    }
    @Test
    @DisplayName("divide two negative numbers")
    public void testNegDivision() {
        final Integer numDivision = Calculator.divide(-6, -3);

        assertEquals(2, numDivision);
    }
    @Test
    @DisplayName("divide a positive number and negative number")
    public void testNegAndPosDivision() {
        final Integer numDivision = Calculator.divide(-6, 3);

        assertEquals(-2, numDivision);
    }
    @Test
    @DisplayName("divide zero by a number")
    public void testZeroDivision() {
        final Integer numDivision = Calculator.divide(0, 3);

        assertEquals(0, numDivision);
    }





    @Test
    @DisplayName("divide a number by zero")
    public void testDivisionByZero() {

        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
            final Integer numDivision = Calculator.divide(3, 0);
        }, "NumberFormatException was expected");

        assertEquals("/ by zero", thrown.getMessage());



    }
    @Test
    @DisplayName("divide one large number by another")
    public void testLargeDivision() {
        final Integer numDivision = Calculator.divide(10000000, 200);

        assertEquals(50000, numDivision);
    }

    @Test
    @DisplayName("divide a number by 1")
    public void testOneDivision() {
        final Integer numDivision = Calculator.divide(10000000, 1);

        assertEquals(10000000, numDivision);
    }

    @Test
    @DisplayName("divide a number by itself")
    public void testSelfDivision() {
        final Integer numDivision = Calculator.divide(10000000, 10000000);

        assertEquals(1, numDivision);
    }

    @Test
    @DisplayName("divide a number by a larger number")
    public void testSmallLargeDivision() {
        final Integer numDivision = Calculator.divide(1, 3);

        assertTrue(numDivision > 0);
    }


    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }
}
