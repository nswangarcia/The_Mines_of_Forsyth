/**
 * File: TestEnemyFactory.java.
 * Author: Nicole Garcia
 * Date: 02/15/2024
 */

import enemies.BatKing;
import enemies.CaveTroll;
import enemies.CrazedDwarf;
import enemies.DarkWizard;
import enemies.Enemy;
import enemies.Goblin;
import enemies.Orc;
import enemies.Rockling;
import enemies.ShadowMonster;
import enemies.Zombie;
import factory.EnemyFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Enemy Factory class.
 */
public class TestEnemyFactory {

    @Test
    public void testBatKingFactory() {
        Enemy batKing = EnemyFactory.getEnemy("Bat King", 50, 100,
                            25, 10, 5, 30);
        System.out.println("\nBat King Stats:\n" + batKing);
        assertEquals(batKing.getEnemyHealth(), 50);
        assertEquals(batKing.getEnemyMaxHealth(), 100);
        assertEquals(batKing.getEnemyMaxDamageDealt(), 25);
        assertEquals(batKing.getEnemyMinHealth(), 10);
        assertEquals(batKing.getEnemyMinDamageDealt(), 5);
        assertEquals(batKing.getEnemySpeed(), 30);
    }

    @Test
    public void testCaveTrollFactory() {
        Enemy caveTroll = EnemyFactory.getEnemy("Cave Troll", 100, 200,
                30, 50, 5, 30);
        System.out.println("\nCave Troll Stats:\n" + caveTroll);
        assertEquals(caveTroll.getEnemyHealth(), 100);
        assertEquals(caveTroll.getEnemyMaxHealth(), 200);
        assertEquals(caveTroll.getEnemyMaxDamageDealt(), 30);
        assertEquals(caveTroll.getEnemyMinHealth(), 50);
        assertEquals(caveTroll.getEnemyMinDamageDealt(), 5);
        assertEquals(caveTroll.getEnemySpeed(), 30);
    }

    @Test
    public void testCrazedDwarfFactory() {
        Enemy crazedDwarf = EnemyFactory.getEnemy("Crazed Dwarf", 75, 150,
                                15, 25, 5, 30);
        System.out.println("\nCrazed Dwarf Stats:\n" + crazedDwarf);
        assertEquals(crazedDwarf.getEnemyHealth(), 75);
        assertEquals(crazedDwarf.getEnemyMaxHealth(), 150);
        assertEquals(crazedDwarf.getEnemyMaxDamageDealt(), 15);
        assertEquals(crazedDwarf.getEnemyMinHealth(), 25);
        assertEquals(crazedDwarf.getEnemyMinDamageDealt(), 5);
        assertEquals(crazedDwarf.getEnemySpeed(), 30);
    }

    @Test
    public void testDarkWizardFactory() {
        Enemy darkWizard = EnemyFactory.getEnemy("Dark Wizard", 300,
                                     300, 75, 50,
                10, 30);
        System.out.println("\nDark Wizard Stats:\n" + darkWizard);
        assertEquals(darkWizard.getEnemyHealth(), 300);
        assertEquals(darkWizard.getEnemyMaxHealth(), 300);
        assertEquals(darkWizard.getEnemyMaxDamageDealt(), 75);
        assertEquals(darkWizard.getEnemyMinHealth(), 50);
        assertEquals(darkWizard.getEnemyMinDamageDealt(), 10);
        assertEquals(darkWizard.getEnemySpeed(), 30);
    }

    @Test
    public void testGoblinFactory() {
        Enemy goblin = EnemyFactory.getEnemy("Goblin", 25,
                                100, 20, 5,
                1, 30);
        System.out.println("\nGoblin Stats:\n" + goblin);
        assertEquals(goblin.getEnemyHealth(), 25);
        assertEquals(goblin.getEnemyMaxHealth(), 100);
        assertEquals(goblin.getEnemyMaxDamageDealt(), 20);
        assertEquals(goblin.getEnemyMinHealth(), 5);
        assertEquals(goblin.getEnemyMinDamageDealt(), 1);
        assertEquals(goblin.getEnemySpeed(), 30);
    }

    @Test
    public void testOrcFactory() {
        Enemy orc = EnemyFactory.getEnemy("Orc", 75, 150,
                        25, 10, 5, 30);
        System.out.println("\nOrc Stats:\n" + orc);
        assertEquals(orc.getEnemyHealth(), 75);
        assertEquals(orc.getEnemyMaxHealth(), 150);
        assertEquals(orc.getEnemyMaxDamageDealt(), 25);
        assertEquals(orc.getEnemyMinHealth(), 10);
        assertEquals(orc.getEnemyMinDamageDealt(), 5);
        assertEquals(orc.getEnemySpeed(), 30);
    }

    @Test
    public void testRocklingFactory() {
        Enemy rockling = EnemyFactory.getEnemy("Rockling", 15, 50,
                                                10, 1,
                1, 30);
        System.out.println("\nRockling Stats:\n" + rockling);
        assertEquals(rockling.getEnemyHealth(), 15);
        assertEquals(rockling.getEnemyMaxHealth(), 50);
        assertEquals(rockling.getEnemyMaxDamageDealt(), 10);
        assertEquals(rockling.getEnemyMinHealth(), 1);
        assertEquals(rockling.getEnemyMinDamageDealt(), 1);
        assertEquals(rockling.getEnemySpeed(), 30);
    }

    @Test
    public void testShadowMonsterFactory() {
        Enemy shadowMonster = EnemyFactory.getEnemy("Shadow Monster", 200, 500,
                                                    100, 50,
                25, 100);
        System.out.println("\nShadow Monster Stats:\n" + shadowMonster);
        assertEquals(shadowMonster.getEnemyHealth(), 200);
        assertEquals(shadowMonster.getEnemyMaxHealth(), 500);
        assertEquals(shadowMonster.getEnemyMaxDamageDealt(), 100);
        assertEquals(shadowMonster.getEnemyMinHealth(), 50);
        assertEquals(shadowMonster.getEnemyMinDamageDealt(), 25);
        assertEquals(shadowMonster.getEnemySpeed(), 100);
    }

    @Test
    public void testZombieFactory() {
        Enemy zombie = EnemyFactory.getEnemy("Zombie", 200, 500,
                                            100, 25,
                15, 30);
        System.out.println("\nZombie Stats:\n" + zombie);
        assertEquals(zombie.getEnemyHealth(), 200);
        assertEquals(zombie.getEnemyMaxHealth(), 500);
        assertEquals(zombie.getEnemyMaxDamageDealt(), 100);
        assertEquals(zombie.getEnemyMinHealth(), 25);
        assertEquals(zombie.getEnemyMinDamageDealt(), 15);
        assertEquals(zombie.getEnemySpeed(), 30);
    }

}
