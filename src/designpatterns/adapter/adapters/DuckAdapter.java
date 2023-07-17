package designpatterns.adapter.adapters;


import designpatterns.adapter.interfaces.Duck;

import java.util.Random;

public class DuckAdapter {
    Duck duck;
    Random random;

    public DuckAdapter(final Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
