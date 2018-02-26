/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Breakout;

import javafx.scene.paint.Color;




/**
 *
 * @author wendi
 */
public class StrongBlock extends Block {
    
    private int strength = 3;
    
    public StrongBlock(double x, double y, double height, double width, Color clr){
        super(x,y,height,width,clr);
    }
    
    public void onCollision(GameElement g){
        if(strength == 2){
            super.setColor(Color.YELLOW);
        }
        if(strength == 1){
            super.setColor(Color.RED);
        }
        if(strength == 0){
            destroy(g);
        }
        strength --;
    }
}
