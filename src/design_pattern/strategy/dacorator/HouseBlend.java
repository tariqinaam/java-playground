package design_pattern.strategy.dacorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        Description = "House Blend Coffee";
    }

    public Double cost() {
        return .89;
    }
}
