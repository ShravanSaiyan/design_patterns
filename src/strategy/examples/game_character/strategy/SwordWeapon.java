package strategy.examples.game_character.strategy;

public class SwordWeapon implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Swords");
    }
}
