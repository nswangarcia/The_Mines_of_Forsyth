/**
 * File: EnemyFactory.java.
 * Author: Nicole Garcia
 * Date: 02/15/2024
 */

package factory;

import enemies.BatKing;
import enemies.CaveTroll;
import enemies.CrazedDwarf;
import enemies.DarkWizard;
import enemies.DragonKingFinalBoss;
import enemies.Enemy;
import enemies.Goblin;
import enemies.Orc;
import enemies.Rockling;
import enemies.ShadowMonster;
import enemies.Zombie;

/**
 * EnemyFactory class.
 */
public class EnemyFactory {

    /**
     * This method builds the enemy based on a given input.
     * @param enemy - String representing enemy.
     * @param enemyHealth - int representing enemy health.
     * @param enemyMaxHealth - int representing enemy max health.
     * @param enemyMaxDamageDealt -  int representing enemy max damage dealt.
     * @return Enemy
     */
    public static Enemy getEnemy(String enemy, int enemyHealth, int enemyMaxHealth,
                                 int enemyMaxDamageDealt, int enemyMinHealth,
                                 int enemyMinDamageDealt, int enemySpeed) {
        if ("Bat King".equalsIgnoreCase(enemy)) {
            return new BatKing(enemyHealth, enemyMaxHealth, enemyMaxDamageDealt, enemyMinHealth,
                                    enemyMinDamageDealt, enemySpeed);
        } else if ("Cave Troll".equalsIgnoreCase(enemy)) {
            return new CaveTroll(enemyHealth, enemyMaxHealth, enemyMaxDamageDealt, enemyMinHealth,
                                    enemyMinDamageDealt, enemySpeed);
        } else if ("Crazed Dwarf".equalsIgnoreCase(enemy)) {
            return new CrazedDwarf(enemyHealth, enemyMaxHealth, enemyMaxDamageDealt, enemyMinHealth,
                                    enemyMinDamageDealt, enemySpeed);
        } else if ("Dark Wizard".equalsIgnoreCase(enemy)) {
            return new DarkWizard(enemyHealth, enemyMaxHealth, enemyMaxDamageDealt, enemyMinHealth,
                                    enemyMinDamageDealt, enemySpeed);
        } else if ("Goblin".equalsIgnoreCase(enemy)) {
            return new Goblin(enemyHealth, enemyMaxHealth, enemyMaxDamageDealt, enemyMinHealth,
                                enemyMinDamageDealt, enemySpeed);
        } else if ("Orc".equalsIgnoreCase(enemy)) {
            return new Orc(enemyHealth, enemyMaxHealth, enemyMaxDamageDealt, enemyMinHealth,
                                enemyMinDamageDealt, enemySpeed);
        } else if ("Rockling".equalsIgnoreCase(enemy)) {
            return new Rockling(enemyHealth, enemyMaxHealth, enemyMaxDamageDealt, enemyMinHealth,
                                enemyMinDamageDealt, enemySpeed);
        } else if ("Shadow Monster".equalsIgnoreCase(enemy)) {
            return new ShadowMonster(enemyHealth, enemyMaxHealth,
                    enemyMaxDamageDealt, enemyMinHealth,
                                enemyMinDamageDealt, enemySpeed);
        } else if ("Zombie".equalsIgnoreCase(enemy)) {
            return new Zombie(enemyHealth, enemyMaxHealth, enemyMaxDamageDealt, enemyMinHealth,
                                enemyMinDamageDealt, enemySpeed);
        } else if ("Dragon King".equalsIgnoreCase(enemy)) {
            return new DragonKingFinalBoss(enemyHealth, enemyMaxHealth,
                    enemyMaxDamageDealt, enemyMinHealth,
                    enemyMinDamageDealt, enemySpeed);
        }
        return null;
    }
}
