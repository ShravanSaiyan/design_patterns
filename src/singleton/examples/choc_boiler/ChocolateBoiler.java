package singleton.examples.choc_boiler;

public class ChocolateBoiler {

    private static ChocolateBoiler chocolateBoiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {

        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill() {

        System.out.println("Filling");

        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
