package designpatterns.opserver.push.main;

import designpatterns.opserver.push.observer.display.CurrentConditionsDisplay;
import designpatterns.opserver.push.observer.display.ForecastDisplay;
import designpatterns.opserver.push.observer.display.HeatIndexDisplay;
import designpatterns.opserver.push.observer.display.StatisticsDisplay;
import designpatterns.opserver.push.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        // 새로운 측정값 주입
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
