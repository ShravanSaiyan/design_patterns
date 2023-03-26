package strategy.examples.duck.strategy.impl;

import strategy.examples.duck.strategy.FlyBehavior;

public class RocketFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying along rocket");
    }
}
