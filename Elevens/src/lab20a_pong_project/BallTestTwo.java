/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20a_pong_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class BallTestTwo extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    Ball bleh = new Ball();
    Ball one = new Ball(100, 100, 30, 50, Color.BLUE);
    Ball two = new Ball(100, 100, 30, 50, Color.BLUE, 5, 6);
    
    RedrawTimer timer = new RedrawTimer();
    

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        //instantiate a new Ball
        //test the Ball thoroughly
        //test all constructors
        Scene scene = new Scene(root, WIDTH, HEIGHT);

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
            
            two.update(canvas);
            two.draw(canvas, one.getColor());
        }

    }
}
