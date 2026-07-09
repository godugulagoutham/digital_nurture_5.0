import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddPositiveNumbers() {
        assertEquals(8, calculator.add(3, 5));
    }

    @Test
    void shouldAddNegativeNumbers() {
        assertEquals(-2, calculator.add(-3, 1));
    }

    @Test
    void shouldHandleZero() {
        assertEquals(5, calculator.add(5, 0));
    }

    @Test
    void shouldMultiplyNumbers() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void shouldThrowExceptionWhenDivideByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
        assertEquals("Divisor cannot be zero", exception.getMessage());
    }
}
