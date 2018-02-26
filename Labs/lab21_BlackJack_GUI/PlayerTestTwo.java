package lab21_BlackJack_GUI;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import javax.swing.JPanel;
import static java.lang.System.*;

import lab21_BlackJack_GUI.Card;
import lab21_BlackJack_GUI.Deck;
import lab21_BlackJack_GUI.AbstractPlayer;
import lab21_BlackJack_GUI.Player;

public class PlayerTestTwo extends JPanel implements KeyListener {

    private Deck deck;
    private Player player;
    private Font font;
    private boolean start;
    private boolean hit;
    private boolean finish;
    private boolean show;

    public PlayerTestTwo() {
        setBackground(Color.white);

        deck = new Deck();
        player = new Player();

        font = new Font("TAHOMA", Font.BOLD, 12);

        this.addKeyListener(this);    //starts the key thread running
    }

    public void paintComponent(Graphics window) {
        super.paintComponent(window);

        window.setColor(Color.blue);
        window.setFont(font);
        window.drawString("BlackJack Player Test", 25, 50);
        window.drawString("PRESS B to add cards to your hand.", 25, 100);

        if (start == true) {
            deck.shuffle();
            player.addCardToHand(deck.nextCard());
            player.addCardToHand(deck.nextCard());
            start = false;
            show = false;
        }

        window.drawString("PLAYER ", 50, 365);
        player.drawHand(window, 0, 365);
    }

    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
            start = true;
            repaint();
        }
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}