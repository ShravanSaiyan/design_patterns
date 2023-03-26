package strategy.examples.game_character.strategy;

public class KnifeWeapon implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Knifes");
    }
}
