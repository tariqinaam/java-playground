package design_pattern.strategy;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can fly like a rocket now");
    }
}
