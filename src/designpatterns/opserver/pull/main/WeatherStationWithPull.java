package designpatterns.opserver.pull.main;

import designpatterns.opserver.pull.observer.display.CurrentConditionsDisplay;
import designpatterns.opserver.pull.observer.display.ForecastDisplay;
import designpatterns.opserver.pull.observer.display.StatisticsDisplay;
import designpatterns.opserver.pull.subject.WeatherData;

public class WeatherStationWithPull {
    public static void main(String[] args) {
        System.out.println("Pull 방식의 옵저버 패턴!");
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // 새로운 측정값 주입
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
