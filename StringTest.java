import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        String str = sc.nextLine();
        System.out.println("长度: " + str.length());
        System.out.println("第一个字符: " + str.charAt(0));
        System.out.println("最后一个字符: " + str.charAt(str.length() - 1));
        System.out.println("大写形式: " + str.toUpperCase());
    }
}