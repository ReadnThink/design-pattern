package designpatterns.adapter.duck.adapters;


import designpatterns.adapter.duck.interfaces.Duck;
import designpatterns.adapter.duck.interfaces.Turkey;

import java.util.Random;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
