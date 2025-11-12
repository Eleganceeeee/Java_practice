import java.util.Scanner;

public class MatrixRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入矩阵阶数 n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // 初始化矩阵
        int num = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = num++;

        // 旋转矩阵
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                rotated[j][n - 1 - i] = matrix[i][j];

        // 输出旋转结果
        System.out.println("旋转后的矩阵：");
        for (int[] row : rotated) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
    }
}