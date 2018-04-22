package controllers;

import clask.ClaskApp;
import static controllers.CreateAccountController.getMainInstance;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class InstructorLoginController
{
    private static ClaskApp mainInstance;
    private static SerializedCollection serialized;
    @FXML
    private TextField courseName;
    @FXML
    private PasswordField coursePassword;
    @FXML
    private ComboBox courseRoom;
    @FXML
    private Button enterLecture;
    @FXML
    private Label errorMessageCourse;
    @FXML
    private Label errorMessageRoom;
    @FXML
    private Label errorMessagePassword;
    @FXML
    private Label instructorLoginWelcome;
    String curFirstName;


    public InstructorLoginController() {
        mainInstance = ClaskApp.getInstance();
        serialized = SerializedCollection.getInstance();
        curFirstName = mainInstance.getCurrentInstructor().getInstructorFirstName();
    }

    @FXML
    private void initialize() {
        instructorLoginWelcome.setText("Welcome " + curFirstName + "!  Please login to course to continue.");
        courseRoom.getItems().removeAll(courseRoom.getItems());
        courseRoom.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        courseRoom.getSelectionModel().select("1");
         
    }

    @FXML
    public void authenticateCourse() {
        boolean courseFlag = false;
        String course_input = courseName.getText();
        String pass_input = coursePassword.getText();
        String room_input = (String) courseRoom.getSelectionModel().getSelectedItem();
        
        if (course_input.length() == 0 || course_input.equals("")) {
            errorMessageCourse.setText("ERROR: Course name cannot be empty.");
            courseFlag = true;
        }
        
        else if(!serialized.checkIfCourseNameExist(course_input)){
            errorMessageCourse.setText("ERROR: Course name does not exist.");
            courseFlag = true;
        }
               
        else if (!serialized.verifyRoomNumber(course_input, room_input)){
            errorMessageRoom.setText("ERROR: Room does not match course.");
            courseFlag = true;
        }
        
        else if (pass_input.length() == 0 || pass_input.equals("")) {
                errorMessagePassword.setText("ERROR: Password cannot be empty.");
                courseFlag = true;
        } 
        else {
            errorMessageCourse.setText("");
            errorMessageRoom.setText("");
            errorMessagePassword.setText("");
        }
        
        if(!courseFlag){
            for(int i = 0; i < mainInstance.getListOfCourses().size(); i++){
                if(mainInstance.getListOfCourses().get(i).authenticate(course_input, room_input, pass_input)){
                    mainInstance.setCurrentCourse(mainInstance.getListOfCourses().get(i));
                    System.out.println(mainInstance.getCurrentCourse().getCourseName());
                    try {
                    mainInstance.switchScenes("InstructorInterface");
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        else;
        errorMessagePassword.setText("ERROR: Incorrect password.");
        }
    
    @FXML
    public void createCourse() {
        try {
            mainInstance.switchScenes("CreateCourse");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void handleInstructorLoginCancelButtonAction(ActionEvent event) throws IOException, Exception {
        boolean result = ConfirmationBox.displayConfirm("Logout request", "Are you sure you want to exit?");
        if (result){
            getMainInstance().switchScenes("InitialLogin");
        }
        
        else;
    }
    
    /**
     * @return the serialized
     */
    public static SerializedCollection getSerialized() {
        return serialized;
    }

    /**
     * @param aSerialized the serialized to set
     */
    public static void setSerialized(SerializedCollection aSerialized) {
        serialized = aSerialized;
    }
}
