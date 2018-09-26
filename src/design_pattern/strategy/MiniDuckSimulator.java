package design_pattern.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck Mallard = new MallardDuck();
        Mallard.performFly();
        Mallard.performQuack();

        // model duck default behaviour
        Duck Model = new ModelDuck();
        Model.performFly();
        Model. performQuack();

        //model duck but changed behaviour on the fly
        Model.setFlyBehaviour(new FlyRocketPowered());
        Model.performFly();
    }
}
