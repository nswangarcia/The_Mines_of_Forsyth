/**
 * File: Enemy.java.
 * Author: Nicole Garcia
 * Date: 02/15/2024
 */
package enemies;

/**
 *
 */
public abstract class Enemy {

    public abstract String getEnemyType();
    public abstract void setEnemyHealth(int healthPoints);
    public abstract int getEnemyHealth();
    public abstract int getEnemyMaxHealth();
    public abstract int getEnemyMaxDamageDealt();

    public abstract int getEnemyMinHealth();

    public abstract int getEnemyMinDamageDealt();

    public abstract int getEnemySpeed();

    @Override
    public String toString(){
        return "\tType: " + this.getEnemyType() + "\n\tHealth: " + this.getEnemyHealth() +
                "\n\tMax Health: " + getEnemyMaxHealth() + "\n\tMax Damage Dealt: " + getEnemyMaxDamageDealt() +
                "\n\tMin Health: " + getEnemyMinHealth() + "\n\tMin Damage Dealt: " + getEnemyMinDamageDealt() +
                "\n\tSpeed: " + getEnemySpeed();
    }
}
