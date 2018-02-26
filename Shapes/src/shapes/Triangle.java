package shapes;

import javafx.scene.paint.Color;

public class Triangle extends Shape {
    
    private double sideLength;
    
    public Triangle(double x, double y, double sideLength) {
        super(x, y);
        this.sideLength = sideLength;
        setStroke(Color.AQUA);
    }

    @Override
    public double[][] getVertices() {
        double angle = getAngle();
        double centerX = getCenterX();
        double centerY = getCenterY();
        double height = sideLength * Math.sqrt(3) / 2;
        
        double x1 = centerX + Shape.rotateX(0, height * 2 / 3, angle);
        double y1 = centerY + Shape.rotateY(0, height * 2 / 3, angle);
        double x2 = centerX + Shape.rotateX(sideLength / 2, height * -1 / 3, angle);
        double y2 = centerY + Shape.rotateY(sideLength / 2, height * -1 / 3, angle);
        double x3 = centerX + Shape.rotateX(-sideLength / 2, height * -1 / 3, angle);
        double y3 = centerY + Shape.rotateY(-sideLength / 2, height * -1 / 3, angle);
        
        return new double[][]{{x1, y1}, {x2, y2}, {x3, y3}};
    }
    
}
