import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public int sizeOfHand(){
        return cards.size();
    }
}
