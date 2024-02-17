package playerD;

import playerDecorator.PlayerDecorator;

public class OrcPlayer extends PlayerDecorator {

    public OrcPlayer(Player player) {
        super(player);
    }

    @Override
    public void createPlayer(){
        super.createPlayer();
        System.out.print(" Adding features of Orc Player.");
    }
}
