package lab21_BlackJack_TEXT;

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
import lab21_BlackJack_GUI.AbstractPlayer;
import lab21_BlackJack_GUI.Player;

public class PlayerTestOne {

    public static void main(String args[]) {
        Player player = new Player();

        Deck deck = new Deck();
        deck.shuffle();

        player.addCardToHand(deck.nextCard());
        player.addCardToHand(deck.nextCard());

        out.println("\n\ntoString");
        out.println(player);

        out.println("\n\nhandValue");
        out.println(player.getHandValue());

        player.addCardToHand(deck.nextCard());
        player.addCardToHand(deck.nextCard());

        out.println("\n\ntoString");
        out.println(player);

        out.println("\n\nhandValue");
        out.println(player.getHandValue());
    }
}