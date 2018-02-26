package lab18j_list_of_references__winter_scene_project;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Name -
//Date -
//Class -
//Lab  -


public class GraphicsRunner extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Canvas canvas;

    public void start(Stage stage) {
        canvas = new Canvas();
        
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.setTitle("THE WINTER SCENE PROJECT");
        stage.show();
    }
    
    public static void main(String args[]) {
        launch(args);
    }
    
    public Canvas getCanvas() {
        return canvas;
    }
}