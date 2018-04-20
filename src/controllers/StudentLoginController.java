package controllers;

import clask.ClaskApp;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import models.Course;
import models.CourseDatabase;
import javafx.scene.control.SingleSelectionModel;

public class StudentLoginController {

    private static ClaskApp mainInstance;
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
    private Label errorMessagePassword;

    public StudentLoginController() {
        mainInstance = ClaskApp.getInstance();
    }

    @FXML
    public void authenticate() {
        boolean flag = false;
        String course_input = courseName.getText();
        String pass_input = coursePassword.getText();
        /*
        mainInstance.setCurrentRoomNumber(getCoursesById(i).rmNum);
        mainInstance.setCurrentCourse(getCoursesById(i).crsName);
        */


        if (!CourseDatabase.containsCourse(course_input)) {
            errorMessageCourse.setText("ERROR: Incorrect course name.");
            flag = true;
        }
        if (!CourseDatabase.authenticatePassword(course_input, pass_input)) {
            errorMessagePassword.setText("ERROR: Incorrect password.");
        } else {
            flag = false;
            enterLecture();
        }
    }

    @FXML
    private void initialize() {
        courseRoom.getItems().clear();
        courseRoom.getItems().addAll(CourseDatabase.getRoomNumbers());
    }

    @FXML
    public void enterLecture() {
        try {
            mainInstance.switchScenes("StudentInterface");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
