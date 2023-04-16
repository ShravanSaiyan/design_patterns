package factory.method.examples.vehicle;

public class ElectricScooter implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("Building electric scooter");
    }
}
