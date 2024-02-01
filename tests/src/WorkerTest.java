import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2, w3;

    @BeforeEach
    void setUp() {

        w1 = new Worker("00000A", "James", "Tester1", "Mr.", 1971, 15.00);
        w2 = new Worker("00000A", "Sarah", "Tester2", "Ms.", 1985, 16.75);
        w3 = new Worker("00000A", "Connor", "Tester3", "Sr.", 1996, 20.00);

    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(150.0, w1.calculateWeeklyPay(10.0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Weekly pay: 600.0", w1.displayWeeklyPay(40));
    }
}