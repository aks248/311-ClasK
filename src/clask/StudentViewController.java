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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author jr110
 */
public class StudentViewController implements Initializable {
    
    
    private static ClaskApp mainInstance;
    
    
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private Label userLabel;
    @FXML
    private Label courseLabel;
    @FXML
    private Label roomLabel;
    @FXML
    private Button submitQ;
    @FXML
    private Button submitA;
    
    private String newText = "";
        
    public StudentViewController(){
        mainInstance = ClaskApp.getInstance();
        
    }
    
    @FXML
    private void handleLogOutButtonAction(ActionEvent event) throws IOException {
        boolean result = ConfirmationBox.displayConfirm("Logout request", "Are you sure you want to logout?");
        if (result){
            Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/UserSelect.fxml"));
            Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
            Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_Stage.setScene(loginPageScene);
            app_Stage.show();
        }
        
        else;
    }
    
    @FXML
    private void handleChangeRoomButtonAction(ActionEvent event) throws IOException {
        boolean result = ConfirmationBox.displayConfirm("Room Change", "Are you sure you want to change rooms?");
        if (result){
            Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/RoomSelect.fxml"));
            Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
            Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_Stage.setScene(loginPageScene);
            app_Stage.show();
        }
        
        else;
    }
    
    
    @FXML
    private void enterQA(ActionEvent event) throws IOException {
        setNewText(newText + "\n" + textField.getText());
        textArea.setText(getNewText());
        textField.clear();
    } 
    

    /**
     * Initializes the controller class.
     * 
     * 
     * @param url
     * @param rb
     */    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userLabel.setText(mainInstance.getCurrentUser());
        courseLabel.setText(mainInstance.getCurrentCourse());
        roomLabel.setText("Room #" + mainInstance.getCurrentRoomNumber());
    } 

    /**
     * @return the text
     */
    public String getNewText() {
        return newText;
    }

    /**
     * @param text the text to set
     */
    public void setNewText(String newText) {
        this.newText = newText;
    }
  
   
       
}
