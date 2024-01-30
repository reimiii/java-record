package franxx.code.record.data;

import org.junit.jupiter.api.Test;

import java.lang.reflect.RecordComponent;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void create() {
        Customer customer = new Customer("1", "Mee");
        assertNotNull(customer);
        System.out.println(customer);
    }

    @Test
    void getRecordProps() {

        Customer customer = new Customer("1", "Mee");
        assertNotNull(customer);
        System.out.println(customer);

        assertEquals("1", customer.id());
        assertEquals("MEE", customer.name());
    }

    @Test
    void constructor() {

        Customer customer = new Customer("1", "Mee");
        assertNotNull(customer);
        System.out.println(customer);

        assertEquals("1", customer.id());
        assertEquals("MEE", customer.name());

        assertNull(customer.email());
    }


    @Test
    void canonicalConstructor() {

        Customer customer = new Customer("SAMSUNG", "Mee", "LOCAL@HOST");
        assertNotNull(customer);
        System.out.println(customer);

        assertEquals("samsung", customer.id());
        assertEquals("MEE", customer.name());
        assertEquals("local@host", customer.email());

        assertNotNull(customer.email());
    }

    @Test
    void recordMethod() {

        Customer customer = new Customer("SAMSUNG", "Mee", "LOCAL@HOST");
        assertNotNull(customer);
        System.out.println(customer);

        assertEquals("Good Morning: Zero, my name is: MEE", customer.hello("Zero"));
    }

    @Test
    void recordEqual() {

        Customer customer1 = new Customer("SAMSUNG", "Mee", "LOCAL@HOST");
        Customer customer2 = new Customer("SAMSUNG", "Mee", "LOCAL@HOST");

        assertTrue(customer2.equals(customer1));
        assertEquals(customer1.hashCode(), customer2.hashCode());
        assertEquals(customer1.toString(), customer2.toString());

    }

    @Test
    void reflection() {

        assertTrue(Customer.class.isRecord());

        RecordComponent[] components = Customer.class.getRecordComponents();
        assertEquals(3, components.length);
    }
}