package org.iis.ajnebro;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * We created a CalculatorTest in which we tested the functionality
 * of our methods created in the Calculator class.
 */
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    /**
     * Test for add method.
     */
    @Test
    void testAdd() {
        assertEquals(15.0, calculator.add(10.0, 5.0), "10 + 5 should equal 15");
    }

    /**
     * Test for subtract method.
     */
    @Test
    void testSubtract() {
        assertEquals(12.0, calculator.subtract(20.0, 8.0), "20 - 8 should equal 12");
    }

    /**
     * Test for multiply method.
     */
    @Test
    void testMultiply() {
        assertEquals(20.0, calculator.multiply(5.0, 4.0), "5 * 4 should equal 20");
    }

    /**
     * Test for divide method.
     */
    @Test
    void testDivide() {
        assertEquals(50.0, calculator.divide(250.0, 5.0), "250 / 5 should equal 50");
    }

    /**
     * Test to verify that division by zero throws an exception.
     */
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(3.0, 0.0), "Dividing by zero should throw IllegalArgumentException");
    }

}
