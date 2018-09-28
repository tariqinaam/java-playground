package design_pattern.strategy.dacorator;

import design_pattern.strategy.ModelDuck;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return .20 + beverage.cost();
    }
}
