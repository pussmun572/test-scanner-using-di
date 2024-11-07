package se.hakan.game;

import se.hakan.game.model.Player;

public class Room {
    private InputHandlerInterface inputHandler;

    public Room(InputHandlerInterface inputHandler) {
        this.inputHandler = inputHandler;
    }


    public void enter(Player player){
        Game.currentLocation = GameConstants.KITCHEN;
        String input = inputHandler.getInput();

    }
}
