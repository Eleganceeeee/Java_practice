public class Task03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            if (MathUtils.isPrime(i) && MathUtils.isPalindrome(i)) {
                System.out.printf("%4d ", i);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
    }
}
