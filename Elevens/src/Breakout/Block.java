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
public class Block extends GameElement implements Renderable {
    
    public Block(double x, double y, double height, double width, Color clr){
        super(x, y, height, width, clr);
    }
    
    public void destroy(GameElement g){
         x = 0;
         y = 0;
         width = 0;
         height = 0;
         color = Color.WHITE;
    }
    
    public void onCollision(GameElement g){
        destroy(g);
    }
    

    
    public void draw(Canvas c, Color col){
        GraphicsContext graphics = c.getGraphicsContext2D();
        
        graphics.setFill(col);
        graphics.fillRect(getX(), getY(), getWidth(), getHeight());         
    }
    

    
    
    
  
}
