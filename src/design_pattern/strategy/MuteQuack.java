package design_pattern.strategy;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I cannot quack. I am mute");
    }
}
