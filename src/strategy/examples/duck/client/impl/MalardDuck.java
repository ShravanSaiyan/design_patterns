package strategy.examples.duck.client.impl;

import strategy.examples.duck.client.Duck;
import strategy.examples.duck.strategy.impl.FlyWithWings;
import strategy.examples.duck.strategy.impl.Quack;

public class MalardDuck extends Duck {
    public MalardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Iam a model");
    }
}
