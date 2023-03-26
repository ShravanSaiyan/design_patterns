package strategy.examples.duck.strategy.impl;

import strategy.examples.duck.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Im flying");
    }
}
