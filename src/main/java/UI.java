import java.util.ArrayList;

public class UI {

    public UI() {
    }

    public void showHands(ArrayList<Player> players){
//        loop round players na print out their name and hands
        for (Player player : players) {
            System.out.println(player.getName()+" has hand "+ player.getHand().showHand());
        }
    }

    public void showWinner(Player player){
        System.out.println(player.getName()+ " has won! \n");
    }
}
