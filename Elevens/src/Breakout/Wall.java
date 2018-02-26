/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Breakout;



/**
 *
 * @author Ehlis.Isaiah19
 */
public class Wall extends GameElement {

    
    public Wall(double x, double y, double height, double width){
        super(x, y, height, width);
    }
    
    public void onCollision(GameElement g){
        //NOTHING
    }

}
