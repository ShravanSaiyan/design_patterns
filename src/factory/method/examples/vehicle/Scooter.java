package factory.method.examples.vehicle;

public class Scooter implements Vehicle {
    @Override
    public void build() {
        System.out.println("Building scooter");
    }
}
