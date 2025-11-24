package edu.fit.testing.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(1, c.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(6, c.multiply(2, 3));
    }

    @Test
    void testDivide_normal() {
        Calculator c = new Calculator();
        assertEquals(2, c.divide(4, 2));
    }

    @Test
    void testDivide_byZero_shouldThrow() {
        Calculator c = new Calculator();
        assertThrows(ArithmeticException.class,
                     () -> c.divide(4, 0));
          }
    @Test
    public void testMultiply_byZero_shouldBeZero() {
        Calculator c = new Calculator();
        assertEquals(0, c.multiply(0, 5));
    }
    
}
