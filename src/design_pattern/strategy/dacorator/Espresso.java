package design_pattern.strategy.dacorator;

public class Espresso extends Beverage {
    public Espresso() {
        Description = "Escpresso";
    }
    public Double cost() {
        return 1.99;
    }
}
