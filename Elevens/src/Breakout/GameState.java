/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Breakout;

import java.util.ArrayList;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Ehlis.Isaiah19
 */
public class GameState {
    
    ArrayList<Renderable> renderers;
    ArrayList<Updateable> updaters;
    ArrayList<GameElement> colliders;
    
    double lastRenderTime = 0;
    double lastUpdateTime = 0;
    
    public GameState(){
        renderers = new ArrayList();
        updaters = new ArrayList();
        colliders = new ArrayList();
    }
    
    public void add(GameElement g){
        if(g instanceof Renderable){
            renderers.add((Renderable)g);
        }
        
        if(g instanceof Updateable){
            updaters.add((Updateable)g);
        }
        
        if(g instanceof GameElement){
            colliders.add((GameElement)g);
        }
    }
    
    public void remove(GameElement g){
        if(g instanceof Renderable){
            renderers.remove((Renderable)g);
        }
        if(g instanceof Updateable){
            updaters.remove((Updateable)g);
        }
        if(g instanceof GameElement){
            colliders.remove((GameElement)g);
        }
    }
    
    public void drawAll(Canvas canvas){
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        for(Renderable r : renderers){
            r.draw(canvas, ((GameElement)r).getColor());
        }
    }
    
    public void updateAll(){
        
        if (lastUpdateTime == 0) {
            lastUpdateTime = System.currentTimeMillis() / 1000.0;
        }
        double currTime = System.currentTimeMillis() / 1000.0;
        double deltaTime = currTime - lastUpdateTime;
        for(Updateable u : updaters){
            u.update(deltaTime);
        }
        lastUpdateTime = currTime;
    }
    
    public void collideAll(){
        for(int i = 0; i < colliders.size(); i++){
            for (int j = i + 1; j < colliders.size(); j++) {
                (colliders.get(i)).checkCollision(colliders.get(j));
            }
        }
    }
}


