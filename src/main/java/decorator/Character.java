package decorator;

public interface Character {
    public void create();

    // GETTERS
    public String getCharacterType();

    public String getCharacterClass();

    public int getCharacterHealth();

    public int getCharacterInitHealth();

    public int getCharacterMinHealth();

    public int getCharacterMaxHealth();

    public int getCharacterAttackDamage();

    public int getCharacterDefense();

    public int getCharacterSpeed();

    public int getCharacterGems();

    public int getCharacterMinFindGems();

    public int getCharacterMaxFindGems();

    public int getCharacterHealthPotions();
    public int getCharacterInitHealthPotions();

    public int getCharacterHealthPotionHealAmt();

    // SETTERS

    public void setCharacterType(String characterType);

    public void setCharacterClass(String characterClass);

    public void setCharacterHealth(int characterHealth);

    public void setCharacterInitHealth(int characterInitHealth);

    public void setCharacterMinHealth(int characterMinHealth);

    public void setCharacterMaxHealth(int characterMaxHealth);

    public void setCharacterAttackDamage(int characterAttackDamage);

    public void setCharacterDefense(int characterDefense);

    public void setCharacterSpeed(int characterSpeed);

    public void setCharacterGems(int characterGems);

    public void setCharacterMinFindGems(int characterMinFindGems);

    public void setCharacterMaxFindGems(int characterMaxFindGems);

    public void setCharacterHealthPotions(int characterHealthPotions);

    public void setCharacterInitHealthPotions(int characterInitHealthPotions);

    public void setCharacterHealthPotionHealAmt(int characterHealthPotionHealAmt);
}
