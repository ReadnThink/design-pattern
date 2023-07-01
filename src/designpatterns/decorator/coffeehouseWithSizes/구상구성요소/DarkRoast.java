package designpatterns.decorator.coffeehouseWithSizes.구상구성요소;

import designpatterns.decorator.coffeehouseWithSizes.추상구성요소.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

