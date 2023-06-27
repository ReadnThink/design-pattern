package designpatterns.strategy.domain;

import designpatterns.strategy.behavior.fly.FlyNoWay;
import designpatterns.strategy.behavior.quack.MuteQuack;

public class ChangingDuck extends Duck{

    public ChangingDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("저는 행동이 바뀌는 오리입니다!");
    }
}
