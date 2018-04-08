/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clask;

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
 * FXML Controller class
 *
 * @author jr110
 */
public class InstructorViewController implements Initializable {
    
    private static ClaskApp mainInstance;
    
    @FXML
    private Label userLabel;
    @FXML
    private Label courseLabel;
    @FXML
    private Label roomLabel;
    
    public InstructorViewController(){
        mainInstance = ClaskApp.getInstance();
    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        userLabel.setText(mainInstance.getCurrentUser());
        courseLabel.setText(mainInstance.getCurrentCourse());
        roomLabel.setText("Room #" + mainInstance.getCurrentRoomNumber());
    } 
    
    @FXML
    private void handleInstructorLogOutButtonAction(ActionEvent event) throws IOException {
       Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/UserSelect.fxml"));
               Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
               Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
               app_Stage.setScene(loginPageScene);
               app_Stage.show();
    }
    
}
