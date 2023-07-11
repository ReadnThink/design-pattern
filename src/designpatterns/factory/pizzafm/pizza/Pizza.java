package designpatterns.factory.pizzafm.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;

    public ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("반죽중...");
        System.out.println("소스 뿌리는중...");
        System.out.println("토핑중: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

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


}
