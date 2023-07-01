package designpatterns.decorator.coffehouse.추상구성요소;

public abstract class Beverage {
    public String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}