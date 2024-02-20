/**
 * File: TestCharacterType.java.
 * Author: Nicole Garcia
 * Date: 02/20/2024
 */

import decorator.BaseCharacter;
import decorator.Character;
import decorator.characterType.Dwarf;
import decorator.characterType.Elf;
import decorator.characterType.Human;
import decorator.characterType.Orc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TestCharacterType class test cases.
 */
public class TestCharacterType {

    /**
     * testCharacterTypeDwarfGet test getters.
     */
    @Test
    public void testCharacterTypeDwarfGet() {
        Character character = new BaseCharacter();
        character = new Dwarf(character);
        character.create();
        assertEquals(character.getCharacterType(), "Dwarf");
        assertEquals(character.getCharacterHealth(), 250);
        assertEquals(character.getCharacterInitHealth(), 250);
        assertEquals(character.getCharacterInitHealth(), character.getCharacterHealth());
        assertEquals(character.getCharacterMinHealth(), 100);
        assertEquals(character.getCharacterMaxHealth(), 1000);
        assertEquals(character.getCharacterAttackDamage(), 50);
        assertEquals(character.getCharacterDefense(), 10);
        assertEquals(character.getCharacterSpeed(), 100);
        assertEquals(character.getCharacterGems(), 50);
        assertEquals(character.getCharacterMinFindGems(), 1);
        assertEquals(character.getCharacterMaxFindGems(), 500);
        assertEquals(character.getCharacterHealthPotions(), 5);
        assertEquals(character.getCharacterInitHealthPotions(), 5);
        assertEquals(character.getCharacterHealthPotionHealAmt(), 75);
    }

    /**
     * testCharacterTypeDwarfSet test setters.
     */
    @Test
    public void testCharacterTypeDwarfSet() {
        Character character = new BaseCharacter();
        character = new Dwarf(character);
        character.create();
        character.setCharacterType("");
        character.setCharacterHealth(25);
        character.setCharacterInitHealth(25);
        character.setCharacterInitHealth(character.getCharacterHealth());
        character.setCharacterMinHealth(25);
        character.setCharacterMaxHealth(25);
        character.setCharacterAttackDamage(25);
        character.setCharacterDefense(25);
        character.setCharacterSpeed(25);
        character.setCharacterGems(25);
        character.setCharacterMinFindGems(25);
        character.setCharacterMaxFindGems(25);
        character.setCharacterHealthPotions(25);
        character.setCharacterInitHealthPotions(25);
        character.setCharacterHealthPotionHealAmt(25);

        assertEquals(character.getCharacterType(), "");
        assertEquals(character.getCharacterHealth(), 25);
        assertEquals(character.getCharacterInitHealth(), 25);
        assertEquals(character.getCharacterInitHealth(), character.getCharacterHealth());
        assertEquals(character.getCharacterMinHealth(), 25);
        assertEquals(character.getCharacterMaxHealth(), 25);
        assertEquals(character.getCharacterAttackDamage(), 25);
        assertEquals(character.getCharacterDefense(), 25);
        assertEquals(character.getCharacterSpeed(), 25);
        assertEquals(character.getCharacterGems(), 25);
        assertEquals(character.getCharacterMinFindGems(), 25);
        assertEquals(character.getCharacterMaxFindGems(), 25);
        assertEquals(character.getCharacterHealthPotions(), 25);
        assertEquals(character.getCharacterInitHealthPotions(), 25);
        assertEquals(character.getCharacterHealthPotionHealAmt(), 25);
    }

    /**
     * testCharacterTypeElfGet test getters.
     */
    @Test
    public void testCharacterTypeElfGet() {
        Character character = new BaseCharacter();
        character = new Elf(character);
        character.create();
        assertEquals(character.getCharacterType(), "Elf");
        assertEquals(character.getCharacterHealth(), 250);
        assertEquals(character.getCharacterInitHealth(), 250);
        assertEquals(character.getCharacterInitHealth(), character.getCharacterHealth());
        assertEquals(character.getCharacterMinHealth(), 100);
        assertEquals(character.getCharacterMaxHealth(), 1000);
        assertEquals(character.getCharacterAttackDamage(), 50);
        assertEquals(character.getCharacterDefense(), 10);
        assertEquals(character.getCharacterSpeed(), 100);
        assertEquals(character.getCharacterGems(), 50);
        assertEquals(character.getCharacterMinFindGems(), 1);
        assertEquals(character.getCharacterMaxFindGems(), 500);
        assertEquals(character.getCharacterHealthPotions(), 5);
        assertEquals(character.getCharacterInitHealthPotions(), 5);
        assertEquals(character.getCharacterHealthPotionHealAmt(), 75);
    }

    /**
     * testCharacterTypeElfSet test setters.
     */
    @Test
    public void testCharacterTypeElfSet() {
        Character character = new BaseCharacter();
        character = new Elf(character);
        character.create();
        character.setCharacterType("");
        character.setCharacterHealth(25);
        character.setCharacterInitHealth(25);
        character.setCharacterInitHealth(character.getCharacterHealth());
        character.setCharacterMinHealth(25);
        character.setCharacterMaxHealth(25);
        character.setCharacterAttackDamage(25);
        character.setCharacterDefense(25);
        character.setCharacterSpeed(25);
        character.setCharacterGems(25);
        character.setCharacterMinFindGems(25);
        character.setCharacterMaxFindGems(25);
        character.setCharacterHealthPotions(25);
        character.setCharacterInitHealthPotions(25);
        character.setCharacterHealthPotionHealAmt(25);

        assertEquals(character.getCharacterType(), "");
        assertEquals(character.getCharacterHealth(), 25);
        assertEquals(character.getCharacterInitHealth(), 25);
        assertEquals(character.getCharacterInitHealth(), character.getCharacterHealth());
        assertEquals(character.getCharacterMinHealth(), 25);
        assertEquals(character.getCharacterMaxHealth(), 25);
        assertEquals(character.getCharacterAttackDamage(), 25);
        assertEquals(character.getCharacterDefense(), 25);
        assertEquals(character.getCharacterSpeed(), 25);
        assertEquals(character.getCharacterGems(), 25);
        assertEquals(character.getCharacterMinFindGems(), 25);
        assertEquals(character.getCharacterMaxFindGems(), 25);
        assertEquals(character.getCharacterHealthPotions(), 25);
        assertEquals(character.getCharacterInitHealthPotions(), 25);
        assertEquals(character.getCharacterHealthPotionHealAmt(), 25);
    }

    /**
     * testCharacterTypeHumanGet test getters.
     */
    @Test
    public void testCharacterTypeHumanGet() {
        Character character = new BaseCharacter();
        character = new Human(character);
        character.create();
        assertEquals(character.getCharacterType(), "Human");
        assertEquals(character.getCharacterHealth(), 250);
        assertEquals(character.getCharacterInitHealth(), 250);
        assertEquals(character.getCharacterInitHealth(), character.getCharacterHealth());
        assertEquals(character.getCharacterMinHealth(), 100);
        assertEquals(character.getCharacterMaxHealth(), 1000);
        assertEquals(character.getCharacterAttackDamage(), 50);
        assertEquals(character.getCharacterDefense(), 10);
        assertEquals(character.getCharacterSpeed(), 100);
        assertEquals(character.getCharacterGems(), 50);
        assertEquals(character.getCharacterMinFindGems(), 1);
        assertEquals(character.getCharacterMaxFindGems(), 500);
        assertEquals(character.getCharacterHealthPotions(), 5);
        assertEquals(character.getCharacterInitHealthPotions(), 5);
        assertEquals(character.getCharacterHealthPotionHealAmt(), 75);
    }

    /**
     * testCharacterTypeHumanSet test setters.
     */
    @Test
    public void testCharacterTypeHumanSet() {
        Character character = new BaseCharacter();
        character = new Human(character);
        character.create();
        character.setCharacterType("");
        character.setCharacterHealth(25);
        character.setCharacterInitHealth(25);
        character.setCharacterInitHealth(character.getCharacterHealth());
        character.setCharacterMinHealth(25);
        character.setCharacterMaxHealth(25);
        character.setCharacterAttackDamage(25);
        character.setCharacterDefense(25);
        character.setCharacterSpeed(25);
        character.setCharacterGems(25);
        character.setCharacterMinFindGems(25);
        character.setCharacterMaxFindGems(25);
        character.setCharacterHealthPotions(25);
        character.setCharacterInitHealthPotions(25);
        character.setCharacterHealthPotionHealAmt(25);

        assertEquals(character.getCharacterType(), "");
        assertEquals(character.getCharacterHealth(), 25);
        assertEquals(character.getCharacterInitHealth(), 25);
        assertEquals(character.getCharacterInitHealth(), character.getCharacterHealth());
        assertEquals(character.getCharacterMinHealth(), 25);
        assertEquals(character.getCharacterMaxHealth(), 25);
        assertEquals(character.getCharacterAttackDamage(), 25);
        assertEquals(character.getCharacterDefense(), 25);
        assertEquals(character.getCharacterSpeed(), 25);
        assertEquals(character.getCharacterGems(), 25);
        assertEquals(character.getCharacterMinFindGems(), 25);
        assertEquals(character.getCharacterMaxFindGems(), 25);
        assertEquals(character.getCharacterHealthPotions(), 25);
        assertEquals(character.getCharacterInitHealthPotions(), 25);
        assertEquals(character.getCharacterHealthPotionHealAmt(), 25);
    }

    /**
     * testCharacterTypeOrcGet test getters.
     */
    @Test
    public void testCharacterTypeOrcGet() {
        Character character = new BaseCharacter();
        character = new Orc(character);
        character.create();
        assertEquals(character.getCharacterType(), "Orc");
        assertEquals(character.getCharacterHealth(), 250);
        assertEquals(character.getCharacterInitHealth(), 250);
        assertEquals(character.getCharacterInitHealth(), character.getCharacterHealth());
        assertEquals(character.getCharacterMinHealth(), 100);
        assertEquals(character.getCharacterMaxHealth(), 1000);
        assertEquals(character.getCharacterAttackDamage(), 50);
        assertEquals(character.getCharacterDefense(), 10);
        assertEquals(character.getCharacterSpeed(), 100);
        assertEquals(character.getCharacterGems(), 50);
        assertEquals(character.getCharacterMinFindGems(), 1);
        assertEquals(character.getCharacterMaxFindGems(), 500);
        assertEquals(character.getCharacterHealthPotions(), 5);
        assertEquals(character.getCharacterInitHealthPotions(), 5);
        assertEquals(character.getCharacterHealthPotionHealAmt(), 75);
    }

    /**
     * testCharacterTypeOrcSet test setters.
     */
    @Test
    public void testCharacterTypeOrcSet() {
        Character character = new BaseCharacter();
        character = new Orc(character);
        character.create();
        character.setCharacterType("");
        character.setCharacterHealth(25);
        character.setCharacterInitHealth(25);
        character.setCharacterInitHealth(character.getCharacterHealth());
        character.setCharacterMinHealth(25);
        character.setCharacterMaxHealth(25);
        character.setCharacterAttackDamage(25);
        character.setCharacterDefense(25);
        character.setCharacterSpeed(25);
        character.setCharacterGems(25);
        character.setCharacterMinFindGems(25);
        character.setCharacterMaxFindGems(25);
        character.setCharacterHealthPotions(25);
        character.setCharacterInitHealthPotions(25);
        character.setCharacterHealthPotionHealAmt(25);

        assertEquals(character.getCharacterType(), "");
        assertEquals(character.getCharacterHealth(), 25);
        assertEquals(character.getCharacterInitHealth(), 25);
        assertEquals(character.getCharacterInitHealth(), character.getCharacterHealth());
        assertEquals(character.getCharacterMinHealth(), 25);
        assertEquals(character.getCharacterMaxHealth(), 25);
        assertEquals(character.getCharacterAttackDamage(), 25);
        assertEquals(character.getCharacterDefense(), 25);
        assertEquals(character.getCharacterSpeed(), 25);
        assertEquals(character.getCharacterGems(), 25);
        assertEquals(character.getCharacterMinFindGems(), 25);
        assertEquals(character.getCharacterMaxFindGems(), 25);
        assertEquals(character.getCharacterHealthPotions(), 25);
        assertEquals(character.getCharacterInitHealthPotions(), 25);
        assertEquals(character.getCharacterHealthPotionHealAmt(), 25);
    }
}
