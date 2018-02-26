package lab21_BlackJack_GUI;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import lab20a_pong_project.TheGame;
import javax.swing.JFrame;
import java.awt.Component;
import lab21_BlackJack_GUI.BlackJack;

public class TheGame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public TheGame() {
        super("BLACKJACK");
        setSize(WIDTH, HEIGHT);

        BlackJack theGame = new BlackJack();
        ((Component) theGame).setFocusable(true);

        getContentPane().add(theGame);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        TheGame run = new TheGame();
    }
}