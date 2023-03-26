package strategy.examples.duck.strategy.impl;

import strategy.examples.duck.strategy.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}
