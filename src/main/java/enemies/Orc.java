/**
 * File: Orc.java.
 * Author: Nicole Garcia
 * Date: 02/15/2024
 */
package enemies;

/**
 *
 */
public class Orc extends Enemy {

    private int enemyHealth;
    private int enemyMaxHealth;
    private int enemyMaxDamageDealt;
    private int enemyMinHealth;
    private int enemyMinDamageDealt;

    public Orc(int enemyHealth, int enemyMaxHealth, int enemyMaxDamageDealt, int enemyMinHealth, int enemyMinDamageDealt) {
        this.enemyHealth = enemyHealth;
        this.enemyMaxHealth = enemyMaxHealth;
        this.enemyMaxDamageDealt = enemyMaxDamageDealt;
        this.enemyMinHealth=enemyMinHealth;
        this.enemyMinDamageDealt = enemyMinDamageDealt;
    }

    @Override
    public int getEnemyHealth() {
        return this.enemyHealth;
    }

    @Override
    public int getEnemyMaxHealth() {
        return this.enemyMaxHealth;
    }

    @Override
    public int getEnemyMaxDamageDealt() {
        return this.enemyMaxDamageDealt;
    }

    @Override
    public int getEnemyMinHealth() {
        return this.enemyMinHealth;
    }

    @Override
    public int getEnemyMinDamageDealt() {
        return this.enemyMinDamageDealt;
    }
}


