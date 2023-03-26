package strategy.examples.duck;

import strategy.examples.duck.client.Duck;
import strategy.examples.duck.client.impl.MalardDuck;
import strategy.examples.duck.client.impl.ModelDuck;
import strategy.examples.duck.strategy.impl.MuteQuack;

public class DuckTester {

    public static void main(String[] args) {

        Duck malardDuck = new MalardDuck();
        Duck modelDuck = new ModelDuck();

        malardDuck.performFly();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setQuackBehavior(new MuteQuack());

        modelDuck.performQuack();

    }
}
