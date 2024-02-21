/**
 * File: TestRun.java.
 * Author: Nicole Garcia
 * Date: 02/20/2024
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import decorator.Character;

import enemies.Enemy;

import java.util.Random;

import org.junit.jupiter.api.Test;


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
        Run run = new Run();
        Character character = run.getCharacter();
        Enemy enemy = run.createEnemy(100, "Goblin",
                200, 100,
                10, 1, 20);
        character.setCharacterHealth(10);
        Random rand = new Random();
        assertTrue(run.attack("Goblin", enemy, rand, 1, true));
        character.setCharacterSpeed(0);
        assertTrue(run.attack("Goblin", enemy, rand, 1, true));
        enemy.setEnemyHealth(0);
        character.setCharacterHealth(0);
        assertTrue(run.attack("Goblin", enemy, rand, 50, true));
        assertTrue(run.attack("Goblin", enemy, rand, 1, true));
        assertFalse(run.attack("Goblin", enemy, rand, 1, false));
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
        character = run.chooseCharacterClass(run.getCharacter(), true,  3, 4, rand);
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
        character = run.chooseCharacterType(run.getCharacter(), true,  3, 4, rand);
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
        Run run = new Run();
        Character character = run.getCharacter();
        // character health + health potion heal <= character health max
        character.setCharacterHealthPotions(5);
        character.setCharacterHealth(25);
        run.useHealthPotion();

        assertEquals(character.getCharacterHealthPotions(), 4);
        assertEquals(character.getCharacterHealth(), 100);

        // character health + health potion heal > character health max
        character.setCharacterHealthPotions(5);
        character.setCharacterHealth(950);
        run.useHealthPotion();
        int health1 = character.getCharacterHealth();
        assertEquals(character.getCharacterHealthPotions(), 4);
        assertEquals(character.getCharacterHealth(), health1);

        // character health + health potion heal > character health max
        // where character health is already at max
        character.setCharacterHealthPotions(5);
        character.setCharacterHealth(1000);
        run.useHealthPotion();
        int health2 = character.getCharacterHealth();
        assertEquals(character.getCharacterHealthPotions(), 5);
        assertEquals(character.getCharacterHealth(), health2);

        // no health potions left
        character.setCharacterHealthPotions(0);
        character.setCharacterHealth(100);
        run.useHealthPotion();
        int health3 = character.getCharacterHealth();
        assertEquals(character.getCharacterHealthPotions(), 0);
        assertEquals(character.getCharacterHealth(), health3);
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
        Run run = new Run();
        Enemy enemy = run.createEnemy(100, "Goblin",
                200, 100,
                10, 1, 20);

        assertEquals(enemy.getEnemyHealth(), 100);
        assertEquals(enemy.getEnemyMaxHealth(), 200);
        assertEquals(enemy.getEnemyMaxDamageDealt(), 100);
        assertEquals(enemy.getEnemyMinHealth(), 10);
        assertEquals(enemy.getEnemyMinDamageDealt(), 1);
        assertEquals(enemy.getEnemySpeed(), 20);
    }

    /**
     * testGenerateChest tests.
     */
    @Test
    public void testGenerateChest() {
        Run run = new Run();
        Character character = run.getCharacter();
        int characterGems = character.getCharacterGems();
        int gems = 100;
        int characterHealthPotions = character.getCharacterHealthPotions();
        run.generateChest(100, 100, 101);

        assertEquals(character.getCharacterGems(), 50);
        assertEquals(character.getCharacterHealthPotions(), 5);

        run.generateChest(0, 100, 101);

        assertEquals(character.getCharacterGems(), 150);
        assertEquals(character.getCharacterHealthPotions(), 6);
    }

    /**
     * testLevel tests.
     */
    @Test
    public void testLevel() {
        Run run = new Run();
        run.setLevel(1);
        assertEquals(run.getLevel(), 1);
    }

    /**
     * testCycle tests.
     */
    @Test
    public void testCycle() {
        Run run = new Run();
        run.setCycle(1);
        assertEquals(run.getCycle(), 1);
    }

    /**
     * testSetCycleAndLevel tests.
     */
    @Test
    public void testSetCycleAndLevel() {
        Run run = new Run();
        // cycle less than 10
        run.setCycle(9);
        run.setLevel(1);
        run.setCycleAndLevel();
        assertEquals(run.getCycle(), 10);
        assertEquals(run.getLevel(), 2);
        // cycle = 10
        run.setCycle(10);
        run.setCycleAndLevel();
        assertEquals(run.getCycle(), 1);
        assertEquals(run.getLevel(), 3);
    }

    /**
     * testGenerateHealthPotionDrop test.
     */
    @Test
    public void testGenerateHealthPotionDrop() {
        Run run  = new Run();
        Character character = run.getCharacter();
        int characterHealthPotions = character.getCharacterHealthPotions();
        run.generateHealthPotionDrop(100, "Goblin");
        assertEquals(character.getCharacterHealthPotions(), 5);

        run.generateHealthPotionDrop(0, "Goblin");
        assertEquals(character.getCharacterHealthPotions(), 6);

    }

}
