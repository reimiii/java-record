package franxx.code.record.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void create() {

        Point point = new Point(10, 10);
        assertNotNull(point);

        assertEquals(10, point.x());
        assertEquals(10, point.y());
    }
}