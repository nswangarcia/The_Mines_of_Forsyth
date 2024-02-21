/**
 * File: Brawler.java.
 * Author: Nicole Garcia
 * Date: 02/20/2024
 */

package decorator.characterclass;

import decorator.Character;
import decorator.CharacterDecorator;

/**
 * Brawler class.
 */
public class Brawler extends CharacterDecorator {

    private static final String characterClass = "Brawler";
    private int characterSpeed = 25;

    /**
     * Brawler constructor.
     * @param newCharacter Character
     */
    public Brawler(Character newCharacter) {
        super(newCharacter);
        // set character class
        newCharacter.setCharacterClass(this.characterClass);
        newCharacter.setCharacterSpeed(this.characterSpeed);

        // set character features
        newCharacter.setCharacterType(super.getCharacterType());
        newCharacter.setCharacterHealth(super.getCharacterHealth());
        newCharacter.setCharacterInitHealth(super.getCharacterInitHealth());
        newCharacter.setCharacterMinHealth(super.getCharacterMinHealth());
        newCharacter.setCharacterMaxHealth(super.getCharacterMaxHealth());
        newCharacter.setCharacterAttackDamage(super.getCharacterAttackDamage());
        newCharacter.setCharacterDefense(super.getCharacterDefense());
        //newCharacter.setCharacterSpeed(super.getCharacterSpeed());
        newCharacter.setCharacterGems(super.getCharacterGems());
        newCharacter.setCharacterMinFindGems(super.getCharacterMinFindGems());
        newCharacter.setCharacterMaxFindGems(super.getCharacterMaxFindGems());
        newCharacter.setCharacterHealthPotions(super.getCharacterHealthPotions());
        newCharacter.setCharacterInitHealthPotions(super.getCharacterInitHealthPotions());
        newCharacter.setCharacterHealthPotionHealAmt(super.getCharacterHealthPotionHealAmt());

        System.out.print(" Adding features of " + this.characterClass + " character class.");
    }

    /**
     * Brawler class getter.
     * @return String character class
     */
    @Override
    public String getCharacterClass() {
        return super.getCharacterClass();
    }

    /**
     * Brawler speed getter.
     * @return int character speed
     */
    @Override
    public int getCharacterSpeed() {
        return super.getCharacterSpeed();
    }
}
