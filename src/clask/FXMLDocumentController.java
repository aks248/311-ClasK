/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clask;

import model.Instructor;
import model.Student;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author jr110
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    @FXML
    private Label label;
    
    @FXML
    private void handleStudentLoginButtonAction(ActionEvent event) throws IOException {
        //model.userType = "s";
        Parent loginPageParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene loginPageScene = new Scene(loginPageParent, 600, 400);
        Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_Stage.setScene(loginPageScene);
        app_Stage.show();
        //System.out.println(model.userType);
    }
    
    @FXML
    private void handleInstructorLoginButtonAction(ActionEvent event) throws IOException {
        //model.userType = "i";
        Parent loginPageParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene loginPageScene = new Scene(loginPageParent, 600, 400);
        Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_Stage.setScene(loginPageScene);
        app_Stage.show();
    }
    
    @FXML
    private void handleLoginBackButtonAction(ActionEvent event) throws IOException {
        Parent loginPageParent = FXMLLoader.load(getClass().getResource("UserSelect.fxml"));
        Scene loginPageScene = new Scene(loginPageParent, 600, 400);
        Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_Stage.setScene(loginPageScene);
        app_Stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    
    
}
