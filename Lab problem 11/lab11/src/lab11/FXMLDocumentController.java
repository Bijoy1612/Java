/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import static sun.java2d.cmm.ColorTransform.Out;

public class FXMLDocumentController {

    @FXML
    private TextField titile;

    @FXML
    private TextField id;

    @FXML
    private TextField credit;

    @FXML
    private Button ok;

    @FXML
    void handleButtonAction(ActionEvent event) throws FileNotFoundException {
        
        File outFile = new File("Courses.text");
        FileOutputStream outStream = new FileOutputStream(outFile,true);
        PrintWriter output = new PrintWriter(outStream);
        output.println(id.getText()+" " +titile.getText()+" "+credit.getText());
        output.close();
        
        

    }

}
