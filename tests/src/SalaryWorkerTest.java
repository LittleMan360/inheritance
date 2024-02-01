import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    // Declare the workers
    SalaryWorker sw1, sw2;

    // Set up the test fixture
    @BeforeEach
    void setUp() {

        sw1 = new SalaryWorker("00000A", "John", "Tester1", "Mr.", 1990, 12.50, 26000);
        sw2 = new SalaryWorker("00000A", "Sarah", "Tester2", "Mrs.", 1985, 25.00, 52000.0);

    }

    // Test the calculateWeeklyPay method
    @Test
    void calculateWeeklyPay() {
        assertEquals(1000.0, sw2.calculateWeeklyPay(40));
    }
    // Test the displayWeeklyPay method
    @Test
    void displayWeeklyPay() {
        assertEquals("500.00", sw1.displayWeeklyPay(50));
    }
}