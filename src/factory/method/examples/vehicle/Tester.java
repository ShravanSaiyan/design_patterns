package factory.method.examples.vehicle;

public class Tester {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.create();

        VehicleFactory scooterFactory = new ScooterFactory();
        scooterFactory.create();
    }
}
