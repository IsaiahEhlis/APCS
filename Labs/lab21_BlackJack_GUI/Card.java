// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
package lab21_BlackJack_GUI;

import java.io.File;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

import lab21_BlackJack_GUI.Card;

public abstract class Card {

    public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR",
        "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
    private String suit;
    private int face;
    private int width;
    private int height;
    private Image image;

    public Card() {
        this(0, "", 0, 0);
    }

    public Card(int f, String s) {
        this(f, s, 0, 0);
    }

    public Card(int f, String s, int wid, int ht) {
        //set instance variables to parameter values
        //intialize all instance variables

        String name = this.toString().replaceAll(" ", "");
        try {
            URL url = getClass().getResource("/images/" + name + ".jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    // modifiers
    public void setFace(int f) {
        face = f;
    }

    //add more set methods
    //accessors
    public int getFace() {
        return face;
    }

    //add more get methods
    public boolean equals(Object obj) {
        //add in code to complete the equals method
        return false;
    }

    public abstract int getValue();

    public String toString() {
        //get rid of the has a value of - getValue()
        //before you start the graphics part
        //with the images -check the image names
        return FACES[face] + "of" + getSuit() + "has  a value of " + getValue();
    }

    public void drawCard(Graphics window, int x, int y) {
        window.drawImage(image, x, y, width, height, null);
    }
}