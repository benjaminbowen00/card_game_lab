import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Card card1;
    Card card2;
    Hand hand1;

    @Before
    public void before() {
        hand1 = new Hand();
        card1 = new Card(SuitType.SPADES, ValueType.EIGHT);
        card2 = new Card(SuitType.CLUBS, ValueType.TWO);
        hand1.addCard(card1);
        hand1.addCard(card2);
    }

    @Test
    public void canAddCards(){
        assertEquals(2, hand1.sizeOfHand());
    }

    @Test
    public void canGetHandValue(){
        assertEquals(10, hand1.handValue());
    }
}
