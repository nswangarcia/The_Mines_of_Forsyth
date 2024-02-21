package decorator.charactertype;

import decorator.Character;
import decorator.CharacterDecorator;

public class Dwarf extends CharacterDecorator {

    private static final String characterType = "Dwarf";
    private int characterHealth = 250;
    private int characterInitHealth = characterHealth;
    private int characterMinHealth = 100;
    private int characterMaxHealth = 1000;
    private int characterAttackDamage = 50;
    private int characterDefense = 10;
    private int characterSpeed = 100;
    private int characterGems = 50;
    private int characterMinFindGems = 1;
    private int characterMaxFindGems = 500;
    private int characterHealthPotions = 5;
    private int characterInitHealthPotions = 5;
    private int characterHealthPotionHealAmt = 75;

    /**
     * Dwarf Character type.
     * @param newCharacter Character
     */
    public Dwarf(Character newCharacter) {
        super(newCharacter);
        // set character features
        newCharacter.setCharacterType(characterType);
        newCharacter.setCharacterHealth(characterHealth);
        newCharacter.setCharacterInitHealth(characterInitHealth);
        newCharacter.setCharacterMinHealth(characterMinHealth);
        newCharacter.setCharacterMaxHealth(characterMaxHealth);
        newCharacter.setCharacterAttackDamage(characterAttackDamage);
        newCharacter.setCharacterDefense(characterDefense);
        newCharacter.setCharacterSpeed(characterSpeed);
        newCharacter.setCharacterGems(characterGems);
        newCharacter.setCharacterMinFindGems(characterMinFindGems);
        newCharacter.setCharacterMaxFindGems(characterMaxFindGems);
        newCharacter.setCharacterHealthPotions(characterHealthPotions);
        newCharacter.setCharacterInitHealthPotions(characterInitHealthPotions);
        newCharacter.setCharacterHealthPotionHealAmt(characterHealthPotionHealAmt);
        System.out.print("\tAdding features of " + this.characterType + " character type.");
    }
}
