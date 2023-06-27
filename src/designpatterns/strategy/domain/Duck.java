package designpatterns.strategy.domain;

import designpatterns.strategy.behavior.fly.FlyBehavior;
import designpatterns.strategy.behavior.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜오리도 마찬가지입니다.");
    }

    public void setFlyBehavior(FlyBehavior newFlyBehavior) {
        flyBehavior = newFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior newQuackBehavior) {
        quackBehavior = newQuackBehavior;
    }

}
