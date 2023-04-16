package factory.abstraction;

import factory.method.examples.vehicle.Car;
import factory.method.examples.vehicle.ElectricCar;
import factory.method.examples.vehicle.ElectricVehicle;
import factory.method.examples.vehicle.Vehicle;

public class VehicleCorporation implements Corporation {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ElectricCar();
    }
}
