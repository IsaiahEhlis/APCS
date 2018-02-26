package shapes;

import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    
    private final double width;
    private final double height;
    
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
        setStroke(Color.LIGHTGREEN);
    }
    
    @Override
    public double[][] getVertices() {
        double angle = getAngle();
        double centerX = getCenterX();
        double centerY = getCenterY();
        
        double x1 = centerX + Shape.rotateX(width / 2, height / 2, angle);
        double y1 = centerY + Shape.rotateY(width / 2, height / 2, angle);
        double x2 = centerX + Shape.rotateX(width / 2, -height / 2, angle);
        double y2 = centerY + Shape.rotateY(width / 2, -height / 2, angle);
        double x3 = centerX + Shape.rotateX(-width / 2, -height / 2, angle);
        double y3 = centerY + Shape.rotateY(-width / 2, -height / 2, angle);
        double x4 = centerX + Shape.rotateX(-width / 2, height / 2, angle);
        double y4 = centerY + Shape.rotateY(-width / 2, height / 2, angle);
        
        return new double[][]{{x1, y1}, {x2, y2}, {x3, y3}, {x4, y4}};
    }
    
}
