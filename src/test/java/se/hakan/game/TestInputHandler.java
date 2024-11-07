package se.hakan.game;

import java.util.ArrayList;
import java.util.List;

public class TestInputHandler implements InputHandlerInterface{
    private List<String> inputsFromUser = List.of("go north", "go back", "go south");
    private int counter = 0;
    @Override
    public String getInput() {
        int index = counter;
        counter++;
        return inputsFromUser.get(index);
        //return "go north";
    }

    @Override
    public int getInputFromInt() {
        return 0;
    }
}
