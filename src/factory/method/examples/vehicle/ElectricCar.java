package factory.method.examples.vehicle;

public class ElectricCar implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("Building electric car");
    }
}
