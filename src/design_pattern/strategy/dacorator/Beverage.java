package design_pattern.strategy.dacorator;

public abstract class Beverage {
    String Description = "Unknown Description";

    public String getDescription() {
        return Description;
    }

    public abstract Double cost();
}
