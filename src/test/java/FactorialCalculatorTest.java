package test.java;

import main.java.FactorialCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {
    @Test
    public void testFactorialForZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialForOne() {
        assertEquals(FactorialCalculator.factorial(1), 1);
    }

    @Test
    public void testFactorialForPositiveNumber() {
        assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialForNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}
