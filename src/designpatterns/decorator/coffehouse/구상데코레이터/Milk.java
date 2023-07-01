package designpatterns.decorator.coffehouse.구상데코레이터;

import designpatterns.decorator.coffehouse.추상구성요소.Beverage;
import designpatterns.decorator.coffehouse.추상데코레이터.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}
