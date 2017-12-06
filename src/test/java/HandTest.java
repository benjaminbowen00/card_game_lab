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
        card1 = new Card(SuitType.CLUBS, ValueType.TWO);
    }

    @Test
    public void canAddCards(){
        hand1.addCard(card1);
        hand1.addCard(card2);
        assertEquals(2, hand1.sizeOfHand());
    }
}
