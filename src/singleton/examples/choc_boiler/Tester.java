package singleton.examples.choc_boiler;

public class Tester {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();

        chocolateBoiler.fill();


    }
}
