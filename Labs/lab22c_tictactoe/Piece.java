package lab22c_tictactoe;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class Piece extends Cell implements Nameable {

    private String name;
    private Color color;

    public Piece() {
        super(5, 5, 5, 5);
        setName("empty");
        setColor(Color.BLUE);
    }

    public Piece(String n) {
    }

    public Piece(int x, int y, String n) {
    }

    public Piece(int x, int y, int w, int h, String n) {
    }

    public Piece(int x, int y, int w, int h, String n, Color c) {
    }

    public void setName(String n) {
    }

    public void setColor(Color c) {
    }

    public String getName() {
        return "";
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics window) {
        window.setFont(new Font("TAHOMA", Font.BOLD, 28));
        window.setColor(getColor());



    }

    public String toString() {
        return "";
    }
}