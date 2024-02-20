package decorator;

public class BaseCharacter implements Character {

    private String characterType = "";
    private String characterClass = "";
    private int characterHealth = 75;
    private int characterInitHealth = characterHealth;
    private int characterMinHealth = 50;
    private int characterMaxHealth = 1000;
    private int characterAttackDamage = 100;
    private int characterDefense = 50;
    private int characterSpeed = 50;
    private int characterGems = 50;
    private int characterMinFindGems = 1;
    private int characterMaxFindGems = 100;
    private int characterHealthPotions = 5;
    private int characterInitHealthPotions = 5;
    private int characterHealthPotionHealAmt = 75;

    @Override
    public void create(){
        System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    // GETTERS
    @Override
    public String getCharacterType() {
        return this.characterType;
    }

    @Override
    public String getCharacterClass() {
        return this.characterClass;
    }
    @Override

    public int getCharacterHealth() {
        return this.characterHealth;
    }

    @Override
    public int getCharacterInitHealth() {
        return  this.characterInitHealth;
    }

    @Override
    public int getCharacterMinHealth() {
        return this.characterMinHealth;
    }

    @Override
    public int getCharacterMaxHealth() {
        return this.characterMaxHealth;
    }

    @Override
    public int getCharacterAttackDamage() {
        return this.characterAttackDamage;
    }

    @Override
    public int getCharacterDefense() {
        return this.characterDefense;
    }

    @Override
    public int getCharacterSpeed() {
        return this.characterSpeed;
    }

    @Override
    public int getCharacterGems() {
        return this.characterGems;
    }

    @Override
    public int getCharacterMinFindGems() {
        return this.characterMinFindGems;
    }

    @Override
    public int getCharacterMaxFindGems() {
        return this.characterMaxFindGems;
    }

    @Override
    public int getCharacterHealthPotions() {
        return this.characterHealthPotions;
    }

    @Override
    public int getCharacterInitHealthPotions() {
        return this.characterInitHealthPotions;
    }

    @Override
    public int getCharacterHealthPotionHealAmt() {
        return this.characterHealthPotionHealAmt;
    }

    // SETTERS

    @Override
    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    @Override
    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    @Override
    public void setCharacterHealth(int characterHealth) {
        this.characterHealth = characterHealth;
    }

    @Override
    public void setCharacterInitHealth(int characterInitHealth) {
        this.characterInitHealth = characterInitHealth;
    }

    @Override
    public void setCharacterMinHealth(int characterMinHealth) {
        this.characterMinHealth = characterMinHealth;
    }

    @Override
    public void setCharacterMaxHealth(int characterMaxHealth) {
        this.characterMaxHealth = characterMaxHealth;
    }

    @Override
    public void setCharacterAttackDamage(int characterAttackDamage) {
        this.characterAttackDamage = characterAttackDamage;
    }

    @Override
    public void setCharacterDefense(int characterDefense) {
        this.characterDefense = characterDefense;
    }

    @Override
    public void setCharacterSpeed(int characterSpeed) {
        this.characterSpeed = characterSpeed;
    }

    @Override
    public void setCharacterGems(int characterGems) {
        this.characterGems = characterGems;
    }

    public void setCharacterMinFindGems(int characterMinFindGems) {
        this.characterMinFindGems = characterMinFindGems;
    }

    @Override
    public void setCharacterMaxFindGems(int characterMaxFindGems) {
        this.characterMaxFindGems = characterMaxFindGems;
    }

    @Override
    public void setCharacterHealthPotions(int characterHealthPotions) {
        this.characterHealthPotions = characterHealthPotions;
    }

    @Override
    public void setCharacterInitHealthPotions(int characterInitHealthPotions) {
        this.characterInitHealthPotions = characterInitHealthPotions;
    }

    @Override
    public void setCharacterHealthPotionHealAmt(int characterHealthPotionHealAmt) {
        this.characterHealthPotionHealAmt = characterHealthPotionHealAmt;
    }
}
