package lab18j_list_of_references__winter_scene_project;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

//Name -
//Date -
//Class -
//Lab  -


public abstract class AbstractShape {
    //instance variables

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    private int xSpeed;
    private int ySpeed;

    public AbstractShape(int x, int y, int wid, int ht) {
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = Color.WHITE;
        xSpeed = 0;
        ySpeed = 0;
    }

    public AbstractShape(int x, int y, int wid, int ht, Color col) {
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = col;
        xSpeed = 0;
        ySpeed = 0;
    }

    public AbstractShape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = col;
        xSpeed = xSpd;
        ySpeed = ySpd;
    }

    //add in set and get methods for pos and speed
    public void setXPos(int xp) {
        xPos = xp;
    }

    public void setYPos(int yp) {
        yPos = yp;
    }

    public void setXSpeed(int xs) {
        xSpeed = xs;
    }

    public void setYSpeed(int ys) {
        ySpeed = ys;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public Color getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public abstract void draw(Canvas canvas);

    public String toString() {
        return xPos + " " + yPos + " " + width + " " + height + " " + color + " " + xSpeed + " " + ySpeed;
    }
}