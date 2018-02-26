// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
package lab21_BlackJack_GUI;

import javax.swing.JFrame;
import java.awt.Component;

public class CardDeckPlayerGraphicsRunner extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public CardDeckPlayerGraphicsRunner() {
        super("BLACKJACK CardDeckPlayerRunner");
        setSize(WIDTH, HEIGHT);

        //test the Card class
        CardTestTwo cardTest = new CardTestTwo();
        getContentPane().add(cardTest);

        //test the Deck class
        //DeckTestTwo deckTest = new DeckTestTwo();
        //((Component)deckTest).setFocusable(true);
        //getContentPane().add(deckTest);

        //test the Player class
        //PlayerTestTwo playerTest = new PlayerTestTwo();
        //((Component)playerTest).setFocusable(true);
        //getContentPane().add(playerTest);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        CardDeckPlayerGraphicsRunner run = new CardDeckPlayerGraphicsRunner();
    }
}