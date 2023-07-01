package designpatterns.decorator.coffehouse.구상구성요소;

import designpatterns.decorator.coffehouse.추상구성요소.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
