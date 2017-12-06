import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> allCards;
    SuitType[] suits = SuitType.values();
    ValueType[] values = ValueType.values();

    public Deck(){
        this.allCards = new ArrayList<>();

        for (SuitType suit : suits) {
            for (ValueType value : values) {
                Card card = new Card(suit, value);
                this.allCards.add(card);
            }
        }
    }

    public ArrayList<Card> getAllCards() {
        return allCards;
    }

    public int size(){
        return this.allCards.size();
    }

    public void shuffle(){
        Collections.shuffle(allCards);
    }

    public Hand deal() {
        this.shuffle();
        
    }
}
