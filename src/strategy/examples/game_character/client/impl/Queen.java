package strategy.examples.game_character.client.impl;

import strategy.examples.game_character.client.GameCharacter;
import strategy.examples.game_character.strategy.BowAndArrowWeapon;

public class Queen extends GameCharacter {

    public Queen() {
        weaponBehavior = new BowAndArrowWeapon();
    }

    @Override
    protected void fight() {
        System.out.println("Queen is fighting");
    }
}
