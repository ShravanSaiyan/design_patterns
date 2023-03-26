package strategy.examples.game_character.client;

import strategy.examples.game_character.strategy.WeaponBehavior;

public abstract class GameCharacter {

    protected WeaponBehavior weaponBehavior;

    protected abstract void fight();

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performAction() {
        weaponBehavior.useWeapon();
    }
}
