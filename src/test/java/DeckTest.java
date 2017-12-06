import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck1;
    Deck deck2;

    @Before
    public void before() {
        deck1 = new Deck();
        deck2 = new Deck();
    }

    @Test
    public void deckIsFull(){
        assertEquals(52, deck1.size());
    }

    @Test
    public void deckIsDifferentAfterShuffle(){
        assertEquals(deck1.getAllCards().get(0).getValue(), deck2.getAllCards().get(0).getValue());
        deck1.shuffle();
        assertNotEquals(deck1.getAllCards().get(0).getValue(), deck2.getAllCards().get(0).getValue());
    }
}
