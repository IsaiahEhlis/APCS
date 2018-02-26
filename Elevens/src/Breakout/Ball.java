 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Breakout;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Ehlis.Isaiah19
 */
public class Ball extends GameElement implements Renderable, Updateable {
    
    private double velX, velY, updateTime;
    
    public Ball(double x, double y, double height, double width, double xVel, double yVel, Color clr){
        super(x, y, height, width, clr);
        velX = xVel;
        velY = yVel;
    }
    
    public void onCollision(GameElement g){
        double xCol1 = this.getX() + this.getWidth() - g.getX();
        double xCol2 = g.getX() + g.getWidth() - this.getX();
        double yCol1 = this.getY() + this.getHeight() - g.getY();
        double yCol2 = g.getY() + g.getHeight() - this.getY();
        
        double overlapX;
        double overlapY;
        
        if(xCol1 < xCol2){
            overlapX = xCol1;
        } else{
            overlapX = xCol2;
        }
        if(yCol1 < yCol2){
            overlapY = yCol1;
        } else{
            overlapY = yCol2;
        }
        
        if(overlapX < overlapY){
            velX *= -1;
        } else {
            velY *= -1;
        }
    }
    
    public Ball returnClass(){
        return this;
    }

    
    public void update(double d){
        setX(getX() + velX * d);
        setY(getY() + velY * d);
    }
    
    public void draw(Canvas c, Color col){
        GraphicsContext graphics = c.getGraphicsContext2D();
        graphics.setFill(col);
        graphics.fillOval(getX(), getY(), getWidth(), getHeight()); 
    }
    
  
}
