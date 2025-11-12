public class FormatOutput {
    public static void main(String[] args) {
        double r = 10;
        double area = Math.PI * r * r;
        System.out.printf("半径为%.0f的圆的面积是%.2f", r, area);
    }
}