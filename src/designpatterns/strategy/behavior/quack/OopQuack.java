package designpatterns.strategy.behavior.quack;

public class OopQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("객체! 객체!");
    }
}
