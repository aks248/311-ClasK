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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLRoomSelectController implements Initializable {
    
    
    private static ClaskApp mainInstance;
    
    @FXML
    private Label roomWarningLabel;
    @FXML
    private Label roomWelcomeLabel;
    @FXML
    private TextField roomField;
    @FXML
    private PasswordField roomPassField;
    @FXML
    private ComboBox roomChoiceComboBox;
    
    private Course[] courses;
    private static String currentRoomNumber;
    private static String currentCourse;

    public FXMLRoomSelectController(){
        mainInstance = ClaskApp.getInstance();
        createCourses();
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        roomChoiceComboBox.getItems().removeAll(roomChoiceComboBox.getItems());
        roomChoiceComboBox.getItems().addAll("1", "2", "3", "4", "5", "6");
        roomChoiceComboBox.getSelectionModel().select("1");
        roomWelcomeLabel.setText("Welcome " + mainInstance.getUserFirstName());
        // TODO
    }

@FXML
    private void handleRoomSelectButtonAction(ActionEvent event) throws IOException {
                    String roomSelected = (String) roomChoiceComboBox.getSelectionModel().getSelectedItem();
                    String roomPassEntered = roomPassField.getText();
                    int courseNumber = courses.length;
                    boolean rValid = false;
                    
                    for(int i = 0; i < courseNumber; i++) {
                        if(getCoursesById(i).authenticate(roomSelected, roomPassEntered))
                        {
                            rValid = true;
                            mainInstance.setCurrentRoomNumber(getCoursesById(i).rmNum);
                            mainInstance.setCurrentCourse(getCoursesById(i).crsName);
                        }
                    }
                    if(rValid){
                        if(mainInstance.getUserType().equals("s")) {
                            Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/StudentView.fxml"));
                            Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
                            Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            app_Stage.setScene(loginPageScene);
                            app_Stage.show();
                        }
                        else if(mainInstance.getUserType().equals("i")){
                            Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/InstructorView.fxml"));
                            Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
                            Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            app_Stage.setScene(loginPageScene);
                            app_Stage.show();
                            
                        }
                    }
                    else{
                        roomWarningLabel.setText("Invalid room number or password.");
                     
                    }    
                
        
               /* switch (model.userType) {               
                    case "s":
                        view.initFrame.iPanel.remove(view.initFrame.iPanel.classChooser);
                        view.initFrame.iPanel.getLogin();
                        view.initFrame.iPanel.login.stepLabel.setText("Student Login");
                        addLoginButtonListener();
                        break;
                    case "i":               
                        view.initFrame.iPanel.remove(view.initFrame.iPanel.classChooser);
                        view.initFrame.iPanel.getLogin();
                        view.initFrame.iPanel.login.stepLabel.setText("Instructor Login");
                        addLoginButtonListener();
                        break;
                }
                
        
} 
*/
    }
    
    
    
    private void createCourses(){
        courses = new Course[] {
        new Course("IST 311", "3", "room3")};
        
    }

    public Course[] getCourses() {
        return courses;
    }
    
    /**
     * @param i course index number
     * @return course of index i
     */
    public Course getCoursesById(int i) {
        return courses[i];
    }
    
    
    
}
