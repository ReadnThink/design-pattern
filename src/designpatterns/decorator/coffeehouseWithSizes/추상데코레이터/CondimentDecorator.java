package designpatterns.decorator.coffeehouseWithSizes.추상데코레이터;

import designpatterns.decorator.coffeehouseWithSizes.추상구성요소.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
