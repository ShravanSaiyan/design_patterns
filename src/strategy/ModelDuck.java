package strategy;

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
