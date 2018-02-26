package lab21_BlackJack_GUI;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import static java.lang.System.*;

import lab21_BlackJack_GUI.Card;
import lab21_BlackJack_GUI.Deck;

public class DeckTestTwo extends JPanel {

    public static final int NUMCARDS = 52;

    public DeckTestTwo() {
        setBackground(Color.white);
        setVisible(true);
    }

    public void paintComponent(Graphics window) {
        super.paintComponent(window);

        Deck deck = new Deck();

        for (int i = 0; i < NUMCARDS; i++) {
            Card c = deck.nextCard();
            c.setWidth(90);
            c.setHeight(120);
            c.drawCard(window, i * 11 + 25, 50 + i * 4);
        }

        deck.shuffle();

        for (int i = 0; i < NUMCARDS; i++) {
            Card c = deck.nextCard();
            c.setWidth(90);
            c.setHeight(120);
            c.drawCard(window, i * 11 + 25, 250 + i * 4);
        }
    }
}