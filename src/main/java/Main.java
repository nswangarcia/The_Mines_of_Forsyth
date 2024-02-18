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
        run();
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
        int enemyMaxSpeed = 100;
        int enemyMinSpeed = 1;
        String enemyType;
        Enemy enemy;

        // Player setup
        int playerHealth = 250; // initial player health
        int playerInitHealth = playerHealth;
        int playerMaxHealth = 600;
        int playerMinAttackDamage = 1;
        int playerMaxAttackDamage = 100;
        int playerAttackDamage = 100;
        int playerMinDefense = 1;
        int playerMaxDefense = 100;
        int playerDefense = 10;
        int playerHealthPotions = 5;
        int playerInitHealthPotions = 5;
        int playerHealPotionAmt = 75;
        int healthPotionDrop = 50; // Percentage or health potion dropped when defeating an enemey.
        String[] playerItems = {null, null, null};
        String[] playerClass = { "Monster", "Assassin", "Barbarian", "Warrior", "Wizard" };


        int playerSpeed = 75;
        int playerGems = 50;
        // gems
        int loseGems = 20;
        int findChestOdds = 10;
        int maxFindGems = 100;
        int minFindGems = 1;
        // shop
        int shopOdds = 10;


        boolean gameRunning = true;
        boolean choosePlayer = true;
        while (choosePlayer) {
            System.out.println("\tChoose your player: ");
            System.out.println("\t1: Human");
            System.out.println("\t1: Dwarf");
            System.out.println("\t1: Elf");
            System.out.println("\t1: Orc");
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
        RUN:
        while (gameRunning) {
            System.out.println("\n*********************************************");
            System.out.println("\tEntering level " + level + " of the mines...");
            System.out.println("*********************************************\n");
            if (cycle < 5) { // small enemy
                enemyHealth = rand.nextInt(enemyMinHealth[0],enemyMaxHealth[0]);
                enemyType = smallEnemies[rand.nextInt(smallEnemies.length)];
                enemy = EnemyFactory.getEnemy(enemyType, enemyHealth, enemyMaxHealth[0],
                        enemyMaxDamageDealt[0], enemyMinHealth[0], enemyMinDamageDealt[0], rand.nextInt(enemyMinSpeed,enemyMaxSpeed));
            } else if (cycle < 10) { // medium enemy
                enemyHealth = rand.nextInt(enemyMinHealth[1],enemyMaxHealth[1]);
                enemyType = smallEnemies[rand.nextInt(smallEnemies.length)];
                enemy = EnemyFactory.getEnemy(enemyType, enemyHealth, enemyMaxHealth[1],
                        enemyMaxDamageDealt[1], enemyMinHealth[1], enemyMinDamageDealt[1], rand.nextInt(enemyMinSpeed,enemyMaxSpeed));
            } else { // boss enemy
                System.out.println("\n\tBoss level!\n");
                enemyHealth = rand.nextInt(enemyMinHealth[2],enemyMaxHealth[2]);
                enemyType = smallEnemies[rand.nextInt(smallEnemies.length)];
                enemy = EnemyFactory.getEnemy(enemyType, enemyHealth, enemyMaxHealth[2],
                        enemyMaxDamageDealt[2], enemyMinHealth[2], enemyMinDamageDealt[2], rand.nextInt(enemyMinSpeed,enemyMaxSpeed));
            }

            System.out.println("\t*** Oh no! A " + enemyType + " has appeared! ***\n");

            // game combat
            while (enemy.getEnemyHealth() > 0) {
                System.out.println("\tYour Health Points: " + playerHealth);
                System.out.println("\tYour Speed: " + playerSpeed);
                System.out.println("\t" + enemyType + "'s Health Points: " + enemy.getEnemyHealth());
                System.out.println("\t" + enemyType + "'s Speed: " + enemy.getEnemySpeed());
                System.out.println("\n\tWhat are you going to do?");
                System.out.println("\t 1: Attack");
                System.out.println("\t 2: Drink Health Potion");
                System.out.println("\t 3: Run Away");
                System.out.println("\t 4: Exit the mines");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int playerDamageDealt = rand.nextInt(playerAttackDamage);
                    int playerDamageTaken = 0;
                    playerDamageTaken = rand.nextInt(enemy.getEnemyMinDamageDealt(),enemy.getEnemyMaxDamageDealt());

                    enemy.setEnemyHealth((enemy.getEnemyHealth()) - playerDamageDealt);
                    playerHealth -= playerDamageTaken;

                    if (enemy.getEnemySpeed() > playerSpeed) {
                        System.out.println("\tThe " + enemyType + " is faster than you! They get an attack in before you can!");
                        System.out.println("\tYou take " + playerDamageTaken + " damage from the " + enemyType + "'s attack!");
                        System.out.println("\tYou attack the " + enemyType + " for " + playerDamageDealt + " damage");
                    } else {
                        System.out.println("\tYou attack the " + enemyType + " for " + playerDamageDealt + " damage");
                        System.out.println("\tYou take " + playerDamageTaken + " damage from the " + enemyType + "'s attack!");
                    }

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
                                           "\n\tDefeat more enemies for a chance to get more health potions.");
                    }

                } else if (input.equals("3")) {
                    playerHealth = playerInitHealth;
                    playerHealthPotions = playerInitHealthPotions;
                    level = 1;
                    cycle = 1;
                    System.out.println("\tYou return to the top level of the mine." +
                            "\n\tYour Health Points and Healing Potions are restored." +
                            "\n\tYou have " + playerHealth + " Health Points." +
                            "\n\tYou have " + playerHealthPotions + " Healing Potions.");
                    continue RUN;
                } else if (input.equals("4")) {
                    gameRunning = false;
                    continue RUN;
                } else {
                    System.out.println("\tSorry, invalid selection, try again.");
                }
            }
            if (cycle < 10) {
                cycle++;
            } else {
                cycle = 1;
            }
            level++;
            // player has been defeated by an enemy
            if (playerHealth < 1) {
                System.out.println("\tYou have been defeated by the " + enemyType +
                        "!\n\tYou stagger back to the top level of the mines." +
                        "\n\tYour battle wounds are severe...");
                playerHealth = playerInitHealth;
                playerHealthPotions = playerInitHealthPotions;
                level = 1;
                cycle = 1;
                playerGems -= loseGems;
                continue RUN;
            }
            // end of level
            System.out.println("\tYou have " + playerHealth + " Health Points left.");
            System.out.println("*********************************************");

            // HEALTH POTION DROP: generate health potion drops after battles
            if (rand.nextInt(100) > healthPotionDrop) {
                playerHealthPotions++;
                System.out.println("\tThe " + enemyType + " dropped a Health Potion!\n\tYou now have "
                        + playerHealthPotions + " Health Potions!");
                System.out.println("*********************************************");
            }
            // CHEST: generate found chest after battle
            // generate health potion drops after battles
            if (rand.nextInt(100) > findChestOdds) {
                playerHealthPotions++;
                int foundGems = rand.nextInt(minFindGems,maxFindGems);
                // TODO: update armor
                System.out.println("\tOh look! There is a treasure chest in the corner!" +
                        "\n\tYou open the chest and find a Health Potion, "
                        + rand.nextInt(minFindGems,maxFindGems) + " Gems, and armor!");
                playerHealthPotions++;
                playerGems += foundGems;
                System.out.println("\tYou now have " + playerHealthPotions + " Health Potions and " + playerGems + " Gems!");
                System.out.println("*********************************************");
            }

            // NEXT MOVE: prompt player for next move
            System.out.println("\n\tWhat would you like to do now?");
            System.out.println("\t1: Continue deeper into the mines");
            System.out.println("\t2: Drink a Health Potion");
            System.out.println("\t3: Exit the mines");
            String input = in.nextLine();
            while (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
                System.out.println("Sorry, invalid choice, please try again!");
                input = in.nextLine();
            }
            if (input.equals("1")) {
                System.out.println("\tYou continue deeper into the mines.");
            } else if (input.equals("2")) {
                if (playerHealthPotions > 0) {
                    System.out.println("\tYou drink a Health Potion." +
                            "\n\tYou now have " + playerHealth + " Health Points." +
                            "\n\tYou have " + playerHealthPotions + " Health Potions left.");
                } else {
                    System.out.println("\tSorry, you do not have any Health Potions left!");
                }
            } else if (input.equals("3")) {
                System.out.println(("\tYou complete your time in the mines."));
                gameRunning = false;
                break;
            }

            // LOW HEALTH: player health is too low to continue
            if (playerHealth < 75) {
                System.out.println("\tWARNING: Your Health Points are too low, you must return to " +
                        "the top level of the mine immediately!" +
                        "\tYou return to the top level of the mine." +
                        "\n\tYour Health Points and Healing Potions are restored." +
                        "\n\tYou have " + playerHealth + " Health Points." +
                        "\n\tYou have " + playerHealthPotions + " Healing Potions.");
                playerHealth = playerInitHealth;
                playerHealthPotions = playerInitHealthPotions;
                level = 1;
                cycle = 1;
            }
        }
        System.out.println("\n\tNow leaving the Mines of Forsyth...\n\tThanks for playing!");
        System.out.println("\n*********************************************");
    }
}