package designpatterns.decorator.coffeehouseWithSizes.구상구성요소;

import designpatterns.decorator.coffeehouseWithSizes.추상구성요소.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

