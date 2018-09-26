package design_pattern.strategy;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
