package lab23f_recursion_garbage;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class ColoredCell extends Cell {

    private boolean filled;
    private Color color;

    public ColoredCell() {
        super(5, 5, 5, 5);
        setFilled(false);
        setColor(Color.BLUE);
    }

    public ColoredCell(boolean fill) {
    }

    public ColoredCell(int x, int y, boolean fill) {
    }

    public ColoredCell(int x, int y, int w, int h, boolean fill) {
    }

    public ColoredCell(int x, int y, int w, int h, boolean fill, Color c) {
    }

    public void setFilled(boolean fill) {
    }

    public void setColor(Color c) {
    }

    public boolean getFilled() {
        return false;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics window) {
        window.setFont(new Font("TAHOMA", Font.BOLD, 28));
        window.setColor(getColor());
        window.drawRect(getX(), getY(), getWidth(), getHeight());





    }

    public String toString() {
        return super.toString() + " " + getFilled() + " " + getColor();
    }
}