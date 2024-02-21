/**
 * File: TestEnemyFactory.java.
 * Author: Nicole Garcia
 * Date: 02/15/2024
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import enemies.Enemy;
import factory.EnemyFactory;
import org.junit.jupiter.api.Test;

/**
 * Tests for the Enemy Factory class.
 */
public class TestEnemyFactory {

    @Test
    public void testEmptyFactory() {
        Enemy enemy = EnemyFactory.getEnemy("", 0, 0,
                0, 0, 0, 0);
        assertEquals(enemy, null);
    }

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

        batKing.setEnemyHealth(30);
        assertEquals(batKing.getEnemyHealth(),30);
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

        caveTroll.setEnemyHealth(30);
        assertEquals(caveTroll.getEnemyHealth(),30);
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

        crazedDwarf.setEnemyHealth(30);
        assertEquals(crazedDwarf.getEnemyHealth(),30);
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

        darkWizard.setEnemyHealth(30);
        assertEquals(darkWizard.getEnemyHealth(),30);
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

        goblin.setEnemyHealth(30);
        assertEquals(goblin.getEnemyHealth(),30);
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

        orc.setEnemyHealth(30);
        assertEquals(orc.getEnemyHealth(),30);
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

        rockling.setEnemyHealth(30);
        assertEquals(rockling.getEnemyHealth(),30);
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

        shadowMonster.setEnemyHealth(30);
        assertEquals(shadowMonster.getEnemyHealth(),30);
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

        zombie.setEnemyHealth(30);
        assertEquals(zombie.getEnemyHealth(),30);
    }

    @Test
    public void testDragonKingFactory() {
        Enemy dragonKing = EnemyFactory.getEnemy("Dragon King", 500, 1000,
                200, 50,
                15, 200);
        System.out.println("\nDragon King Stats:\n" + dragonKing);
        assertEquals(dragonKing.getEnemyHealth(), 500);
        assertEquals(dragonKing.getEnemyMaxHealth(), 1000);
        assertEquals(dragonKing.getEnemyMaxDamageDealt(), 200);
        assertEquals(dragonKing.getEnemyMinHealth(), 50);
        assertEquals(dragonKing.getEnemyMinDamageDealt(), 15);
        assertEquals(dragonKing.getEnemySpeed(), 200);

        dragonKing.setEnemyHealth(30);
        assertEquals(dragonKing.getEnemyHealth(),30);
    }

}
