class Student {
    String name;
    int id;
    int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 1001, 1),
            new Student("Bob", 1002, 3),
            new Student("Charlie", 1003, 2),
            new Student("David", 1004, 3),
            new Student("Eve", 1005, 4)
        };

        System.out.println("三年级学生如下：");
        for (Student s : students) {
            if (s.grade == 3) {
                System.out.println("姓名：" + s.name + "，学号：" + s.id);
            }
        }
    }
}