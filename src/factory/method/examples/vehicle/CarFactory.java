package factory.method.examples.vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Car();
    }
}
