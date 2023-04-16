package factory.method.examples.vehicle;

public abstract class VehicleFactory {

    void create() {

        Vehicle vehicle = createVehicle();
        vehicle.build();
    }

    protected abstract Vehicle createVehicle();
}
