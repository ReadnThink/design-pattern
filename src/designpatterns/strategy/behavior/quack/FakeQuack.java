package designpatterns.strategy.behavior.quack;

public class FakeQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("페이크! Fake!");
    }
}
