/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
/**
 *
 * @author wkranz
 */
public class Ball extends Block implements Renderable, Updateable {

    private int xSpeed;
    private int ySpeed;

    public Ball() {
        super();
        xSpeed = 3;
        ySpeed = 1;
    }
    public Ball(int xP, int yP, int wid, int ht, Color col){
        super(xP, yP, wid, ht, col);
    }
    public Ball(int xP, int yP, int wid, int ht, Color col, int xS, int yS){
        super(xP, yP, wid, ht, col);
        xSpeed = xS;
        ySpeed = yS;
    }
    public void setXSpeed(int xS){
        xSpeed = xS;
    }
    public void setYSpeed(int yS){
        ySpeed = yS;
    }
    public int getXSpeed(){
        return xSpeed;
    }
    public int getYSpeed(){
        return ySpeed;
    }
    
    public String toString(){
        return super.toString() + " " + xSpeed + " " + ySpeed;
    }



    public void update(Canvas cvs) {
        //draw a white ball at old ball location
        super.draw(cvs, Color.WHITE);
        setXPos(getXPos() + xSpeed);
        setYPos(getYPos() + ySpeed);
     }

    @Override
    public boolean equals(Object obj) {
        Ball b = (Ball)obj;
        if (super.getHeight() == b.getHeight() && super.getColor() == b.getColor() && super.getWidth() == b.getWidth() && super.getXPos() == b.getXPos() && super.getYPos() == b.getYPos() && b.xSpeed == this.xSpeed && b.ySpeed == this.ySpeed){
            return true;
        }
        return false;
    }

}
