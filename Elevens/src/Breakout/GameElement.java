/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Breakout;

import javafx.scene.paint.Color;

/**
 *
 * @author Ehlis.Isaiah19
 */
public abstract class GameElement {
    
    Color color;
    double width;
    double height;
    double x;
    double y;
    
   public GameElement(double x, double y, double height, double width, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
   
   public GameElement(double x, double y, double height, double width){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double wid){
        width = wid;
    }
    
    public void setHeight(double ht){
        height = ht;
    }
    
    public void setX(double ex){
        x = ex;
    }
    
    public void setY(double why){
        y = why;
    }
    
    public void setColor(Color clr){
        color = clr;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public Color getColor(){
        return color;
    }
    
    public abstract void onCollision(GameElement g);
    
    public void checkCollision(GameElement g){
       boolean Xcol = false;
       boolean Ycol = false;
      
       if(this.getX() + this.getWidth() - g.getX() >= 0 && g.getX() + g.getWidth() - this.getX() >= 0){
           Xcol = true;
       } 
       if(this.getY() + this.getHeight() - g.getY() >= 0 && g.getY() + g.getHeight() - this.getY() >= 0){
           Ycol = true;
       }
       if(Ycol && Xcol){
          g.onCollision(this);
          this.onCollision(g);
       }
     
    }
}
