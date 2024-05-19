package uno;

import java.util.ArrayList;
import uno.util.Card;

public class Player{
    private String name;
    public String getName(){
        return name;
    }
    private ArrayList<Card> hand;
    public ArrayList<Card> getHand(){
        return hand;
    }
    private Game game;
    public Player(ArrayList<Card> hand){
        this.hand = hand;
    }
    public void addToHand(ArrayList<Card> hand){

    }
    public void removeFromHand(int cardIdx){

    }
    @Override
    public String toString(){
        return "0";
    }
}