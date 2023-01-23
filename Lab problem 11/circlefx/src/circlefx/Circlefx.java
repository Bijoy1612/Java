/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlefx;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2018-2-60-033
 */
public class Circlefx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle [] circles = new Circle[7];
        circles[0] = new Circle(200);
        circles[0].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        
        circles[1] = new Circle(170);
        circles[1].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        
        circles[2] = new Circle(140);
        circles[2].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        
        circles[3] = new Circle(110);
        circles[3].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        
        circles[4] = new Circle(80);
        circles[4].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        
        circles[5] = new Circle(50);
        circles[5].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        
        circles[6] = new Circle(20);
        circles[6].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        
       
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 600, 500);
        root.getChildren().add(circles[0]);
        root.getChildren().add(circles[1]);
        root.getChildren().add(circles[2]);
        root.getChildren().add(circles[3]);
        root.getChildren().add(circles[4]);
        root.getChildren().add(circles[5]);
        root.getChildren().add(circles[6]);
        
        primaryStage.setTitle("Circle");
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
