package decorator.example.coffee.component;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf Special");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
