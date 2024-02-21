/**
 * File: Rockling.java.
 * Author: Nicole Garcia
 * Date: 02/15/2024
 */

package enemies;

/**
 * Rockling class.
 */
public class Rockling extends Enemy {

    private String enemyType = "Rockling";

    private int enemyHealth;
    private int enemyMaxHealth;
    private int enemyMaxDamageDealt;
    private int enemyMinHealth;
    private int enemyMinDamageDealt;

    private int enemySpeed;

    /**
     * Rockling constructor.
     * @param enemyHealth int
     * @param enemyMaxHealth int
     * @param enemyMaxDamageDealt int
     * @param enemyMinHealth int
     * @param enemyMinDamageDealt int
     * @param enemySpeed int
     */
    public Rockling(int enemyHealth, int enemyMaxHealth,
                    int enemyMaxDamageDealt, int enemyMinHealth,
                    int enemyMinDamageDealt, int enemySpeed) {
        this.enemyHealth = enemyHealth;
        this.enemyMaxHealth = enemyMaxHealth;
        this.enemyMaxDamageDealt = enemyMaxDamageDealt;
        this.enemyMinHealth = enemyMinHealth;
        this.enemyMinDamageDealt = enemyMinDamageDealt;
        this.enemySpeed = enemySpeed;
    }

    @Override
    public String getEnemyType() {
        return this.enemyType;
    }

    @Override
    public void setEnemyHealth(int healthPoints) {
        this.enemyHealth = healthPoints;
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

    @Override
    public int getEnemySpeed() {
        return this.enemySpeed;
    }
}
