package template_method.examples.beverages;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
