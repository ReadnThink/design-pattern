package designpatterns.strategy.main;

import designpatterns.strategy.behavior.fly.FlyRockeyPowered;
import designpatterns.strategy.behavior.quack.FakeQuack;
import designpatterns.strategy.domain.ChangingDuck;
import designpatterns.strategy.domain.Duck;
import designpatterns.strategy.domain.OopDuck;

public class OopDuckSimulator {
    public static void main(String[] args) {
        Duck oopDuck = new OopDuck();
        oopDuck.display();
        oopDuck.swim();
        oopDuck.performFly();
        oopDuck.performQuack();

        System.out.println();
        Duck changingDuck = new ChangingDuck();
        changingDuck.display();
        changingDuck.swim();
        changingDuck.performFly();
        changingDuck.performQuack();

        changingDuck.setFlyBehavior(new FlyRockeyPowered());
        changingDuck.setQuackBehavior(new FakeQuack());

        changingDuck.performFly();
        changingDuck.performQuack();
    }
}
