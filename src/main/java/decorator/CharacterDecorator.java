package decorator;

public class CharacterDecorator implements Character {

    protected Character character;

    public CharacterDecorator(Character character){
        this.setCharacter(character);
    }

    private Character getCharacter() {
        return this.character;
    }

    private void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public void create() {
        this.character.create();
    }

    // GETTERS
    @Override
    public String getCharacterType() {
        return this.character.getCharacterType();
    }

    @Override
    public String getCharacterClass() {
        return this.character.getCharacterClass();
    }

    @Override

    public int getCharacterHealth() {
        return this.character.getCharacterHealth();
    }

    @Override
    public int getCharacterInitHealth() {
        return  this.character.getCharacterInitHealth();
    }

    @Override
    public int getCharacterMinHealth() {
        return this.character.getCharacterMinHealth();
    }

    @Override
    public int getCharacterMaxHealth() {
        return this.character.getCharacterMaxHealth();
    }

    @Override
    public int getCharacterAttackDamage() {
        return this.character.getCharacterAttackDamage();
    }

    @Override
    public int getCharacterDefense() {
        return this.character.getCharacterDefense();
    }

    @Override
    public int getCharacterSpeed() {
        return this.character.getCharacterSpeed();
    }

    @Override
    public int getCharacterGems() {
        return this.character.getCharacterGems();
    }

    @Override
    public int getCharacterMinFindGems() {
        return this.character.getCharacterMinFindGems();
    }

    @Override
    public int getCharacterMaxFindGems() {
        return this.character.getCharacterMaxFindGems();
    }

    @Override
    public int getCharacterHealthPotions() {
        return this.character.getCharacterHealthPotions();
    }

    @Override
    public int getCharacterInitHealthPotions() {
        return this.character.getCharacterInitHealthPotions();
    }

    @Override
    public int getCharacterHealthPotionHealAmt() {
        return this.character.getCharacterHealthPotionHealAmt();
    }

    // SETTERS

    @Override
    public void setCharacterType(String characterType) {
        this.character.setCharacterType(characterType);
    }

    @Override
    public void setCharacterClass(String characterClass) {
        this.character.setCharacterClass(characterClass);
    }

    @Override
    public void setCharacterHealth(int characterHealth) {
        this.character.setCharacterHealth(characterHealth);
    }

    @Override
    public void setCharacterInitHealth(int characterInitHealth) {
        this.character.setCharacterInitHealth(characterInitHealth);
    }

    @Override
    public void setCharacterMinHealth(int characterMinHealth) {
        this.character.setCharacterMinHealth(characterMinHealth);
    }

    @Override
    public void setCharacterMaxHealth(int characterMaxHealth) {
        this.character.setCharacterMaxHealth(characterMaxHealth);
    }

    @Override
    public void setCharacterAttackDamage(int characterAttackDamage) {
        this.character.setCharacterAttackDamage(characterAttackDamage);
    }

    @Override
    public void setCharacterDefense(int characterDefense) {
        this.character.setCharacterDefense(characterDefense);
    }

    @Override
    public void setCharacterSpeed(int characterSpeed) {
        this.character.setCharacterSpeed(characterSpeed);
    }

    @Override
    public void setCharacterGems(int characterGems) {
        this.character.setCharacterGems(characterGems);
    }

    public void setCharacterMinFindGems(int characterMinFindGems) {
        this.character.setCharacterMinFindGems(characterMinFindGems);
    }

    @Override
    public void setCharacterMaxFindGems(int characterMaxFindGems) {
        this.character.setCharacterMaxFindGems(characterMaxFindGems);
    }

    @Override
    public void setCharacterHealthPotions(int characterHealthPotions) {
        this.character.setCharacterHealthPotions(characterHealthPotions);
    }

    @Override
    public void setCharacterInitHealthPotions(int characterInitHealthPotions) {
        this.character.setCharacterInitHealthPotions(characterInitHealthPotions);
    }

    @Override
    public void setCharacterHealthPotionHealAmt(int characterHealthPotionHealAmt) {
        this.character.setCharacterHealthPotionHealAmt(characterHealthPotionHealAmt);
    }
}
