/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainbowcolor;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2018-2-60-037
 */
public class RainbowColor extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn = new Button("!");
        
        Circle[] circles = new Circle[7];
        double n = 200;
        for(int i=0; i<7; i++)
        {
            circles[i] = new Circle(n);
            n=n-30;
            circles[i].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
        }
        btn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) {
                for(int i=0; i<7; i++)
                    circles[i].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
            }
                
        });
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                for(int i=0; i<7; i++)
                                    circles[i].setFill(Color.color(new Random().nextDouble(),new Random().nextDouble(),new Random().nextDouble()));
                            }
                        });
                        
                        Thread.sleep(16);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(RainbowColor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
        
        
        
        StackPane root = new StackPane();
        for(int i=0;i<7;i++)
            root.getChildren().add(circles[i]);
        Scene scene = new Scene(root, 500, 500);
        BorderPane root2 = new BorderPane();
        BorderPane root3 = new BorderPane();
        root3.setCenter(btn);
        root2.setBottom(root3);
        root.getChildren().add(root2);
        
        
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
