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
}