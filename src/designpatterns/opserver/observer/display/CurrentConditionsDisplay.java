package designpatterns.opserver.observer.display;

import designpatterns.opserver.observer.DisplayElement;
import designpatterns.opserver.observer.Observer;
import designpatterns.opserver.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("현재 상태: " + temperature
                + "F 습도 " + humidity + "%");
    }
}
