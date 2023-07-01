package designpatterns.decorator.coffehouse.추상데코레이터;

import designpatterns.decorator.coffehouse.추상구성요소.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
