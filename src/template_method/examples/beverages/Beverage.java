package template_method.examples.beverages;

public abstract class Beverage {

    void prepareRecipe() {
        boilWater();
        pourInCup();
        brew();
        if (isCondimentsRequired()) addCondiments();

    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("pouring in cup");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private boolean isCondimentsRequired() {
        return true;
    }
}
