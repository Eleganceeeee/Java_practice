import java.util.Objects;

public class Point {
    private double x, y;

    public Point(double x, double y) { this.x = x; this.y = y; }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() { return "Point(" + x + ", " + y + ")"; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point p = (Point) obj;
        return Double.compare(p.x, x) == 0 && Double.compare(p.y, y) == 0;
    }

    @Override
    public int hashCode() { return Objects.hash(x, y); }

    public static void main(String[] args) {
        Point p1 = new Point(2.0, 3.0);
        Point p2 = new Point(2.0, 3.0);
        System.out.println(p1.toString());
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode(): " + p1.hashCode());
    }
}