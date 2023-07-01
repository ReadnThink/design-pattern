package designpatterns.decorator.coffeehouseWithSizes;


import designpatterns.decorator.coffeehouseWithSizes.구상구성요소.DarkRoast;
import designpatterns.decorator.coffeehouseWithSizes.구상구성요소.Espresso;
import designpatterns.decorator.coffeehouseWithSizes.구상구성요소.HouseBlend;
import designpatterns.decorator.coffeehouseWithSizes.구상데코레이터.Mocha;
import designpatterns.decorator.coffeehouseWithSizes.구상데코레이터.Soy;
import designpatterns.decorator.coffeehouseWithSizes.구상데코레이터.Whip;
import designpatterns.decorator.coffeehouseWithSizes.추상구성요소.Beverage;

public class CoffeeHouseWithSize {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + String.format("%.2f", beverage.cost()));
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + String.format("%.2f", beverage2.cost()));
 
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Beverage.Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + String.format("%.2f", beverage3.cost()));
	}
}
