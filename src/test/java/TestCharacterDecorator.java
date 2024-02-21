/**
 * File: TestCharacterDecorator.java.
 * Author: Nicole Garcia
 * Date: 02/20/2024
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import decorator.BaseCharacter;
import decorator.Character;
import decorator.CharacterDecorator;

import org.junit.jupiter.api.Test;

/**
 * TestCharacterDecorator class.
 */
public class TestCharacterDecorator {

    @Test
    public void testBaseCharacterGet() {
        BaseCharacter baseCharacter = new BaseCharacter();

        assertEquals(baseCharacter.getCharacterType(), "");
        assertEquals(baseCharacter.getCharacterClass(), "");
        assertEquals(baseCharacter.getCharacterHealth(), 75);
        assertEquals(baseCharacter.getCharacterInitHealth(), 75);
        assertEquals(baseCharacter.getCharacterInitHealth(), baseCharacter.getCharacterHealth());
        assertEquals(baseCharacter.getCharacterMinHealth(),50);
        assertEquals(baseCharacter.getCharacterMaxHealth(), 1000);
        assertEquals(baseCharacter.getCharacterAttackDamage(), 100);
        assertEquals(baseCharacter.getCharacterDefense(), 50);
        assertEquals(baseCharacter.getCharacterSpeed(), 50);
        assertEquals(baseCharacter.getCharacterGems(), 50);
        assertEquals(baseCharacter.getCharacterMinFindGems(), 1);
        assertEquals(baseCharacter.getCharacterMaxFindGems(), 100);
        assertEquals(baseCharacter.getCharacterHealthPotions(), 5);
        assertEquals(baseCharacter.getCharacterInitHealthPotions(), 5);
        assertEquals(baseCharacter.getCharacterHealthPotionHealAmt(), 75);
    }

    @Test
    public void testBaseCharacterSet() {
        BaseCharacter baseCharacter = new BaseCharacter();

        baseCharacter.setCharacterType("Type");
        baseCharacter.setCharacterClass("Class");
        baseCharacter.setCharacterHealth(25);
        baseCharacter.setCharacterInitHealth(25);
        baseCharacter.setCharacterInitHealth(baseCharacter.getCharacterHealth());
        baseCharacter.setCharacterMinHealth(25);
        baseCharacter.setCharacterMaxHealth(500);
        baseCharacter.setCharacterAttackDamage(25);
        baseCharacter.setCharacterDefense(25);
        baseCharacter.setCharacterSpeed(25);
        baseCharacter.setCharacterGems(25);
        baseCharacter.setCharacterMinFindGems(5);
        baseCharacter.setCharacterMaxFindGems(50);
        baseCharacter.setCharacterHealthPotions(3);
        baseCharacter.setCharacterInitHealthPotions(3);
        baseCharacter.setCharacterHealthPotionHealAmt(25);

        assertEquals(baseCharacter.getCharacterType(), "Type");
        assertEquals(baseCharacter.getCharacterClass(), "Class");
        assertEquals(baseCharacter.getCharacterHealth(), 25);
        assertEquals(baseCharacter.getCharacterInitHealth(), 25);
        assertEquals(baseCharacter.getCharacterInitHealth(), baseCharacter.getCharacterHealth());
        assertEquals(baseCharacter.getCharacterMinHealth(),25);
        assertEquals(baseCharacter.getCharacterMaxHealth(), 500);
        assertEquals(baseCharacter.getCharacterAttackDamage(), 25);
        assertEquals(baseCharacter.getCharacterDefense(), 25);
        assertEquals(baseCharacter.getCharacterSpeed(), 25);
        assertEquals(baseCharacter.getCharacterGems(), 25);
        assertEquals(baseCharacter.getCharacterMinFindGems(), 5);
        assertEquals(baseCharacter.getCharacterMaxFindGems(), 50);
        assertEquals(baseCharacter.getCharacterHealthPotions(), 3);
        assertEquals(baseCharacter.getCharacterInitHealthPotions(), 3);
        assertEquals(baseCharacter.getCharacterHealthPotionHealAmt(), 25);
    }

    @Test
    public void testCharacterDecoratorGet() {
        Character character = new BaseCharacter();
        CharacterDecorator characterDecorator = new CharacterDecorator(character);

        assertEquals(characterDecorator.getCharacterType(), "");
        assertEquals(characterDecorator.getCharacterClass(), "");
        assertEquals(characterDecorator.getCharacterHealth(), 75);
        assertEquals(characterDecorator.getCharacterInitHealth(), 75);
        assertEquals(characterDecorator.getCharacterInitHealth(),
                characterDecorator.getCharacterHealth());
        assertEquals(characterDecorator.getCharacterMinHealth(),50);
        assertEquals(characterDecorator.getCharacterMaxHealth(), 1000);
        assertEquals(characterDecorator.getCharacterAttackDamage(), 100);
        assertEquals(characterDecorator.getCharacterDefense(), 50);
        assertEquals(characterDecorator.getCharacterSpeed(), 50);
        assertEquals(characterDecorator.getCharacterGems(), 50);
        assertEquals(characterDecorator.getCharacterMinFindGems(), 1);
        assertEquals(characterDecorator.getCharacterMaxFindGems(), 100);
        assertEquals(characterDecorator.getCharacterHealthPotions(), 5);
        assertEquals(characterDecorator.getCharacterInitHealthPotions(), 5);
        assertEquals(characterDecorator.getCharacterHealthPotionHealAmt(), 75);
    }

    @Test
    public void testCharacterDecoratorSet() {
        Character character = new BaseCharacter();
        CharacterDecorator characterDecorator = new CharacterDecorator(character);

        characterDecorator.setCharacterType("Type");
        characterDecorator.setCharacterClass("Class");
        characterDecorator.setCharacterHealth(25);
        characterDecorator.setCharacterInitHealth(25);
        characterDecorator.setCharacterInitHealth(characterDecorator.getCharacterHealth());
        characterDecorator.setCharacterMinHealth(25);
        characterDecorator.setCharacterMaxHealth(500);
        characterDecorator.setCharacterAttackDamage(25);
        characterDecorator.setCharacterDefense(25);
        characterDecorator.setCharacterSpeed(25);
        characterDecorator.setCharacterGems(25);
        characterDecorator.setCharacterMinFindGems(5);
        characterDecorator.setCharacterMaxFindGems(50);
        characterDecorator.setCharacterHealthPotions(3);
        characterDecorator.setCharacterInitHealthPotions(3);
        characterDecorator.setCharacterHealthPotionHealAmt(25);

        assertEquals(characterDecorator.getCharacterType(), "Type");
        assertEquals(characterDecorator.getCharacterClass(), "Class");
        assertEquals(characterDecorator.getCharacterHealth(), 25);
        assertEquals(characterDecorator.getCharacterInitHealth(), 25);
        assertEquals(characterDecorator.getCharacterInitHealth(),
                characterDecorator.getCharacterHealth());
        assertEquals(characterDecorator.getCharacterMinHealth(),25);
        assertEquals(characterDecorator.getCharacterMaxHealth(), 500);
        assertEquals(characterDecorator.getCharacterAttackDamage(), 25);
        assertEquals(characterDecorator.getCharacterDefense(), 25);
        assertEquals(characterDecorator.getCharacterSpeed(), 25);
        assertEquals(characterDecorator.getCharacterGems(), 25);
        assertEquals(characterDecorator.getCharacterMinFindGems(), 5);
        assertEquals(characterDecorator.getCharacterMaxFindGems(), 50);
        assertEquals(characterDecorator.getCharacterHealthPotions(), 3);
        assertEquals(characterDecorator.getCharacterInitHealthPotions(), 3);
        assertEquals(characterDecorator.getCharacterHealthPotionHealAmt(), 25);
    }
}
