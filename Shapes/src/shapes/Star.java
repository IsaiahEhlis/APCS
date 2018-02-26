package shapes;

import javafx.scene.paint.Color;

public class Star extends Shape {
    
    private final double sideLength;
    
    public Star(double x, double y, double sideLength) {
        super(x, y);
        this.sideLength = sideLength;
        setStroke(Color.YELLOW);
    }
    
    @Override
    public double[][] getVertices() {
        double[][] vertices = new double[10][2];
        
        double angle = getAngle();
        double centerX = getCenterX();
        double centerY = getCenterY();
        double xInner = sideLength / 2;
        double yInner = sideLength * 0.819;
        double xPeak = 0;
        double yPeak = sideLength * 2.348;
        
        for (int i = 0; i < 5; i++) {
            double nextXPeak = centerX + Shape.rotateX(xPeak, yPeak, angle + i * (2 * Math.PI / 5));
            double nextYPeak = centerY + Shape.rotateY(xPeak, yPeak, angle + i * (2 * Math.PI / 5));
            double nextXInner = centerX + Shape.rotateX(xInner, yInner, angle + (i + 1) * (2 * Math.PI / 5));
            double nextYInner = centerY + Shape.rotateY(xInner, yInner, angle + (i + 1) * (2 * Math.PI / 5));
            vertices[2 * i][0] = nextXPeak;
            vertices[2 * i][1] = nextYPeak;
            vertices[2 * i + 1][0] = nextXInner;
            vertices[2 * i + 1][1] = nextYInner;
        }
        return vertices;
    }
    
}
