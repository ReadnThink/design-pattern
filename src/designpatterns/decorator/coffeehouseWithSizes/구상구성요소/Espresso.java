package designpatterns.decorator.coffeehouseWithSizes.구상구성요소;

import designpatterns.decorator.coffeehouseWithSizes.추상구성요소.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

