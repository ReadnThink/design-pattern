package designpatterns.decorator.coffeehouseWithSizes.구상구성요소;

import designpatterns.decorator.coffeehouseWithSizes.추상구성요소.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

