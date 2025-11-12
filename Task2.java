interface A {
    static void staticMethod() {
        System.out.println("接口A的静态方法");
    }
    default void defaultMethod() {
        System.out.println("接口A的默认方法");
    }
}

interface B extends A {
    @Override
    default void defaultMethod() {
        System.out.println("接口B继承并覆盖了A的默认方法");
    }
}

class TestClass implements B {}

public class Task2 {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.defaultMethod(); // 继承自接口B

        // 静态方法调用
        A.staticMethod();
    }
}
