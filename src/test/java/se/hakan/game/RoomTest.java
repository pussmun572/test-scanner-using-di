package se.hakan.game;

import org.junit.jupiter.api.Test;
import se.hakan.game.model.Player;

class RoomTest {

    @Test
    void testEnterMethod() {
        TestInputHandler testInputHandler = new TestInputHandler();
        Room room = new Room(testInputHandler);
        Player player = new Player();
        room.enter(player);

        //assert something..


    }
}