package shapes;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {

    private final double centerX;
    private final double centerY;
    private double angle = 0;
    private Color stroke;
    private Color fill;

    public Shape(double x, double y) {
        this.centerX = x;
        this.centerY = y;
        stroke = Color.TRANSPARENT;
        fill = Color.TRANSPARENT;
    }

    public void draw(Canvas canvas) {
        double[][] vertices = getVertices();
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(stroke);
        graphics.setFill(fill);
        graphics.beginPath();
        graphics.moveTo(vertices[vertices.length - 1][0], vertices[vertices.length - 1][1]);
        for (int idx = 0; idx < vertices.length; idx++) {
            graphics.lineTo(vertices[idx][0], vertices[idx][1]);
        }
        graphics.stroke();
        graphics.fill();
        graphics.closePath();
    }
    
    public abstract double[][] getVertices();
    
    public void rotate(double angle) {
        this.angle += angle;
    }


    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getAngle() {
        return angle;
    }

    public Color getStroke() {
        return stroke;
    }

    public Color getFill() {
        return fill;
    }
    
    public void setStroke(Color stroke) {
        this.stroke = stroke;
    }
    
    public void setFill(Color fill) {
        this.fill = fill;
    }

    public static double rotateX(double x, double y, double theta) {
        return x * cos(theta) - y * sin(theta);
    }

    public static double rotateY(double x, double y, double theta) {
        return x * sin(theta) + y * cos(theta);
    }
}
