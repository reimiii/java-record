package franxx.code.record.data;

public record Point(int x, int y) {

    public Point {
        System.out.println("create point");
    }
}
