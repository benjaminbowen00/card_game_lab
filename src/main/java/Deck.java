import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> allCards;


    public Deck(){
        this.allCards = new ArrayList<>();

        for (SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()) {
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

    public Card dealCard(){
        return allCards.remove(0);
    }

    public Hand deal(int number) {
        this.shuffle();
        int i = 0;
        Hand hand_dealt = new Hand();
        while (i < number) {
            hand_dealt.addCard(this.dealCard());
            i++;
        }
        return hand_dealt;
    }
}
