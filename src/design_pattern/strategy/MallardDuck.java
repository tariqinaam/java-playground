package design_pattern.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    public void display() {
        System.out.println("i am mallard duck");
    }
}
