/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationcircle2;

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
public class JavaFXApplicationcircle2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle [] circles = new Circle[7];
        int r = 300;
        for (int i = 0; i < 7; i++) {
            circles[i] = new Circle(r);
            r = r-40;
            circles[i].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        }
        
        StackPane root = new StackPane();
        for (int i = 0; i < 7; i++) {
             root.getChildren().add(circles[i]);
        }
        
        
        Scene scene = new Scene(root, 900, 750);
        
        primaryStage.setTitle("Circlessssssssssss");
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
