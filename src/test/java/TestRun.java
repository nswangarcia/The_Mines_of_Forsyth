/**
 * File: TestRun.java.
 * Author: Nicole Garcia
 * Date: 02/20/2024
 */

import decorator.Character;

import decorator.characterClass.Warrior;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TestRun class test cases.
 */
public class TestRun {

    /**
     * testRun tests.
     */
    @Test
    public void testRun() {

    }

    /**
     * testAttack tests.
     */
    @Test
    public void testAttack() {

    }

    /**
     * testChooseCharacterClass tests.
     */
    @Test
    public void testChooseCharacterClass() {
        Run run = new Run();
        Random rand = new Random();
        Character character;
        // Brawler
        character = run.chooseCharacterClass(run.getCharacter(), true,  1, 2, rand);
        assertEquals(character.getCharacterClass(), "Brawler");
        // Miner
        character = run.chooseCharacterClass(run.getCharacter(), true,  2, 3, rand);
        assertEquals(character.getCharacterClass(), "Miner");
        // Warrior
        character= run.chooseCharacterClass(run.getCharacter(), true,  3, 4, rand);
        assertEquals(character.getCharacterClass(), "Warrior");
        // Wizard
        character = run.chooseCharacterClass(run.getCharacter(), true,  4, 5, rand);
        assertEquals(character.getCharacterClass(), "Wizard");
    }

    /**
     * testChooseCharacterType tests.
     */
    @Test
    public void testChooseCharacterType() {
        Run run = new Run();
        Random rand = new Random();
        Character character;
        // Dwarf
        character = run.chooseCharacterType(run.getCharacter(), true,  1, 2, rand);
        assertEquals(character.getCharacterType(), "Dwarf");
        // Elf
        character = run.chooseCharacterType(run.getCharacter(), true,  2, 3, rand);
        assertEquals(character.getCharacterType(), "Elf");
        // Human
        character= run.chooseCharacterType(run.getCharacter(), true,  3, 4, rand);
        assertEquals(character.getCharacterType(), "Human");
        // Orc
        character = run.chooseCharacterType(run.getCharacter(), true,  4, 5, rand);
        assertEquals(character.getCharacterType(), "Orc");
    }

    /**
     * testUseHealthPotion tests.
     */
    @Test
    public void testUseHealthPotion() {

    }

    /**
     * testBackToTop tests.
     */
    @Test
    public void testBackToTop() {
        Run run = new Run();
        Character character = run.getCharacter();
        run.backToTop();
        int health = character.getCharacterHealth();
        int healthPotions = character.getCharacterHealthPotions();
        assertEquals(character.getCharacterHealth(), health);
        assertEquals(character.getCharacterHealthPotions(), healthPotions);
        assertEquals(run.getLevel(), 1);
        assertEquals(run.getCycle(), 1);
    }

    /**
     * testCreateEnemy tests.
     */
    @Test
    public void testCreateEnemy() {

    }
}
