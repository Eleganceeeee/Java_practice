import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.id, e.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e2.age, e1.age); // 年龄大的排前面
    }
}

public class Task3 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(3, "Tom", 24),
            new Employee(1, "Alice", 30),
            new Employee(2, "Bob", 27)
        };

        System.out.println("按id排序：");
        Arrays.sort(employees);
        for (Employee e : employees)
            System.out.println(e);

        System.out.println("\\n按年龄排序：");
        Arrays.sort(employees, new AgeComparator());
        for (Employee e : employees)
            System.out.println(e);
    }
}