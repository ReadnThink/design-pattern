package designpatterns.factory.pizzafm.factory;

import designpatterns.factory.pizzafm.pizza.*;
import designpatterns.factory.pizzafm.pizza.chicago.ChicagoStyleCheesePizza;
import designpatterns.factory.pizzafm.pizza.chicago.ChicagoStyleClamPizza;
import designpatterns.factory.pizzafm.pizza.chicago.ChicagoStylePepperoniPizza;
import designpatterns.factory.pizzafm.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }

}
