/**
 * File: Miner.java.
 * Author: Nicole Garcia
 * Date: 02/20/2024
 */

package decorator.characterclass;

import decorator.Character;
import decorator.CharacterDecorator;

/**
 * Miner class.
 */
public class Miner extends CharacterDecorator {
    private static final String characterClass = "Miner";
    private int characterMaxFindGems = 200;

    /**
     * Miner constructor.
     * @param newCharacter Character
     */
    public Miner(Character newCharacter) {
        super(newCharacter);
        // set character class
        newCharacter.setCharacterClass(this.characterClass);
        newCharacter.setCharacterMaxFindGems(this.characterMaxFindGems);

        // set character features
        newCharacter.setCharacterType(super.getCharacterType());
        newCharacter.setCharacterHealth(super.getCharacterHealth());
        newCharacter.setCharacterInitHealth(super.getCharacterInitHealth());
        newCharacter.setCharacterMinHealth(super.getCharacterMinHealth());
        newCharacter.setCharacterMaxHealth(super.getCharacterMaxHealth());
        newCharacter.setCharacterAttackDamage(super.getCharacterAttackDamage());
        newCharacter.setCharacterDefense(super.getCharacterDefense());
        newCharacter.setCharacterSpeed(super.getCharacterSpeed());
        newCharacter.setCharacterGems(super.getCharacterGems());
        newCharacter.setCharacterMinFindGems(super.getCharacterMinFindGems());
        //newCharacter.setCharacterMaxFindGems(super.getCharacterMaxFindGems());
        newCharacter.setCharacterHealthPotions(super.getCharacterHealthPotions());
        newCharacter.setCharacterInitHealthPotions(super.getCharacterInitHealthPotions());
        newCharacter.setCharacterHealthPotionHealAmt(super.getCharacterHealthPotionHealAmt());

        System.out.print(" Adding features of " + this.characterClass + " character class.");
    }

    /**
     * Miner class getter.
     * @return String class.
     */
    @Override
    public String getCharacterClass() {
        return super.getCharacterClass();
    }
}
