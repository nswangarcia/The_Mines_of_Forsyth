package playerD;

import playerDecorator.PlayerDecorator;

public class HumanPlayer extends PlayerDecorator {

    public HumanPlayer(Player player) {
        super(player);
    }

    @Override
    public void createPlayer(){
        super.createPlayer();
        System.out.print(" Adding features of Human Player.");
    }
}
