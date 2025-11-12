import java.util.Scanner;

class Circle {
    protected double radius;
    public Circle() {}
    public Circle(double radius) { this.radius = radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
}

class Cylinder extends Circle {
    private double height;
    public Cylinder() {}
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height); // 表面积
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;       // 体积
    }
}

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入半径: ");
        double r = sc.nextDouble();
        System.out.print("请输入高度: ");
        double h = sc.nextDouble();
        Cylinder c = new Cylinder(r, h);
        System.out.printf("表面积: %.2f%n", c.getArea());
        System.out.printf("体积: %.2f%n", c.getVolume());
    }
}