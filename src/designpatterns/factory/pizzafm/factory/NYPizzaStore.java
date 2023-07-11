package designpatterns.factory.pizzafm.factory;

import designpatterns.factory.pizzafm.pizza.*;
import designpatterns.factory.pizzafm.pizza.newyork.NYStyleCheesePizza;
import designpatterns.factory.pizzafm.pizza.newyork.NYStyleClamPizza;
import designpatterns.factory.pizzafm.pizza.newyork.NYStylePepperoniPizza;
import designpatterns.factory.pizzafm.pizza.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }

}
