package decorator.example.coffee.component;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
