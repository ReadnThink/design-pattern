package designpatterns.factory.pizza;

import designpatterns.factory.ingredient.interfaces.*;

public abstract class Pizza {
    public String name;

    public Dough dough;
    public Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;


    abstract public void prepare();

    public void bake() {
        System.out.println("피자 굽는 시간 : 25분 350도");
    }

    public void cut() {
        System.out.println("피자를 자릅니다.");
    }

    public void box() {
        System.out.println("피자를 박스에 놓습니다.");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
