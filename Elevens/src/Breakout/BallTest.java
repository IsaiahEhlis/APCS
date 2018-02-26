/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Breakout;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class BallTest extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    double lastRenderTime = 0;
    double lastUpdateTime = 0;
    Ball one;
    Wall top, bottom, left, right;
    RedrawTimer timer = new RedrawTimer();

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        //instantiate a new Ball
        top = new Wall(0,0,WIDTH,0);
        bottom = new Wall(0,HEIGHT, WIDTH, 0);
        right = new Wall(WIDTH, 0, HEIGHT, 0);
        left = new Wall(0, 0, HEIGHT, 0);
        one = new Ball(20, 20, 20, 20, 100, 50, Color.BLUE);
        //test the Ball thoroughly
        //test all constructors
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        primaryStage.setTitle("Breakout!");
        primaryStage.setScene(scene);
        primaryStage.show();
        timer.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public class RedrawTimer extends AnimationTimer { //added for animation lab05

        //private long lastFrameTime;
        @Override
        public void handle(long now) {
            GraphicsContext graphics = canvas.getGraphicsContext2D();
            graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            if (lastUpdateTime == 0) {
                lastUpdateTime = System.currentTimeMillis() / 1000.0;
            }
            double currTime = System.currentTimeMillis() / 1000.0;
            double deltaTime = currTime - lastUpdateTime;

            one.update(deltaTime);
            one.draw(canvas, one.getColor());
            lastUpdateTime = currTime;
            
            one.checkCollision(top);
            one.checkCollision(bottom);
            one.checkCollision(left);
            one.checkCollision(right);
        }

    }
}