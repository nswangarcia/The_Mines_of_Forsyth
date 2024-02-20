package decorator.characterClass;

import decorator.Character;
import decorator.CharacterDecorator;

public class Warrior extends CharacterDecorator {
    private final String characterClass = "Warrior";
    private final int characterDefense = 100;
    private final int characterHealth = 200;

    public Warrior(Character newCharacter) {
        super(newCharacter);
        // set character class
        newCharacter.setCharacterClass(this.characterClass);
        newCharacter.setCharacterDefense(this.characterDefense);
        newCharacter.setCharacterHealth(this.characterHealth);

        // set character features
        newCharacter.setCharacterType(super.getCharacterType());
        //newCharacter.setCharacterHealth(super.getCharacterHealth());
        newCharacter.setCharacterInitHealth(super.getCharacterInitHealth());
        newCharacter.setCharacterMinHealth(super.getCharacterMinHealth());
        newCharacter.setCharacterMaxHealth(super.getCharacterMaxHealth());
        newCharacter.setCharacterAttackDamage(super.getCharacterAttackDamage());
        //newCharacter.setCharacterDefense(super.getCharacterDefense());
        newCharacter.setCharacterSpeed(super.getCharacterSpeed());
        newCharacter.setCharacterGems(super.getCharacterGems());
        newCharacter.setCharacterMinFindGems(super.getCharacterMinFindGems());
        newCharacter.setCharacterMaxFindGems(super.getCharacterMaxFindGems());
        newCharacter.setCharacterHealthPotions(super.getCharacterHealthPotions());
        newCharacter.setCharacterInitHealthPotions(super.getCharacterInitHealthPotions());
        newCharacter.setCharacterHealthPotionHealAmt(super.getCharacterHealthPotionHealAmt());

        System.out.print(" Adding features of " + this.characterClass + " character class.");
    }

    @Override
    public String getCharacterClass() {
        return super.getCharacterClass() + this.characterClass;
    }
}
