public class Player {
    String name;
    Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand  = new Hand();
    }

    public Hand getHand(){
        return this.hand;
    }

    public void setHand(Hand hand){
        this.hand = hand;
    }

    public String getName(){
        return this.name;
    }


}
