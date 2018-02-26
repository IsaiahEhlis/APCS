package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public class Block implements Renderable {

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    
    public Block(){
        
    }
    
    public Block(int x, int y, int wid, int ht, Color clr){
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = clr;
    }
    //add a default and initialization Block constructor - x , y , width, height, color
    
    //add the other set methods
    public void setXPos(int x){
        xPos = x;
    }
    public void setYPos(int y){
        yPos = y;
    }
    public void setWidth(int wid){
        width = wid;
    }
    public void setHeight(int ht){
        height = ht;
    }
    public void setColor(Color col) {
    }
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public Color getColor(){
        return color;
    }
    


    public void draw(Canvas canvas, Color col) {
        //uncomment after you write the set and get methods
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(col);
        graphics.fillRect(getXPos(), getYPos(), getWidth(), getHeight()); 
    }

    public boolean equals(Object obj) {
        Block b = (Block)obj;
        if(this.height == b.height && this.color == b.color && this.width == b.width && this.xPos == b.xPos && this.yPos == b.yPos){
            return true;
        }
        return false;
    }

    public String toString(){
        return xPos + " " + yPos + " " + width + " " + height + " " + color;
    }
    //add a toString() method  - x , y , width, height, color
}