package design_pattern.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck Mallard = new MallardDuck();
        Mallard.performFly();
        Mallard.performQuack();
    }
}
