/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20a_pong_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class PaddleTestTwo extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    RedrawTimer timer = new RedrawTimer();
    Ball one = new Ball(100, 100, 30, 50, Color.BLUE, 5, 6);
    Paddle left = new Paddle(10, 100, 30, 20, Color.GREEN, 6);
    Paddle right = new Paddle(1000, 100, 30, 20, Color.GREEN, 6);
    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);


        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    right.setDirection("UP");
                }
                if (event.getCode() == KeyCode.DOWN) {
                    right.setDirection("DOWN");
                }
                if (event.getCode() == KeyCode.W) {
                    left.setDirection("UP");
                }
                if (event.getCode() == KeyCode.S) {
                    left.setDirection("DOWN");
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                                if (event.getCode() == KeyCode.UP) {
                    right.setDirection("NEUTRAL");
                }
                if (event.getCode() == KeyCode.DOWN) {
                    right.setDirection("NEUTRAL");
                }
                if (event.getCode() == KeyCode.W) {
                    left.setDirection("NEUTRAL");
                }
                if (event.getCode() == KeyCode.S) {
                    left.setDirection("NEUTRAL");
                }
            }
        });
        primaryStage.setTitle("Pong!");
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

            one.update(canvas);
            one.draw(canvas, one.getColor());
            left.update(canvas);
            left.draw(canvas, left.getColor());
            right.update(canvas);
            right.draw(canvas, right.getColor());
        }

    }
}
