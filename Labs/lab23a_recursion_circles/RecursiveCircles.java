package lab23a_recursion_circles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author wkranz
 */
public class RecursiveCircles {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.BLUE);
        graphics.strokeText("Lab21a", 20, 40);

        graphics.strokeText("Drawing Circles Using Recursion ", 20, 80);
        drawCircles(canvas, 10, 10);
    }

    public void drawCircles(Canvas canvas, int x, int y) {
        //base case
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        Color randomCol = Color.rgb(r,g,b);
        graphics.setStroke(randomCol);

        if(x<1000){
            graphics.strokeOval(50 + x, 100 + y, x, y);
            drawCircles(canvas, x+1, y+1);
        }
        //drawCircles(window, x+10, y+10);
    }
}
