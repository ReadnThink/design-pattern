package designpatterns.strategy.behavior.quack;

public class PatternQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("디자인 패턴! 디자인 패턴!");
    }
}
