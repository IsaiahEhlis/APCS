// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package lab21_BlackJack_TEXT;

import java.util.ArrayList;
import lab21_BlackJack_TEXT.Card;

public abstract class AbstractPlayer implements Playerable {

    private ArrayList<Card> hand;
    private int winCount;

    //constructors
    public void addCardToHand(Card temp) {
    }

    public void resetHand() {
    }

    public void setWinCount(int numwins) {
    }

    public int getWinCount() {
        return 0;
    }

    public int getHandSize() {
        return 0;
    }

    public int getHandValue() {
        //great example of polymorphism
        int total = 0;







        return total;
    }

    public String toString() {
        return "hand = " + hand.toString() + " \n-  # wins " + winCount;
    }
}