// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
package lab21_BlackJack_GUI;

import javax.swing.JFrame;
import java.awt.Component;
import lab21_BlackJack_GUI.BlackJack;

public class FinalGameGraphicsRunner extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public FinalGameGraphicsRunner() {
        super("BLACKJACK");
        setSize(WIDTH, HEIGHT);

        BlackJack FinalGameRunner = new BlackJack();
        ((Component) FinalGameRunner).setFocusable(true);

        getContentPane().add(FinalGameRunner);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        FinalGameGraphicsRunner run = new FinalGameGraphicsRunner();
    }
}