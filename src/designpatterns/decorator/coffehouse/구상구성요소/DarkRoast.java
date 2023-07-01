package designpatterns.decorator.coffehouse.구상구성요소;

import designpatterns.decorator.coffehouse.추상구성요소.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
