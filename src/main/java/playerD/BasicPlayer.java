package playerD;

public class BasicPlayer implements Player {

    // Player setup
    private int playerHealth = 250; // initial player health
    private int playerInitHealth = playerHealth;
    private int playerMaxHealth = 600;
    private int playerMinAttackDamage = 1;
    private int playerMaxAttackDamage = 100;
    private int playerAttackDamage = 100;
    private int playerMinDefense = 1;
    private int playerMaxDefense = 100;
    private int playerDefense = 10;
    private int playerHealthPotions = 5;
    private int playerInitHealthPotions = 5;
    String[] playerItems = {null, null, null};
    String[] playerClass = { "Monster", "Peasant", "Archer", "Assassin", "Barbarian", "Warrior",
            "Monk", "Scout", "Warrior", "Bard", "Druid", "Healer", "Wizard" };
    @Override
    public void createPlayer() {
        System.out.print("Basic Player.");
    }
}