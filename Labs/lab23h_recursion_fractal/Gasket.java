package lab23h_recursion_fractal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class Gasket {

    public void draw(Canvas canvas) {
        gasket(canvas, (canvas.getWidth() - 10) / 2, 20, canvas.getWidth() - 40, canvas.getHeight() - 20, 40, canvas.getHeight() - 20);

    }

    public void gasket(Canvas canvas, double x1, double y1, double x2, double y2, double x3, double y3) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        if(x1 - x2 <= 1 && x2 - x3 <= 1 && x1 - x3 <= 1 && y1 - y2 <= 1 && y1 - y3 <= 1 && y2 - y3 <= 1){
            //nothing
        } else{
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        Color randomCol = Color.rgb(r,g,b);
        graphics.setStroke(randomCol);
        graphics.strokeLine(x1, y1, x2, y2);
        graphics.strokeLine(x1, y1, x3, y3);
        graphics.strokeLine(x2, y2, x3, y3);
        double line1MidpointX = (x2 + x1) / 2;
        double line2MidpointX = (x3 + x1) / 2;
        double line3MidpointX = (x3 + x2) / 2;
        double line1MidpointY = (y2 + y1) / 2;
        double line2MidpointY = (y3 + y1) / 2;
        double line3MidpointY = (y3 + y2) / 2;
        gasket(canvas, x1, y1, line1MidpointX, line1MidpointY, line2MidpointX, line2MidpointY);
        gasket(canvas, line1MidpointX, line1MidpointY, x2, y2, line3MidpointX, line3MidpointY);
        gasket(canvas, line2MidpointX, line2MidpointY, line3MidpointX, line3MidpointY, x3, y3);
        }
        //draw lines to make a triangle or use fillPolygon
        //make some recursive calls

    }
}
