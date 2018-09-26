package design_pattern.strategy;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck() {
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }
    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("all ducks float");
    }
}
