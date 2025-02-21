package com.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9), 0.001);
        assertEquals(2.0, calculator.squareRoot(4), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-5));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0, calculator.naturalLog(1), 0.001);
        assertEquals(1.609, calculator.naturalLog(5), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculator.naturalLog(0));
    }

    @Test
    void testPower() {
        assertEquals(8, calculator.power(2, 3), 0.001);
        assertEquals(1, calculator.power(5, 0), 0.001);
        assertEquals(0.5, calculator.power(2, -1), 0.001);
    }
}
