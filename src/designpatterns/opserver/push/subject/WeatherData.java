package designpatterns.opserver.push.subject;

import designpatterns.opserver.push.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(designpatterns.opserver.push.observer.Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(designpatterns.opserver.push.observer.Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        System.out.println("-----------------옵저버들에게 공지합니다!--------------------");
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        System.out.println("-----------------변경사항이 감지되었습니다!--------------------");
        notifyObserver();
    }

    public void setMeasurements(float temperate, float humidity, float pressure) {
        this.temperature = temperate;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
