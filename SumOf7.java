public class SumOf7 {
    public static void main(String[] args) {
        int count = 0;
        long sum = 0;

        for (int i = 1; i <= 10000; i++) {
            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7) {
                count++;
                sum += i;
            }
        }

        System.out.println("1~10000中含7或7的倍数的整数个数：" + count);
        System.out.println("这些数的总和为：" + sum);
    }
}