/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Breakout;

import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
public class Breakout extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;
    private static Canvas canvas;

    Ball ball;
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
        
        ball = new Ball(200, 200, 15, 15, 200, 100, Color.BLUE);
        
        
        top = new Wall(0,0,1,WIDTH);
        right = new Wall(WIDTH - 20, 0, HEIGHT,1);
        left = new Wall(0, 0, HEIGHT, 50);
        
        paddle = new Paddle(250,350,15,60,500, Color.GRAY);
        
        Random random = new Random();
        
        for(int x = 1; x <= 14; x++){
            state.add(new StrongBlock(2*x + 50*x, 18,15,50,Color.GREEN));
        }
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j<=14;j++){
                
                int r1 = random.nextInt(256);
                int r2 = random.nextInt(256);
                int r3 = random.nextInt(256);
                
                Color randomColor = Color.rgb(r1, r2, r3);
                
                state.add(new Block(2*j + 50*j, 2*i + 15*i,15,50, randomColor));
            }
        }
        
        state.add(ball);
        state.add(top);
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

        primaryStage.setTitle("Breakout");
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
            
            if(ball.getY() + ball.getHeight() >= HEIGHT){
                for(int i = 0; i < 5; i++){
                    System.out.println("YOU LOSE");
                }
            }
            
        }
    }
}