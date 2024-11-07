package se.hakan.game;

import se.hakan.game.model.Player;

import java.util.Scanner;

public class Game {
    private InputHandlerInterface inputHandler;
    private Room kitchen;
    static String currentLocation = GameConstants.START;

    public Game(InputHandlerInterface inputHandler) {
        this.inputHandler = inputHandler;
        kitchen = new Room(inputHandler);
    }

    public void start(){
        Player player = new Player();
        //kitchen.enter(player);
        int input = Integer.parseInt(getInput());
        boolean input2 = Boolean.parseBoolean(getInput());
       // scanner.nextLine();
    }

    public String getInput(){
       return inputHandler.getInput();
    }
}
