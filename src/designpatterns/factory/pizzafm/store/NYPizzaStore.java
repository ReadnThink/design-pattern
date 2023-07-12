package designpatterns.factory.pizzafm.store;

import designpatterns.factory.pizzafm.factory.NYPizzaIngredientFactory;
import designpatterns.factory.pizzafm.factory.PizzaIngredientFactory;
import designpatterns.factory.pizzafm.pizza.*;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(nyPizzaIngredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(nyPizzaIngredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(nyPizzaIngredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(nyPizzaIngredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }
        return pizza;
    }

}
