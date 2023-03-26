package strategy.examples.game_character;

import strategy.examples.game_character.client.GameCharacter;
import strategy.examples.game_character.client.impl.King;
import strategy.examples.game_character.client.impl.Queen;
import strategy.examples.game_character.strategy.KnifeWeapon;

public class GameCharacterTester {

    public static void main(String[] args) {

        GameCharacter king = new King();

        king.performAction();

        king.setWeaponBehavior(new KnifeWeapon());

        king.performAction();

        GameCharacter queen = new Queen();

        queen.performAction();


    }
}
