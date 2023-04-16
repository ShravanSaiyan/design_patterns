package factory.method.examples.vehicle;

public class ScooterFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Scooter();
    }
}
