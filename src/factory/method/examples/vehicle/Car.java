package factory.method.examples.vehicle;

public class Car implements Vehicle {
    @Override
    public void build() {
        System.out.println("Building car");
    }
}
