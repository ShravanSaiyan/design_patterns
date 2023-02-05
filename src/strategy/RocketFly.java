package strategy;

public class RocketFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying along rocket");
    }
}
