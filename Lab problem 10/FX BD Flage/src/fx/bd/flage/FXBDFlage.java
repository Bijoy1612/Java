/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.bd.flage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author 2018-2-60-033
 */
public class FXBDFlage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Circle c = new Circle(270,200,60);
       c.setFill(Color.RED);
       Rectangle r = new Rectangle(100,100,350,200);
       r.setFill(Color.GREEN);
       
       
       
               
        Pane root = new Pane();
        root.getChildren().add(r);
        root.getChildren().add(c);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Our flag");
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
