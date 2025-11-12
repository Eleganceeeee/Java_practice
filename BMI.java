import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入体重（公斤）：");
        double weight = input.nextDouble();
        System.out.print("请输入身高（米）：");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("您的BMI值为：%.2f，判定为：", bmi);

        if (bmi < 16) System.out.println("严重过轻");
        else if (bmi < 18) System.out.println("过轻");
        else if (bmi < 24) System.out.println("体重适中");
        else if (bmi < 29) System.out.println("过重");
        else if (bmi < 35) System.out.println("肥胖");
        else System.out.println("非常肥胖");

        input.close();
    }
}