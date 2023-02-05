package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    public List<Observer> observers;
    public float humidity;
    public float temperature;
    public float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
