package decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return 2.3;
    }
}
