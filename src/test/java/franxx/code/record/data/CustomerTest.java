package franxx.code.record.data;

import org.junit.jupiter.api.Test;

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
        assertEquals("Mee", customer.name());
    }

    @Test
    void constructor() {

        Customer customer = new Customer("1", "Mee");
        assertNotNull(customer);
        System.out.println(customer);

        assertEquals("1", customer.id());
        assertEquals("Mee", customer.name());

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

}