package designpatterns.strategy.domain;

import designpatterns.strategy.behavior.fly.FlyWithWings;
import designpatterns.strategy.behavior.quack.OopQuack;

public class OopDuck extends Duck{

    public OopDuck() {
        quackBehavior = new OopQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 객체지향 오리입니다!");
    }
}