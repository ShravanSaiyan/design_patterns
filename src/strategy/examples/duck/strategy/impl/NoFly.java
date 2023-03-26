package strategy.examples.duck.strategy.impl;

import strategy.examples.duck.strategy.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}
