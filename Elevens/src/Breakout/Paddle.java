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
public class Paddle extends GameElement implements Renderable, Updateable {
    
    private double velocity;
    private String direction = "NEUTRAL";
    
    public Paddle(double x, double y, double height, double width, double vel, Color clr){
        super(x, y, height, width, clr);
        velocity = vel;
    }
    
    public void onCollision(GameElement g){
            //NOTHING
    }

    
    public void update(double d){
        
        int dir = 1;
        double tempVeloc = velocity;
        if(direction.equals("LEFT")){
            dir = -1;
        }
        if(direction.equals("RIGHT")){
            dir = 1;
        }
        if(direction.equals("NEUTRAL")){
            dir = 0;
        }
        velocity *= dir;
        setX(getX() + velocity * d);
        setVelocity(tempVeloc);
    }
    
    public void setDirection(String s){
        direction = s;
    }
    
    public void setVelocity(double vel){
        velocity = vel;
    }
    
    
    public void draw(Canvas c, Color col){
        GraphicsContext graphics = c.getGraphicsContext2D();
        
        graphics.setFill(col);
        graphics.fillRect(getX(), getY(), getWidth(), getHeight()); 
    }
}
