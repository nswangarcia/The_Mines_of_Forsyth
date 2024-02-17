package player;

public class Player {
    public enum PlayerClass
    {
        MONSTER
                {
                    @Override
                    public void attack(Player from, Player target)
                    {
                        //Do something here
                    }
                },
        ASSASSIN
                {
                    @Override
                    public void attack(Player from, Player target)
                    {
                        //Do something here
                    }
                },
        BARBARIAN
                {
                    @Override
                    public void attack(Player from, Player target)
                    {
                        //Do something here
                    }
                },
        WARRIOR
                {
                    @Override
                    public void attack(Player from, Player target)
                    {
                        //Do something here
                    }
                },
        WIZARD
                {
                    @Override
                    public void attack(Player from, Player target)
                    {
                        //Do something here
                    }
                };

        public void attack(Player from, Player target)
        {
            //Default attack implementation
        }
    }

    public enum PlayerRace
    {
        HUMAN, ELF, DWARF, ORC;
    }

    private PlayerClass playerClass;
    private PlayerRace race;

    public Player(PlayerClass playerClass, PlayerRace race)
    {
        this.playerClass = playerClass;
        this.race = race;
    }

    public void attack(Player target)
    {
        playerClass.attack(this, target);
    }
    //Some more methods
}