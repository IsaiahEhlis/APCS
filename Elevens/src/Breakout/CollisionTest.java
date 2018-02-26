/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Breakout;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class CollisionTest extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;

    Ball one;
    Block bone,btwo,bthree,bfour;
    RedrawTimer timer = new RedrawTimer();
    Wall top, bottom, left, right;
    Paddle paddle;
    public static GameState state;

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        
        state = new GameState();
        //instantiate a new Ball
        
        one = new Ball(200, 150, 10, 10, 200, 100, Color.BLUE);
        
        
        top = new Wall(0,0,1,WIDTH);
        bottom = new Wall(0,HEIGHT, 1,WIDTH);
        right = new Wall(WIDTH, 0, HEIGHT,1);
        left = new Wall(0, 0, HEIGHT, 1);
        
        paddle = new Paddle(250,350,20,50,500, Color.DARKGREEN);
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; i<=10;j++){
                state.add(new Block(5*i + 50*i, 5*j + 25*j,25,50,Color.RED));
            }
        }
        state.add(one);
        state.add(bone);
        state.add(btwo);
        state.add(bthree);
        state.add(bfour);
        state.add(top);
        state.add(bottom);
        state.add(left);
        state.add(right);
        state.add(paddle);
        
        //test the Ball thoroughly
        //test all constructors
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			//Fill in the code for the keypress events
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {
                    paddle.setDirection("LEFT");
                }
                if (event.getCode() == KeyCode.RIGHT) {
                    paddle.setDirection("RIGHT");
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {
                    paddle.setDirection("NEUTRAL");
                }
                if (event.getCode() == KeyCode.RIGHT) {
                    paddle.setDirection("NEUTRAL");
                }
            }
        });

        primaryStage.setTitle("Brake in");
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
            
            state.updateAll();
            state.drawAll(canvas);
            state.collideAll();
            
        }

    }
}
