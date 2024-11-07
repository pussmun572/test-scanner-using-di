package se.hakan.game;

import java.util.Scanner;

public class InputHandler implements InputHandlerInterface{
    private Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }


    //    public InputHandler(Scanner scanner) {
//        this.scanner = scanner;
//    }
    @Override
    public String getInput(){
        return scanner.nextLine();
    }

    @Override
    public int getInputFromInt() {
        return scanner.nextInt();
    }
}
