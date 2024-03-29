/**
 * File: TestCharacterClass.java.
 * Author: Nicole Garcia
 * Date: 02/20/2024
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import decorator.BaseCharacter;
import decorator.Character;
import decorator.characterclass.Brawler;
import decorator.characterclass.Miner;
import decorator.characterclass.Warrior;
import decorator.characterclass.Wizard;

import org.junit.jupiter.api.Test;

/**
 * TestCharacterClass class test cases.
 */
public class TestCharacterClass {

    /**
     * testCharacterClassBrawler test getters.
     */
    @Test
    public void testCharacterClassBrawler() {
        Character character = new BaseCharacter();
        character = new Brawler(character);
        character.create();
        assertEquals(character.getCharacterClass(), "Brawler");
        assertEquals(character.getCharacterSpeed(), 25);
    }

    /**
     * testCharacterClassMiner test getters.
     */
    @Test
    public void testCharacterClassMiner() {
        Character character = new BaseCharacter();
        character = new Miner(character);
        character.create();
        assertEquals(character.getCharacterClass(), "Miner");
        assertEquals(character.getCharacterMaxFindGems(), 200);
    }

    /**
     * testCharacterClassWarrior test getters.
     */
    @Test
    public void testCharacterClassWarrior() {
        Character character = new BaseCharacter();
        character = new Warrior(character);
        character.create();
        assertEquals(character.getCharacterClass(), "Warrior");
        assertEquals(character.getCharacterDefense(), 100);
        assertEquals(character.getCharacterHealth(), 200);
    }

    /**
     * testCharacterClassWizard test getters.
     */
    @Test
    public void testCharacterClassWizard() {
        Character character = new BaseCharacter();
        character = new Wizard(character);
        character.create();
        assertEquals(character.getCharacterClass(), "Wizard");
        assertEquals(character.getCharacterHealthPotionHealAmt(), 100);
    }
}