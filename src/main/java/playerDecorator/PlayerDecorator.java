package playerDecorator;

import playerD.Player;

public class PlayerDecorator implements Player {

    Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public void createPlayer() {
        this.player.createPlayer();
    }
}
