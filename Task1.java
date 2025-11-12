interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

abstract class Animal {
    abstract void eat();
}

class WildDuck extends Animal implements Swimmable, Flyable {
    @Override
    public void eat() {
        System.out.println("野鸭在吃鱼");
    }
    @Override
    public void swim() {
        System.out.println("野鸭在水中游泳");
    }
    @Override
    public void fly() {
        System.out.println("野鸭在空中飞翔");
    }
}

public class Task1 {
    public static void main(String[] args) {
        WildDuck duck = new WildDuck();
        duck.eat();
        duck.fly();
        duck.swim();

        Swimmable s = duck;
        s.swim();

        Flyable f = duck;
        f.fly();

        Animal a = duck;
        a.eat();
    }
}