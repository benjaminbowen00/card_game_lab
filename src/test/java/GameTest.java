import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Player player1;
    Player player2;
    Player player3;
    Game game1;


    @Before
    public void before(){
        player1 = new Player("John");
        player2 = new Player("Paul");
        player3 = new Player("George");
        game1 = new Game();
        game1.addPlayer(player1);
        game1.addPlayer(player2);
        game1.addPlayer(player3);
    }

    @Test
    public void canStartGame(){
        game1.startGame();
        game1.getWinner();
        assertEquals(2, player1.hand.sizeOfHand());
    }

//    @Test
//    public void canRunGame(){
//        game1.startGame();
//        assertEquals(player1, game1.getWinner());
//    }
}
