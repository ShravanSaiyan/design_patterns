package strategy.examples.duck.client.impl;

import strategy.examples.duck.client.Duck;
import strategy.examples.duck.strategy.impl.NoFly;
import strategy.examples.duck.strategy.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("Iam a model");
    }
}
