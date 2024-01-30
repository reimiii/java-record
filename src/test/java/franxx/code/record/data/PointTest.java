package franxx.code.record.data;

import franxx.code.record.annotations.Valid;
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

    @Test
    void staticMethod() {

        assertEquals(0, Point.ZERO.x());
        assertEquals(0, Point.ZERO.y());

        Point point = Point.create(10, 10);
        assertEquals(10, point.x());
        assertEquals(10, point.y());
    }

    @Test
    void annotation() throws NoSuchFieldException, NoSuchMethodException {

        assertNotNull(Point.class.getDeclaredField("x").getAnnotation(Valid.class));
        assertNotNull(Point.class.getDeclaredField("y").getAnnotation(Valid.class));

        assertNotNull(Point.class.getDeclaredMethod("x").getAnnotation(Valid.class));
        assertNotNull(Point.class.getDeclaredMethod("y").getAnnotation(Valid.class));

        assertNotNull(Point.class.getConstructors()[0].getParameters()[0].getAnnotation(Valid.class));

        assertNotNull(Point.class.getConstructors()[0].getParameters()[1].getAnnotation(Valid.class));
    }

    public void printOb(Object object) {
        if (object instanceof Line(Point(int sX, int sY), Point(int eX, int eY))) {
            System.out.println(sX);
            System.out.println(sY);

            System.out.println(eX);
            System.out.println(eY);
        } else if (object instanceof Point(int x, int y)) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(object);
        }
    }

    @Test
    void beforeRecordPattern() {
        printOb(new Point(10, 10));
        printOb(new Line(new Point(10, 10), new Point(20, 20)));
    }
}