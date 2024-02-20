package decorator.characterClass;

import decorator.Character;
import decorator.CharacterDecorator;

public class Brawler extends CharacterDecorator {

    private final String characterClass = "Brawler";
    private int characterSpeed = 25;

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

    @Override
    public String getCharacterClass() {
        return super.getCharacterClass() + this.characterClass;
    }

    @Override
    public int getCharacterSpeed() {
        return super.getCharacterSpeed() + this.characterSpeed;
    }
}
