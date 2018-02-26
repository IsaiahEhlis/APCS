package lab21_BlackJack_TEXT;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.awt.Color;

import lab21_BlackJack_TEXT.Card;
import lab21_BlackJack_TEXT.BlackJackCard;
import lab21_BlackJack_TEXT.Deck;
import lab21_BlackJack_TEXT.AbstractPlayer;
import BlackJack.Player;
import BlackJack.Dealer;

public class DealerTestOne {

    public static void main(String args[]) {
        //Code to test the Dealer
        Dealer dealer = new Dealer();
        Player player = new Player();

        dealer.shuffle();

        player.addCardToHand(dealer.deal());
        dealer.addCardToHand(dealer.deal());
        player.addCardToHand(dealer.deal());
        dealer.addCardToHand(dealer.deal());

        int playerTotal = player.getHandValue();
        int dealerTotal = dealer.getHandValue();

        out.println("\nPLAYER ");
        out.println("Hand Value :: " + playerTotal);
        out.println("Hand Size :: " + player.getHandSize());
        out.println("Cards in Hand :: " + player.toString());
        out.println("\nDEALER ");
        out.println("Hand Value :: " + dealerTotal);
        out.println("Hand Size :: " + dealer.getHandSize());
        out.println("Cards in Hand :: " + dealer.toString());

        if (playerTotal > 21 && dealerTotal <= 21) {
            out.println("\nDealer wins - Player busted!");
        } else if (playerTotal <= 21 && dealerTotal > 21) {
            out.println("\nPlayer wins - Dealer busted!");
        } else if (playerTotal > 21 && dealerTotal > 21) {
            out.println("Both players bust!");
        } else if (playerTotal < dealerTotal) {
            out.println("\nDealer has bigger hand value!");
        } else {
            out.println("\nPlayer has bigger hand value!");
        }
    }
}