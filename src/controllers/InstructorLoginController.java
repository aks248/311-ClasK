package controllers;

import clask.ClaskApp;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import models.CourseDatabase;

public class InstructorLoginController
{
    private static ClaskApp mainInstance;
    @FXML
    private TextField courseName;
    @FXML
    private PasswordField coursePassword;
    @FXML
    private ComboBox courseRoom;
    @FXML
    private Label errorCourseName;
    @FXML
    private Label errorPassword;

    public InstructorLoginController() {
        mainInstance = ClaskApp.getInstance();
    }

    @FXML
    private void initialize() {
        courseRoom.getItems().clear();
        courseRoom.getItems().addAll(CourseDatabase.getAvailableRooms());
    }

    @FXML
    public void authenticate() {
        boolean flag = false;
        String course_name_input = courseName.getText();
        if (course_name_input.length() == 0 || course_name_input.equals("")) {
            errorCourseName.setText("ERROR: Course Name cannot be empty.");
            flag = true;
        } else if (CourseDatabase.containsCourse(course_name_input)) {
            errorCourseName.setText("ERROR: Course already exists.");
            flag = true;
        } else {
            errorCourseName.setText("");
        }

        String pass_input = coursePassword.getText();
        if (pass_input.length() == 0 || pass_input.equals("")) {
            errorPassword.setText("ERROR: Password cannot be empty");
            flag = true;
        } else if (pass_input.length() < 3 || pass_input.length() > 20) {
            errorPassword.setText("ERROR: Password must be between 3-20 characters.");
            flag = true;
        } else {
            errorPassword.setText("");
        }

        Integer room_number = (Integer)courseRoom.getValue();
        if (room_number == null) {
            flag = true;
        }

        if (!flag) {
            createCourse();
        }
    }

    @FXML
    public void createCourse() {
        try {
            mainInstance.switchScenes("InstructorInterface");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
