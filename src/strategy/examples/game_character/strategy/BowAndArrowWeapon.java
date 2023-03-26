package strategy.examples.game_character.strategy;

public class BowAndArrowWeapon implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Bow And Arrows");
    }
}
