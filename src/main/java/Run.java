

import decorator.Character;
import decorator.BaseCharacter;
import decorator.CharacterDecorator;
import decorator.characterClass.Brawler;
import decorator.characterClass.Miner;
import decorator.characterClass.Warrior;
import decorator.characterClass.Wizard;

import decorator.characterType.Dwarf;
import decorator.characterType.Elf;
import decorator.characterType.Human;
import decorator.characterType.Orc;

import enemies.Enemy;
import factory.EnemyFactory;

import java.util.Random;
import java.util.Scanner;

public class Run {

    private Enemy enemy;
    private Character character = new BaseCharacter();
    private int level;
    private int cycle;

    public Run() {

    }
    public void run() {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        level = 1;
        cycle = 1;
        int choice = 4;

        // Enemy setup
        String[] smallEnemies = {"Crazed Dwarf", "Goblin", "Rockling"};
        String[] mediumEnemies = {"Cave Troll", "Orc", "Zombie"};
        String[] bossEnemies = { "Bat King", "Dark Wizard", "Shadow Monster"};
        String finalBossEnemy = "Dragon King";
        int[] enemyMaxHealth = {25, 75, 150, 800};
        int[] enemyMaxDamageDealt = {15, 25, 50, 100};
        int[] enemyMinHealth = {1, 25, 75, 300};
        int[] enemyMinDamageDealt = {1, 5, 10, 15};
        int enemyMaxSpeed = 100;
        int enemyMinSpeed = 1;
        String enemyType = "";

        int healthPotionDrop = 15; // Percentage or health potion dropped when defeating an enemey.

        // Character setup
        String[] characterItems = {null, null, null};
        String[] characterClass = { "Miner", "Brawler", "Warrior", "Wizard" };

        // gems
        int loseGems = 20;
        int findChestOdds = 5;
        int maxFindGems = 100;
        int minFindGems = 1;

        // shop
        int shopOdds = 10;

        boolean gameRunning = true;
        boolean chooseCharacter = true;
        // select and generate character.
        // character class
        character = chooseCharacterClass(character, chooseCharacter, choice, rand);
        wait(500);
        // character type
        character = chooseCharacterType(character, chooseCharacter, choice, rand);
        wait(500);

        choice = 3;
        //TODO: put in another method?
        // run game
        RUN:
        while (gameRunning) {
            System.out.println("\n*****************************************************************");
            System.out.println("\t\tEntering level " + level + " of the mines...");
            System.out.println("*****************************************************************\n");
            wait(500);
            // generate enemy
            if (cycle < 5) { // small enemy
                createEnemy(rand.nextInt(enemyMinHealth[0],enemyMaxHealth[0]),
                            smallEnemies[rand.nextInt(smallEnemies.length)], enemyMaxHealth[0],
                            enemyMaxDamageDealt[0], enemyMinHealth[0], enemyMinDamageDealt[0],
                            rand.nextInt(enemyMinSpeed, enemyMaxSpeed));
            } else if (cycle < 10) { // medium enemy
                createEnemy(rand.nextInt(enemyMinHealth[1],enemyMaxHealth[1]),
                        mediumEnemies[rand.nextInt(mediumEnemies.length)], enemyMaxHealth[1],
                        enemyMaxDamageDealt[1], enemyMinHealth[1], enemyMinDamageDealt[1],
                        rand.nextInt(enemyMinSpeed, enemyMaxSpeed));
            } else if (level == 50) { // final boss enemy
                System.out.println("\n\tFinal Boss Level!\n\tYou have reached the end of the Mines!\n");
                createEnemy(rand.nextInt(enemyMinHealth[3],enemyMaxHealth[3]),
                        finalBossEnemy, enemyMaxHealth[3], enemyMaxDamageDealt[3],
                        enemyMinHealth[3], enemyMinDamageDealt[3],
                        rand.nextInt(enemyMinSpeed, enemyMaxSpeed));
            } else { // boss enemy
                System.out.println("\t\tBoss Level!" +
                        "\n*****************************************************************");
                createEnemy(rand.nextInt(enemyMinHealth[2],enemyMaxHealth[2]),
                        bossEnemies[rand.nextInt(bossEnemies.length)], enemyMaxHealth[2],
                        enemyMaxDamageDealt[2], enemyMinHealth[2], enemyMinDamageDealt[2],
                        rand.nextInt(enemyMinSpeed, enemyMaxSpeed));
            }
            enemyType = enemy.getEnemyType();
            System.out.println("\t*** Oh no! A " + enemyType + " has appeared! ***\n");
            wait(200);

            // game combat
            while (enemy.getEnemyHealth() > 0) {
                System.out.println("\tYour Health Points: " + character.getCharacterHealth());
                wait(50);
                System.out.println("\tYour Speed: " + character.getCharacterSpeed());
                wait(50);
                System.out.println("\t" + enemyType + "'s Health Points: " + enemy.getEnemyHealth());
                wait(50);
                System.out.println("\t" + enemyType + "'s Speed: " + enemy.getEnemySpeed());
                wait(50);
                System.out.println("\n\tWhat are you going to do?");
                System.out.println("\t 1: Attack");
                System.out.println("\t 2: Drink Health Potion");
                System.out.println("\t 3: Run Away");
                System.out.println("\t 4: Exit the mines");
                wait(50);
                String input = String.valueOf(rand.nextInt(1, choice));
                System.out.println("" + input);
                if (input.equals("1")) {
                    gameRunning = attack(enemyType, rand, level, gameRunning);
                    if (character.getCharacterHealth() < 1 && gameRunning) {
                        backToTop();
                        continue RUN;
                    } else if (!gameRunning) {
                        continue RUN;
                    }
                } else if (input.equals("2")) {
                    useHealthPotion();
                } else if (input.equals("3")) {
                    System.out.println("\tYou ran away from the enemy back to the top of the mine!");
                    backToTop();
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
            // character has been defeated by an enemy
            if (character.getCharacterHealth() < 1) {
                if (level == 50) {
                    System.out.println("\n\tOh no! You have fallen to the ground in defeat..." +
                            "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" +
                            "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" +
                            "\n\tSO SORRY! " +
                            "\n\tYou have been defeated by the Final Boss: The " + enemyType + "!" +
                            "\n\tYou lost the game!" +
                            "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" +
                            "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    gameRunning = false;
                    continue RUN;
                } else {
                    System.out.println("\tYou have been defeated by the " + enemyType +
                            "!\n\tYou stagger back to the top level of the mines." +
                            "\n\tYour battle wounds are severe...");
                    wait(50);
                    backToTop();
                    continue RUN;
                }
            }
            // end of level
            System.out.println("\tYou have " + character.getCharacterHealth() + " Health Points left.");
            System.out.println("*****************************************************************");

            // HEALTH POTION DROP: generate health potion drops after battles
            if (rand.nextInt(100) > healthPotionDrop) {
                character.setCharacterHealthPotions(character.getCharacterHealthPotions() + 1);
                System.out.println("\tThe " + enemyType + " dropped a Health Potion!\n\tYou now have "
                        + character.getCharacterHealthPotions() + " Health Potions!");
                System.out.println("*****************************************************************");
                wait(50);
            }
            // CHEST: generate found chest after battle
            // generate health potion drops after battles
            if (rand.nextInt(100) > findChestOdds) {
                int foundGems = rand.nextInt(minFindGems,maxFindGems);
                // TODO: update armor
                System.out.println("\tOh look! There is a treasure chest in the corner!" +
                        "\n\tYou open the chest and find a Health Potion, "
                        + rand.nextInt(minFindGems,maxFindGems) + " Gems, and armor!");
                wait(50);
                character.setCharacterHealthPotions(character.getCharacterHealthPotions() + 1);
                character.setCharacterGems(character.getCharacterGems() + foundGems);
                System.out.println("\tYou now have " + character.getCharacterHealthPotions() +
                        " Health Potions and " + character.getCharacterGems() + " Gems!");
                System.out.println("*****************************************************************");
                wait(50);
            }

            // NEXT MOVE: prompt character for next move
            System.out.println("\n\tWhat would you like to do now?");
            System.out.println("\t1: Continue deeper into the mines");
            System.out.println("\t2: Drink a Health Potion");
            System.out.println("\t3: Exit the mines");
            wait(50);
            String input = String.valueOf(rand.nextInt(1, choice));
            System.out.println("" + input);
            while (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
                System.out.println("Sorry, invalid choice, please try again!");
                input = String.valueOf(rand.nextInt(1, choice));
                System.out.println("" + input);
                wait(50);
            }
            if (input.equals("1")) {
                System.out.println("\tYou continue deeper into the mines.");
                wait(50);
            } else if (input.equals("2")) {
                useHealthPotion();
            } else if (input.equals("3")) {
                System.out.println(("\tYou complete your time in the mines."));
                wait(50);
                gameRunning = false;
                break;
            }

            // LOW HEALTH: character health is too low to continue
            if (character.getCharacterHealth() < 75) {
                System.out.println("\tWARNING: Your Health Points are too low, you must return to " +
                        "the top level of the mines immediately!");
                backToTop();;
            }
        }
        wait(50);
        System.out.println("\n\tNow leaving the Mines of Forsyth...\n\tThanks for playing!");
        System.out.println("\n*****************************************************************");
        wait(50);
    }

    /**
     * Choose and create Character Class.
     * @param character Character
     * @param chooseCharacter boolean
     * @param choice int
     * @param rand Random
     * @return Character
     */
    public Character chooseCharacterClass(Character character, boolean chooseCharacter, int choice, Random rand) {
        while (chooseCharacter) {
            System.out.println("\tChoose your character class: ");
            System.out.println("\t1: Brawler");
            System.out.println("\t2: Miner");
            System.out.println("\t3: Warrior");
            System.out.println("\t4: Wizard");
            String input = String.valueOf(rand.nextInt(1, choice));
            System.out.println("" + input);
            if (input.equals("1")) { // Brawler
                System.out.println("\tCreating Brawler character class...");
                character = new Brawler(character);
                character.create();
                chooseCharacter = false;
            } else if (input.equals("2")) { // Miner
                System.out.println("\tCreating Miner character class...");
                character = new Miner(character);
                chooseCharacter = false;
            } else if (input.equals("3")) { // Warrior
                System.out.println("\tCreating Warrior character class...");
                character = new Warrior(character);
                chooseCharacter = false;
            } else if (input.equals("4")) { // Wizard
                System.out.println("\tCreating Wizard character class...");
                character = new Wizard(character);
                chooseCharacter = false;
            } else {
                System.out.println("\tSorry, invalid selection, try again.");
            }
            System.out.println("\nCharacter class: " + character.getCharacterClass());
        }
        return character;
    }

    /**
     * Choose and create Character type.
     * @param character Character
     * @param chooseCharacter boolean
     * @param choice int
     * @param rand Random
     * @return Character
     */
    public Character chooseCharacterType(Character character, boolean chooseCharacter, int choice, Random rand) {
        // select and generate character characteristics
        while (chooseCharacter) {
            System.out.println("\tChoose your character type: ");
            System.out.println("\t1: Dwarf");
            System.out.println("\t2: Elf");
            System.out.println("\t3: Human");
            System.out.println("\t4: Orc");
            String input = String.valueOf(rand.nextInt(1, choice));
            System.out.println("" + input);
            if (input.equals("1")) { // Human
                System.out.println("\tCreating Human character...");
                chooseCharacter = false;
            } else if (input.equals("2")) { // Dwarf
                System.out.println("\tCreating Dwarf character...");
                chooseCharacter = false;
            } else if (input.equals("3")) { // Elf
                System.out.println("\tCreating Elf character...");
                chooseCharacter = false;
            } else if (input.equals("4")) { // Orc
                System.out.println("\tCreating Orc character...");
                chooseCharacter = false;
            } else {
                System.out.println("\tSorry, invalid selection, try again.");
            }
        }
        System.out.println("\tCharacter type: " + character.getCharacterType());
        return character;
    }

    /**
     * Generate enemy.
     * @param enemyHealth int
     * @param enemyType String
     * @param enemyMaxHealth int
     * @param enemyMaxDamageDealt int
     * @param enemyMinHealth int
     * @param enemyMinDamageDealt int
     * @param enemySpeed int
     */
    public void createEnemy(int enemyHealth, String enemyType, int enemyMaxHealth,
                            int enemyMaxDamageDealt, int enemyMinHealth,
                            int enemyMinDamageDealt, int enemySpeed) {

        this.enemy = EnemyFactory.getEnemy(enemyType, enemyHealth, enemyMaxHealth,
                enemyMaxDamageDealt, enemyMinHealth, enemyMinDamageDealt, enemySpeed);
    }

    /**
     * Use health potion.
     */
    public void useHealthPotion() {
        if (character.getCharacterHealthPotions() > 0) {
            if (character.getCharacterHealth() + character.getCharacterHealthPotions()
                    <= character.getCharacterMaxHealth()) {
                character.setCharacterHealth(character.getCharacterHealth() +
                        character.getCharacterHealthPotionHealAmt());
            } else {
                character.setCharacterHealth(character.getCharacterMaxHealth());
            }
            character.setCharacterHealthPotions(character.getCharacterHealthPotions() - 1);
            System.out.println("\tYou drink a Health Potion which heals you for " +
                    character.getCharacterHealthPotionHealAmt() + " Health Points.\n\tYou now have " +
                    character.getCharacterClass() + " Health Points." + "\n\tYou have " +
                    character.getCharacterHealthPotions() + " Health Potions left.");
            wait(50);
        } else {
            System.out.println("\tSorry, you don't have any health potions left!" +
                    "\n\tDefeat more enemies for a chance to get more health potions.");
            wait(50);
        }
    }

    public boolean attack(String enemyType, Random rand, int level, boolean gameRunning) {
        int characterDamageDealt = rand.nextInt(character.getCharacterAttackDamage());
        int characterDamageTaken = 0;
        characterDamageTaken = rand.nextInt(enemy.getEnemyMinDamageDealt(),enemy.getEnemyMaxDamageDealt());

        enemy.setEnemyHealth((enemy.getEnemyHealth()) - characterDamageDealt);
        character.setCharacterHealth(character.getCharacterHealth() - characterDamageTaken);
        wait(50);
        if (enemy.getEnemySpeed() > character.getCharacterSpeed()) {
            System.out.println("\tThe " + enemyType + " is faster than you! They get an attack in before you can!");
            System.out.println("\tYou take " + characterDamageTaken + " damage from the " + enemyType + "'s attack!");
            System.out.println("\tYou attack the " + enemyType + " for " + characterDamageDealt + " damage");
        } else {
            System.out.println("\tYou attack the " + enemyType + " for " + characterDamageDealt + " damage");
            System.out.println("\tYou take " + characterDamageTaken + " damage from the " + enemyType + "'s attack!");
        }
        wait(50);
        if (character.getCharacterHealth() < 1) {
            System.out.println(("\tYou have taken too much damage! " +
                    "You are too weak to continue the fight!"));
            return gameRunning;
        }
        wait(50);
        if (enemy.getEnemyHealth() < 1) {
            if (level == 50) {
                System.out.println("\n\tThe " + enemyType + " falls to the ground in defeat..." +
                        "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" +
                        "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" +
                        "\n\tCONGRATULATIONS! " +
                        "\n\tYou have defeated the Final Boss: The " + enemyType + "!" +
                        "\n\tYou win the game!" +
                        "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" +
                        "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                wait(50);
                gameRunning = false;
                return gameRunning;
            } else {
                System.out.println(("\n\tYou have defeated the " + enemyType + "!"));
            }
        }
        return gameRunning;
    }

    /**
     * Reset to top of mine.
     */
    public void backToTop() {
        character.setCharacterHealth(character.getCharacterInitHealth());
        character.setCharacterHealthPotions(character.getCharacterInitHealthPotions());
        level = 1;
        cycle = 1;
        System.out.println("\tYou return to the top level of the mine." +
                "\n\tYour Health Points and Healing Potions are restored." +
                "\n\tYou have " + character.getCharacterHealth() + " Health Points." +
                "\n\tYou have " + character.getCharacterHealthPotions() + " Healing Potions.");
        wait(50);
    }

    /**
     * Wait timer.
     * @param ms int milliseconds
     */
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
