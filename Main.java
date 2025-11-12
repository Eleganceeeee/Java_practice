import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个两位数：");
        int num = input.nextInt();

        int tens = num / 10;
        int ones = num % 10;

        System.out.println("逆序后的结果是：" + (ones * 10 + tens));
        input.close();
    }
}