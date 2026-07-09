import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddDeposits() {
        assertEquals(1500, calculator.add(1000, 500));
    }

    @Test
    void shouldSubtractWithdrawals() {
        assertEquals(300, calculator.subtract(500, 200));
    }
}
