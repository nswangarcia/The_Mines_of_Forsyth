package playerD;

import playerDecorator.PlayerDecorator;

public class DwarfPlayer extends PlayerDecorator {
    public DwarfPlayer(Player player) {
        super(player);
    }

    @Override
    public void createPlayer(){
        super.createPlayer();
        System.out.print(" Adding features of Dwarf Player.");
    }
}
