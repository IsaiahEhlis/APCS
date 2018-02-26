// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  
package lab21_BlackJack_GUI;

import java.util.ArrayList;
import java.util.Collections;

import lab21_BlackJack_GUI.Card;

public class Deck {

    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;
    public static final String SUITS[] = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};
    private int topCardIndex;
    private ArrayList<Card> stackOfCards;

    public Deck() {
        //initialize data
        //populate stackOfCards with new cards
        //out.println(stackOfCards);
    }

    //modifiers
    public void shuffle() {
    }

    //accessors
    public int size() {
        return 0;
    }

    public int numCardsLeft() {
        return 0;
    }

    public Card nextCard() {
        return stackOfCards.get(topCardIndex--);
    }

    public String toString() {
        return stackOfCards + "   topCardIndex = " + topCardIndex;
    }
}
