package template_method.examples.beverages;

public class Tester {
    public static void main(String[] args) {
        Beverage beverage = new Tea();
        Beverage beverage1 = new Coffee();
        beverage.prepareRecipe();
        beverage1.prepareRecipe();
    }
}
