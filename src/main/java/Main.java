/**
 * File: Main.java.
 * Author: Nicole Garcia
 * Date: 02/12/2024
 */

import enemies.Enemy;
import factory.EnemyFactory;

import java.util.Random;
import java.util.Scanner;

/**
 * Main class.
 */
public class Main {

    /**
     * Main constructor.
     */
    public Main() {
    }

    /**
     * Main method.
     * @param args main arguments
     */
    public static void main(String[] args) {
        init();
    }

    /**
     * Initialize The Mines of Forsyth.
     * @return boolean
     */
    public static boolean init() {
        System.out.println("*********************************************");
        System.out.println("*                WELCOME TO                 *");
        System.out.println("*           THE MINES OF FORSYTH:           *");
        System.out.println("*           DUNGEON CRAWLER GAME            *");
        System.out.println("*********************************************");
        run();
        return true;
    }

    public static void run() {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int level = 1;
        int cycle = 1;

        // Enemy setup
        String[] smallEnemies = {"Crazed Dwarf", "Goblin", "Rockling"};
        String[] mediumEnemies = {"Cave Troll", "Orc", "Zombie"};
        String[] bossEnemies = { "Bat King", "Dark Wizard", "Shadow Monster"};
        String[] colors = { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        int enemyHealth = 75;
        int[] enemyMaxHealth = {25, 75, 150};
        int[] enemyMaxDamageDealt = {15, 25, 50};
        int[] enemyMinHealth = {1, 25, 75};
        int[] enemyMinDamageDealt = {1, 5, 10};
        String enemyType;
        Enemy enemy;

        // Player setup
        int playerHealth = 500; // initial player health
        int playerMaxHealth = 500;
        int playerAttackDamage = 100;
        int playerHealthPotions = 5;
        int playerInitHealthPotions = 5;
        int playerHealPotionAmt = 50;
        int healthPotionDrop = 50; // Percentage or health potion dropped when defeating an enemey.

        boolean gameRunning = true;
        boolean choosePlayer = true;
        while (choosePlayer) {
            System.out.println("\tChoose your player: ");
            System.out.println("\t1: Human");
            System.out.println("\t1: Dwarf");
            System.out.println("\t1: Elf");
            System.out.println("\t1: Wizard");
            String input = in.nextLine();
            // TODO: Use decorator design here
            if (input.equals("1")) {

                choosePlayer = false;
            } else if (input.equals("2")) {

                choosePlayer = false;
            } else if (input.equals("3")) {

                choosePlayer = false;
            } else if (input.equals("4")) {

                choosePlayer = false;
            } else {
                System.out.println("\tSorry, invalid selection, try again.");
            }
        }


        // run game
        while (gameRunning) {
            System.out.println("\tEntering level " + level + "...");
            System.out.println("*********************************************");
            if (cycle < 5) { // small enemy
                enemyHealth = rand.nextInt(enemyMinHealth[0],enemyMaxHealth[0]);
                enemyType = smallEnemies[rand.nextInt(smallEnemies.length)];
                enemy = EnemyFactory.getEnemy(enemyType, enemyHealth, enemyMaxHealth[0],
                        enemyMaxDamageDealt[0], enemyMinHealth[0], enemyMinDamageDealt[0]);
            } else if (cycle < 10) { // medium enemy
                enemyHealth = rand.nextInt(enemyMinHealth[1],enemyMaxHealth[1]);
                enemyType = smallEnemies[rand.nextInt(smallEnemies.length)];
                enemy = EnemyFactory.getEnemy(enemyType, enemyHealth, enemyMaxHealth[1],
                        enemyMaxDamageDealt[1], enemyMinHealth[1], enemyMinDamageDealt[1]);
            } else { // boss enemy
                enemyHealth = rand.nextInt(enemyMinHealth[2],enemyMaxHealth[2]);
                enemyType = smallEnemies[rand.nextInt(smallEnemies.length)];
                enemy = EnemyFactory.getEnemy(enemyType, enemyHealth, enemyMaxHealth[2],
                        enemyMaxDamageDealt[2], enemyMinHealth[2], enemyMinDamageDealt[2]);
            }

            System.out.println("\t*** Oh no! A " + enemyType + " has appeared! ***\n");

            // game combat
            while (enemy.getEnemyHealth() > 0) {
                System.out.println("\tYour Health Points: " + playerHealth);
                System.out.println("\t" + enemyType + "'s Health Points: " + enemy.getEnemyHealth());
                System.out.println("\n\tWhat are you going to do?");
                System.out.println("\t 1: Attack");
                System.out.println("\t 2: Drink Health Potion");
                System.out.println("\t 3: Run Away");
                System.out.println("\t 4: Quit Game");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int playerDamageDealt = rand.nextInt(playerAttackDamage);
                    int playerDamageTaken = 0;
                    playerDamageTaken = rand.nextInt(enemy.getEnemyMinDamageDealt(),enemy.getEnemyMaxDamageDealt());

                    enemy.setEnemyHealth((enemy.getEnemyHealth()) - playerDamageDealt);
                    playerHealth -= playerDamageTaken;

                    System.out.println("\tYou attack the " + enemyType + " for " + playerDamageDealt + " damage");
                    System.out.println("\tYou take " + playerDamageTaken + " damage from the " + enemyType + "'s attack!");

                    if (playerHealth < 1) {
                        System.out.println(("\tYou have taken too much damage! " +
                                            "You are too weak to continue the fight!"));
                        break;
                    }
                    if (enemy.getEnemyHealth() < 1) {
                        System.out.println(("\n\tYou have defeated the " + enemyType + "!"));
                    }
                } else if (input.equals("2")) {
                    if (playerHealthPotions > 0) {
                        if (playerHealth + playerHealthPotions <= playerMaxHealth) {
                            playerHealth += playerHealPotionAmt;
                        } else {
                            playerHealth = playerMaxHealth;
                        }
                        playerHealthPotions -= 1;
                        System.out.println("\tYou drink a Health Potion which heals you for " + playerHealPotionAmt
                                            + " Health Points.\n\tYou now have " + playerHealth + " Health Points."
                                            + "\n\tYou have " + playerHealthPotions + " Health Potions left.");
                    } else {
                        System.out.println("\tSorry, you don't have any health potions left!" +
                                           "\nD\tefeat more enemies for a chance to get more health potions.");
                    }

                } else if (input.equals("3")) {
                    playerHealth = playerMaxHealth;
                    playerHealthPotions = playerInitHealthPotions;
                    level = 0;
                    cycle = 0;
                    System.out.println("\tYou return to the top level of the mine." +
                            "\n\tYour Health Points and Healing Potions are restored." +
                            "\n\tYou have " + playerHealth + " Health Points." +
                            "\n\tYou have " + playerHealthPotions + " Healing Potions.");
                    break;
                } else if (input.equals("4")) {
                    System.out.println("\tNow leaving the Mines of Forsyth...");
                    System.out.println("\n*************************************");
                    gameRunning = false;
                    break;
                } else {
                    System.out.println("\tSorry, invalid selection, try again.");
                }
                System.out.println("\n\t*************************************");
            }
            if (cycle < 10) {
                cycle++;
            } else {
                cycle = 1;
            }
            level++;
            if (playerHealth < 1) {
                System.out.println("\tYou have been defeated by the " + enemyType + "!");
                System.out.println("\tNow leaving the Mines of Forsyth...");
                System.out.println("\n*************************************");
                gameRunning = false;
                break;
            }
            if (playerHealth < 75) {
                System.out.println("\tWARNING: Your Health Points are too low, you must return to " +
                        "the top level of the mine immediately!" +
                        "\tYou return to the top level of the mine." +
                        "\n\tYour Health Points and Healing Potions are restored." +
                        "\n\tYou have " + playerHealth + " Health Points." +
                        "\n\tYou have " + playerHealthPotions + " Healing Potions.");
                level = 1;
                cycle = 1;
            }
        }
    }
}