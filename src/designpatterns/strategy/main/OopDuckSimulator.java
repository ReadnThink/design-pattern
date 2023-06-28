package designpatterns.strategy.main;

import designpatterns.strategy.behavior.fly.FlyRockeyPowered;
import designpatterns.strategy.behavior.quack.FakeQuack;
import designpatterns.strategy.domain.ChangingDuck;
import designpatterns.strategy.domain.Duck;
import designpatterns.strategy.domain.OopDuck;

public class OopDuckSimulator {
    public static void main(String[] args) {
        // Oop 오리
        Duck oopDuck = new OopDuck();
        oopDuck.display();
        oopDuck.swim();
        oopDuck.performFly();
        oopDuck.performQuack();

        System.out.println();
        // Changing 오리 -> 못날고 소리를 못냄
        Duck changingDuck = new ChangingDuck();
        changingDuck.display();
        changingDuck.swim();
        changingDuck.performFly();
        changingDuck.performQuack();

        // 동적으로 행위 변경 -> 로켓파워로 날고 가짜로 소리냄
        changingDuck.setFlyBehavior(new FlyRockeyPowered());
        changingDuck.setQuackBehavior(new FakeQuack());

        // 동적으로 행위 변경 -> 로켓파워로 날고 가짜로 소리냄
        changingDuck.performFly();
        changingDuck.performQuack();
    }
}
