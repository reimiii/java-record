package franxx.code.record.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void generic() {

        assertEquals("Mee", new Data<String>("Mee").data());
        assertEquals(10, new Data<Integer>(10).data());
    }
}