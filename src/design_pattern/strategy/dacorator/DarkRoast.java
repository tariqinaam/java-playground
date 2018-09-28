package design_pattern.strategy.dacorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        Description = "Dark Roast";
    }

    @Override
    public Double cost() {
        return .99;
    }
}
