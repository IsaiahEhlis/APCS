package lab21_BlackJack_GUI;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import lab20a_pong_project.Tester;
import lab10_boolean_Board.Tester;
import javax.swing.JFrame;
import java.awt.Component;
import lab21_BlackJack_GUI.BlackJack;

public class Tester extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public Tester() {
        super("BLACKJACK TESTER");
        setSize(WIDTH, HEIGHT);

        CardTestTwo cardTest = new CardTestTwo();
        getContentPane().add(cardTest);

        //DeckTestTwo deckTest = new DeckTestTwo();
        //((Component)deckTest).setFocusable(true);		
        //getContentPane().add(deckTest);

        //PlayerTestTwo playerTest = new PlayerTestTwo();
        //((Component)playerTest).setFocusable(true);	
        //getContentPane().add(playerTest);

        setVisible(true);
    }

    public static void main(String args[]) {
        Tester run = new Tester();
    }
}