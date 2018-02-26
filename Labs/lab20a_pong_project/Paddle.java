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
public class Paddle extends Block implements Renderable, Updateable {

    private int speed;
    private String direction;

    public Paddle() {
        super(10, 10, 10, 40, Color.BLACK);
        speed = 5;
        direction = "NEUTRAL";
        System.out.println("1");
    }
    
    public Paddle(int x, int y, int wd, int ht, Color color){
        super(x,y,wd,ht,color);
        direction = "NEUTRAL";
    }
    
    public Paddle(int x, int y, int wid, int ht, Color clr, int spd){
        super(x, y, wid, ht, clr);
        speed = spd;
        direction = "NEUTRAL";
    }
    
    public void setSpeed(int spd){
        speed = spd;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setDirection(String dir){
        direction = dir;
    }
    
    public String getDirection(){
        return direction;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + speed + " " + direction;
    }

    @Override
    public void update(Canvas canvas) {
        super.draw(canvas, Color.WHITE);
        if(direction.equals("UP")){
            setYPos(getYPos() + speed);
        }else if(direction.equals("DOWN")){
            setYPos(getYPos() + speed * -1);
        }
    }
}
