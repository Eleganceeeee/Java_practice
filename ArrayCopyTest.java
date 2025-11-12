import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] target1 = new int[source.length];
        int[] target2 = new int[source.length];
        int[] target3;

        // 方法1：for循环复制
        for (int i = 0; i < source.length; i++) {
            target1[i] = source[i];
        }

        // 方法2：System.arraycopy()
        System.arraycopy(source, 0, target2, 0, source.length);

        // 方法3：Arrays.copyOf()
        target3 = Arrays.copyOf(source, source.length);

        System.out.println("target1 = " + Arrays.toString(target1));
        System.out.println("target2 = " + Arrays.toString(target2));
        System.out.println("target3 = " + Arrays.toString(target3));
    }
}