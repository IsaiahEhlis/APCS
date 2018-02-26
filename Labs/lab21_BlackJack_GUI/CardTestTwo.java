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
import lab21_BlackJack_GUI.BlackJackCard;

public class CardTestTwo extends JPanel {

    public CardTestTwo() {
        setBackground(Color.white);
        setVisible(true);
    }

    public void paintComponent(Graphics window) {
        super.paintComponent(window);
        window.setFont(new Font("TAHOMA", Font.BOLD, 12));

        window.drawString("BLACKJACK CARD TEST", 90, 40);

        Card one = new BlackJackCard(10, "HEARTS", 90, 120);
        one.drawCard(window, 100, 100);

        Card two = new BlackJackCard(3, "CLUBS", 90, 120);
        two.drawCard(window, 200, 100);

        Card three = new BlackJackCard(9, "SPADES", 90, 120);
        three.drawCard(window, 300, 100);

        //instantiate more cards
    }
}