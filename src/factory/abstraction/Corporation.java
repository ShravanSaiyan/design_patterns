package factory.abstraction;

import factory.method.examples.vehicle.ElectricVehicle;
import factory.method.examples.vehicle.Vehicle;

public interface Corporation {
    Vehicle createVehicle();

    ElectricVehicle createElectricVehicle();

}
