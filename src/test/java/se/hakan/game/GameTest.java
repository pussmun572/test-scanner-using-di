package se.hakan.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void start() {
        TestInputHandler testInputHandler = new TestInputHandler();
        Game game = new Game(testInputHandler);

        //run some test on the game class

    }
}