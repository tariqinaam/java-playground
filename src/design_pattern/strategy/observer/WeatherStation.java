package design_pattern.strategy.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(33, 45, 20.2f);
        weatherData.setMeasurements(40,40,40.1f);
    }
}
