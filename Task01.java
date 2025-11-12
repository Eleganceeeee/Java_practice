class Animal {
    public Animal() {
        System.out.println("Animal 类构造方法被调用");
    }
    public void eat() {
        System.out.println("动物正在吃食物");
    }
}

class Bird extends Animal {
    int numberOfWings = 2;
    public Bird() {
        System.out.println("Bird 类构造方法被调用");
    }
    @Override
    public void eat() {
        System.out.println("鸟在啄食");
    }
    public void fly() {
        System.out.println("鸟在飞翔");
    }
}

class Fish extends Animal {
    public Fish() {
        System.out.println("Fish 类构造方法被调用");
    }
    @Override
    public void eat() {
        System.out.println("鱼在水中进食");
    }
    public void swim() {
        System.out.println("鱼在游泳");
    }
}

public class Task01 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println("鸟的翅膀数量：" + bird.numberOfWings);
        bird.eat();
        bird.fly();

        Animal animal;
        animal = bird;  // 向上转型
        animal.eat();
        // animal.fly(); // 编译错误：Animal无fly
        Bird b = (Bird) animal; // 向下转型
        b.fly();
    }
}