// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package lab21_BlackJack_TEXT;

import java.util.ArrayList;
import java.util.Collections;

import lab21_BlackJack_TEXT.Card;

public class Deck {

    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;
    public static final String SUITS[] = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};
    private int topCardIndex;
    private ArrayList<Card> stackOfCards;

    public Deck() {
        //initialize data - stackOfCards - topCardIndex
        //loop through suits
        //loop through faces
        //add in a new card
    }

    //modifiers
    public void shuffle() {
        //shuffle the deck
        //reset variables as needed
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