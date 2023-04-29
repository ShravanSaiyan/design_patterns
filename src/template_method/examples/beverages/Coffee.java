package template_method.examples.beverages;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding extra sugar");
    }
}
