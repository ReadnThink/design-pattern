package designpatterns.strategy.behavior.fly;

public class FlyRockeyPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
