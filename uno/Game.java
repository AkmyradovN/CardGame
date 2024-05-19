package uno;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import uno.util.Card;
import uno.util.InputSource;
import uno.util.CardType;
import uno.util.NotEnoughPlayersException;
import uno.util.Color;

public class Game {
    protected LinkedList<Card> deck = new LinkedList<>();
    protected List<Player> players;
    protected Card currentCard;
    protected int currentPlayerIdx;
    protected boolean isForward;
    protected boolean isOn;
    protected InputSource inputSource;
    
    public Game(int fieldCurrentPlayerIdx, InputSource inputSource, ArrayList<Player> players){
        this.fieldCurrentPlayerIdx = fieldCurrentPlayerIdx;
        this.inputSource = inputSource;

    }
    private void initDeck(){

    }
    private void initPlayers(int fieldCurrentPlayerIdx, ArrayList<Player> players){

    }
    private ArrayList<Player> drawCards(int fieldCurrentPlayerIdx){
        return null;
    }
    public static void main(String[] args){

    }
    public void playNext(){

    }
    public int getNextPlayerIdx(){
        return 1;
    }
    private void currentPlayerDrawCard(){

    }
    public Player getCurrentPlayer(){
        return null;
    }
    private void interactiveMsg(String str){
        
    }
    private void useCardEffect(){

    }
    public ArrayList<Player> getPlayers(){
        return players;
    }

}
