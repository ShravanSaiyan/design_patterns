package strategy.examples.duck.strategy.impl;

import strategy.examples.duck.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Iam on mute");
    }
}
