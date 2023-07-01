package designpatterns.decorator.coffehouse.구상구성요소;

import designpatterns.decorator.coffehouse.추상구성요소.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
