import java.util.ArrayList;

public class Game {

    Deck deck;
    ArrayList<Player> players;
    UI ui;

    public Game(){
        this.deck = new Deck();
        this.players = new ArrayList<>();
        ui = new UI();

    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }


    public void startGame(){
        for (Player player : this.players) {
            player.setHand(this.deck.deal(2));
        }
        ui.showHands(this.players);
    }

    public Player getWinner(){
        Player winner = this.players.get(0);
        for (Player player : this.players) {
            if (player.getHand().handValue() > winner.getHand().handValue()) {
                winner = player;
            }

        }
        ui.showWinner(winner);
        return winner;
    }
}
