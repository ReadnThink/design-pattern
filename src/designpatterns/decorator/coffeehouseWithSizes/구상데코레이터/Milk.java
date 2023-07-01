package designpatterns.decorator.coffeehouseWithSizes.구상데코레이터;

import designpatterns.decorator.coffeehouseWithSizes.추상구성요소.Beverage;
import designpatterns.decorator.coffeehouseWithSizes.추상데코레이터.CondimentDecorator;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
