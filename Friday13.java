import java.time.*;

public class Friday13 {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 2000; year <= 2099; year++) {
            for (int month = 1; month <= 12; month++) {
                LocalDate date = LocalDate.of(year, month, 13);
                if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    System.out.println(date);
                    count++;
                }
            }
        }
        System.out.println("共有 " + count + " 个13号是星期五。");
    }
}