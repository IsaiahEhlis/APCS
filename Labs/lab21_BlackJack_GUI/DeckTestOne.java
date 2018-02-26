package lab21_BlackJack_GUI;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.awt.Color;

import lab21_BlackJack_GUI.Card;
import lab21_BlackJack_GUI.BlackJackCard;
import lab21_BlackJack_GUI.Deck;

public class DeckTestOne {

    public static void main(String args[]) {
        Deck deck = new Deck();
        for (int i = 0; i < Deck.NUMCARDS; i++) {
            out.println(deck.nextCard());
        }

        out.println("\n\n");

        out.println("num cards left in the deck == " + deck.numCardsLeft());

        out.println("\n\nshuffling");
        deck.shuffle();
        out.println("num cards left in the deck == " + deck.numCardsLeft());


        out.println("\n\ntoString");
        out.println(deck);
    }
}