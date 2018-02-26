// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -
package lab21_BlackJack_GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import lab21_BlackJack_GUI.Card;

public abstract class AbstractPlayer implements Playerable {

    private ArrayList<Card> hand;
    private int winCount;

    public AbstractPlayer() {
    }

    public AbstractPlayer(int score) {
    }

    public void addCardToHand(Card temp) {
    }

    public void resetHand() {
        hand.clear();
    }

    public void setWinCount(int numwins) {
    }

    public int getWinCount() {
        return 0;
    }

    public int getHandSize() {
        return 0;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandValue() {





        return 0;
    }

    public String toString() {
        return "hand = " + hand.toString() + " \n-  # wins " + winCount;
    }

    public void drawHand(Graphics window, int x, int y) {
    }
}