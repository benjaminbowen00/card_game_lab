import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card1;
    Card card2;

    @Before
    public void before() {
        card1 = new Card(SuitType.CLUBS, ValueType.SEVEN);
        card2 = new Card(SuitType.SPADES, ValueType.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.CLUBS, card1.getSuit());
    }

    @Test
    public void canGetNumericValue(){
        assertEquals(10, card2.getNumericalValue());
    }
}
