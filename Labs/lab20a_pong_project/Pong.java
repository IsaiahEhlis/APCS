/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20a_pong_project;

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
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class Pong extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    RedrawTimer timer = new RedrawTimer();
    private int leftscore;
    private int rightscore;
    Ball ball;
    Paddle left;
    Paddle right;

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        leftscore = 0;
        rightscore = 0;
        //instantiate a ball that will randomly come out of the middle of the screen
        //  going to the right or left
        ball = new Ball(400, 300, 20, 20, Color.DARKBLUE, (int)((Math.random() * 10)), (int)(Math.random() * 10));
        right = new Paddle(730, 300, 30, 60, Color.DARKRED, 8);
        left = new Paddle(40, 300, 30, 60, Color.DARKGREEN, 8);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			//Fill in the code for the keypress events
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    right.setDirection("DOWN");
                }
                if (event.getCode() == KeyCode.DOWN) {
                    right.setDirection("UP");
                }
                if (event.getCode() == KeyCode.W) {
                    left.setDirection("DOWN");
                }
                if (event.getCode() == KeyCode.S) {
                    left.setDirection("UP");
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
    public void collideLeft(Ball ball, Paddle paddle){
        if(ball.getXPos() <= paddle.getXPos()+paddle.getWidth() + Math.abs(ball.getXSpeed())
            && (ball.getYPos() >= paddle.getYPos() 
                && ball.getYPos() <= paddle.getYPos() + paddle.getHeight() 
                || ball.getYPos() + ball.getHeight() >= paddle.getYPos()
                && ball.getYPos() + ball.getHeight() < paddle.getYPos() + paddle.getHeight())){
            if(ball.getXPos() <= paddle.getXPos()+paddle.getWidth() - Math.abs(ball.getXSpeed())){
                ball.setYSpeed(ball.getYSpeed() * -1);
            } else {
                ball.setXSpeed(ball.getXSpeed() * -1);
                if(ball.getYSpeed() == 0){
                    ball.setYSpeed((int)((Math.random() * 10 - 5) * 1.5));
                }
            }   
        }
    }
    public void collideRight(Ball ball, Paddle paddle){
        if(ball.getXPos() + ball.getWidth() >= paddle.getXPos() + Math.abs(ball.getXSpeed())
            && (ball.getYPos() >= paddle.getYPos() 
                && ball.getYPos() <= paddle.getYPos() + paddle.getHeight() 
                || ball.getYPos() + ball.getHeight() >= paddle.getYPos()
                && ball.getYPos() + ball.getHeight() < paddle.getYPos() + paddle.getHeight())){
            if(ball.getXPos() + ball.getXSpeed() >= paddle.getXPos() - Math.abs(ball.getXSpeed())){
                ball.setYSpeed(ball.getYSpeed() * -1);
            } else {
                ball.setXSpeed(ball.getXSpeed() * -1);
                if(ball.getYSpeed() == 0){
                    ball.setYSpeed((int)((Math.random() * 10 - 5) * 1.5));
                }
            }   
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public class RedrawTimer extends AnimationTimer {
        int direction;

        @Override
        public void handle(long now) {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.clearRect(0, 0, WIDTH, HEIGHT);
            gc.setFont(new Font("Verdana", 14));
            gc.strokeText("Left Score:" + leftscore, 50, 550);
            gc.strokeText("Right Score:" + rightscore, 50,580);
            
            if(ball.getYPos() <= 0){
                if(ball.getXSpeed() == 0){
                    ball.setXSpeed((int)((Math.random() * 10 - 5) * 1.5));
                }
                ball.setYSpeed(ball.getYSpeed() * -1);
            }
            if(ball.getYPos() + ball.getHeight() >= HEIGHT){
                if(ball.getXSpeed() == 0){
                    ball.setXSpeed((int)((Math.random() * 10 - 5) * 1.5));
                }
                ball.setYSpeed(ball.getYSpeed() * -1);
            }
            collideLeft(ball, left);
            collideRight(ball, right);
            //check for ball collision with the top and bottom "wall" and the paddles
            ball.update(canvas);
            left.update(canvas);
            right.update(canvas);
            
            ball.draw(canvas, ball.getColor());
            left.draw(canvas, left.getColor());
            right.draw(canvas, right.getColor());
            
            if(ball.getXPos() <= 0){
                rightscore++;
                ball = new Ball(400, 300, 20, 20, ball.getColor(), (int)((Math.random() * 10 - 5) * 1.5), (int)((Math.random() * 10 - 5) * 1.5));
                if(ball.getXSpeed() == 0){
                    ball.setXSpeed((int)((Math.random() * 10 - 5) * 1.5));
                }
            }
            if(ball.getXPos() + ball.getWidth() >= WIDTH){
                leftscore++;
                ball = new Ball(400, 300, 20, 20, ball.getColor(), (int)((Math.random() * 10 - 5) * 1.5), (int)((Math.random() * 10 - 5) * 1.5));
                if(ball.getXSpeed() == 0){
                    ball.setXSpeed((int)((Math.random() * 10 - 5) * 1.5));
                }
            }
            //check to see if the ball hits the left or right walls.
            //  If so, reset the ball in the middle and adjust the score


        }
    }
}

