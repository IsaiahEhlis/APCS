/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.ArrayList;
import java.util.List;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Matt
 */
public class Main extends Application {

    private static final double WIDTH = 800;
    private static final double HEIGHT = 600;
    private Canvas canvas;
    private List<Shape> shapes;
    private RotationTimer timer;
    private Shape lastShape;

    private boolean rotating;

    @Override
    public void start(Stage primaryStage) {
        canvas = new Canvas(WIDTH, HEIGHT);
        canvas.getGraphicsContext2D().setLineWidth(5);
        shapes = new ArrayList<>();
        timer = new RotationTimer();
        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setFill(Color.BLACK);

        scene.setOnKeyPressed((KeyEvent) -> {
            switch (KeyEvent.getCode()) {
                case ENTER:
                    addNewShape();
                    break;
                case SPACE:
                    toggleRotates();
                    break;
                case Z:
                    if (KeyEvent.isControlDown()) {
                        removeLastShape();
                    }
            }
        });

        primaryStage.setTitle("Shapes!");
        primaryStage.setScene(scene);
        primaryStage.show();

        timer.start();
    }

    private void addNewShape() {
        shapes.add(getRandomShape());
        lastShape = shapes.get(shapes.size() - 1);
    }
    
    private Shape getRandomShape() {
        int shapeNum = (int)(Math.random() * 3);
        if(shapeNum == 0){
            return new Triangle(Math.random() * WIDTH, Math.random() * HEIGHT, Math.random() * 30 + 20);
        } else if (shapeNum == 1){
            return new Star(Math.random() * WIDTH, Math.random() * HEIGHT, Math.random() * 30 + 20);
        }else{
            return new Rectangle(Math.random() * WIDTH, Math.random() * HEIGHT, Math.random() * 30 + 20, Math.random() * 30 + 20);
        }
    }

    private void toggleRotates() {
        rotating = !rotating;
    }
    
    private void removeLastShape() {
        shapes.remove(getLastShape());
    }
    
    public Shape getLastShape() {
        return lastShape;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public class RotationTimer extends AnimationTimer {

        @Override
        public void handle(long now) {
            canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            for (Shape s : shapes) {
                s.draw(canvas);
                if (rotating) {
                    s.rotate(Math.PI / 120);
                }
            }
        }
    }

}
