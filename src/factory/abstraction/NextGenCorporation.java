package factory.abstraction;

import factory.method.examples.vehicle.ElectricScooter;
import factory.method.examples.vehicle.ElectricVehicle;
import factory.method.examples.vehicle.Scooter;
import factory.method.examples.vehicle.Vehicle;

public class NextGenCorporation implements Corporation {
    @Override
    public Vehicle createVehicle() {
        return new Scooter();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ElectricScooter();
    }
}
