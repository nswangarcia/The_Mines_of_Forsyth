package playerD;

import playerDecorator.PlayerDecorator;

public class ElfPlayer extends PlayerDecorator {
    public ElfPlayer(Player player) {
        super(player);
    }

    @Override
    public void createPlayer(){
        super.createPlayer();
        System.out.print(" Adding features of Elf Player.");
    }
}
