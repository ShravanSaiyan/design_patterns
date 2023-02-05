package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObservers(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.temperature;
        this.humidity = weatherData.humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + " " + humidity);
    }
}
