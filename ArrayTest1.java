public class ArrayTest1 {
    public static void main(String[] args) {
        double[] a = {75, 53, 32, 12, 46, 199, 17, 54};
        double sum = 0;
        double max = a[0];
        double min = a[0];

        for (double v : a) {
            sum += v;
            if (v > max) max = v;
            if (v < min) min = v;
        }

        double avg = sum / a.length;
        System.out.println("数组元素之和: " + sum);
        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);
        System.out.println("平均值: " + avg);

        try {
            System.out.println("a[8] = " + a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("错误：数组下标越界！");
        }
    }
}