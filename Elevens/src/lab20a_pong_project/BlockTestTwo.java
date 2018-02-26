/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab20a_pong_project;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */

public class BlockTestTwo extends Application {
     private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        
        Block one = new Block();
        one.draw(canvas, one.getColor());

        Block two = new Block(350, 350, 15, 15, Color.RED);
        two.draw(canvas, two.getColor());

        Block three = new Block(450, 50, 20, 60, Color.GREEN);
        three.draw(canvas, three.getColor());
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        primaryStage.setTitle("Pong!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
