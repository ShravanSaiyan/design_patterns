package decorator.example.coffee.decorator;

import decorator.example.coffee.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();
}
