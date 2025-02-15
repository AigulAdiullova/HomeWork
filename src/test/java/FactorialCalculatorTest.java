package test.java;

import main.java.FactorialCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    @Test
    void testFactorialForZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testFactorialForOne() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    void testFactorialForPositiveNumber() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testFactorialForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }
}