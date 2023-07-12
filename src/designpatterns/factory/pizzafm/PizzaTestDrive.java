package designpatterns.factory.pizzafm;

import designpatterns.factory.pizzafm.store.ChicagoPizzaStore;
import designpatterns.factory.pizzafm.store.NYPizzaStore;
import designpatterns.factory.pizzafm.store.PizzaStore;
import designpatterns.factory.pizzafm.pizza.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("개똥이가 주문한" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("아무개가 주문한" + pizza.getName() + "\n");
    }

}
