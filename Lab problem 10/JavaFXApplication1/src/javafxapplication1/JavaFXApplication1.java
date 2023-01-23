/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 2018-2-60-033
 */
public class JavaFXApplication1 extends Application {
    public Label lbl1;
    public Label lbl2;
    public int count1;
    public int count2;
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        Button btn2 = new Button();
        
        btn1.setText("Button1");
        btn2.setText("Button2");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                count1++;
                lbl1.setText("pressed" +count1);
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                count2++;
                lbl2.setText("pressed" +count2);
            }
        });
        lbl1 = new Label();
        lbl1.setText("Pressed" +count1);
        
        lbl2 = new Label();
        lbl2.setText("Pressed" +count2);
        
        GridPane root = new GridPane();
        root.add(btn1,0,0);
        root.add(btn2,0,2);
        
        root.add(lbl1,1,0);
        root.add(lbl2,1,2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("First GUI Application");
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
