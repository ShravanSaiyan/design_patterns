package strategy.examples.game_character.client.impl;

import strategy.examples.game_character.client.GameCharacter;
import strategy.examples.game_character.strategy.SwordWeapon;

public class King extends GameCharacter {

    public King() {

        weaponBehavior = new SwordWeapon();
    }

    @Override
    protected void fight() {
        System.out.println("King is fighting");
    }
}
