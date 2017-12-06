import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck1;
    Deck deck2;
    Hand hand1;
    Card card1;
    Card card2;

    @Before
    public void before() {
        deck1 = new Deck();
        deck2 = new Deck();
        card1 = new Card(SuitType.DIAMONDS, ValueType.ACE);
    }

    @Test
    public void deckIsFull(){
        assertEquals(52, deck1.size());
    }
    @Test
    public void firstTwoCardsCorrect(){
        assertEquals(ValueType.ACE, deck1.getAllCards().get(0).getValue());
        assertEquals(SuitType.DIAMONDS, deck1.getAllCards().get(0).getSuit());
        assertEquals(ValueType.TWO, deck1.getAllCards().get(1).getValue());
        assertEquals(SuitType.DIAMONDS, deck1.getAllCards().get(1).getSuit());
    }

    @Test
    public void deckIsDifferentAfterShuffle(){
        assertEquals(deck1.getAllCards().get(0).getValue(), deck2.getAllCards().get(0).getValue());
        deck1.shuffle();
        assertNotEquals(deck1.getAllCards().get(0).getValue(), deck2.getAllCards().get(0).getValue());
    }

    @Test
    public void canDealSingleCard(){
        deck1.dealCard();
        assertEquals(51, deck1.size());
    }

    @Test
    public void canDealHand(){
        hand1 = deck1.deal(3);
        assertEquals(49, deck1.size());
        assertEquals(3, hand1.sizeOfHand());

    }
}
