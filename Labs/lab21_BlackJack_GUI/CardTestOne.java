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

public class CardTestOne {

    public static void main(String args[]) {
        Card one = new BlackJackCard();
        out.println(one);

        Card two = new BlackJackCard(1, "DIAMONDS");
        out.println(two);

        Card three = new BlackJackCard(4, "CLUBS");
        out.println(three);

        Card four = new BlackJackCard(12, "SPADES");
        out.println(four);

        Card five = new BlackJackCard(12, "HEARTS");
        out.println(five);

        Card six = new BlackJackCard(9, "SPADES");
        out.println(six);

        out.println(one.equals(two));
        out.println(one.equals(one));
        out.println(four.equals(five));
        out.println(three.equals(four));
    }
}