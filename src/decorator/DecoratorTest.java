package decorator;

import decorator.example.coffee.component.Beverage;
import decorator.example.coffee.component.DarkRoast;
import decorator.example.coffee.component.Espresso;
import decorator.example.coffee.decorator.Mocha;

public class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " " + beverage1.cost());
    }
}
