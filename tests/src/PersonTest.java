import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3;
    @BeforeEach
    void setUp() {

        p1 = new Person("000001", "John", "Tester1", "Mr.", 1965);
        p2 = new Person("000002", "Sarah", "Tester2", "Mrs.", 1988);
        p3 = new Person("000003", "James", "Tester3", "Esq.", 1990);

    }

    @Test
    void setIDSeed() {
        p1.setID("000004");
        assertEquals("000004", p1.getID());
    }

    @Test
    void setID() {
        p1.setID("000004");
        assertEquals("000004", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Frank");
        assertEquals("Frank", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p2.setLastName("Nicole");
        assertEquals("Nicole", p2.getLastName());
    }

    @Test
    void setTitle() {
        p3.setTitle("Sr.");
        assertEquals("Sr.", p3.getTitle());
    }

    @Test
    void setYob() {
        p3.setYOB(1999);
        assertEquals(1999, p3.getYOB());
    }

    @Test
    void testToString() {
        p1.setFirstName("Frank");
        assertEquals("Frank", p1.getFirstName());
    }

    @Test
    void fullName() {
        p1.setFirstName("Frank ");
        p1.setLastName("Tester1");
        assertEquals("Frank Tester1", p1.FullName());
    }

    @Test
    void formalName() {
        p2.setTitle("Mrs. ");
        p2.FullName();
        assertEquals("Mrs. 000002Sarah", p2.FormalName());
    }

    @Test
    void toCSVDataRecord() {
        assertEquals("Tester1,000001,John,Mr.,1965", p1.toCSVDataRecord());
    }
}