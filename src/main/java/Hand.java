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

    public int handValue(){
        int total = 0;
        for (Card card : this.cards) {
            total += card.getNumericalValue();
        }
        return total;
    }

    public String showHand(){
        String hand = "";
        for(Card card : this.cards) {
            hand += card.getValue().toString()+" of " + card.getSuit().toString() +"  ";
        }
        return hand;
    }
}
