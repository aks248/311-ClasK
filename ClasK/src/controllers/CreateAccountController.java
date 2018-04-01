package controllers;

import clask.ClaskApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import models.UserDatabase;

public class CreateAccountController {
    private static ClaskApp mainInstance;
    private String username;
    private String password;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorMessageUser;
    @FXML
    private Label errorMessagePass;

    public CreateAccountController() {
        mainInstance = ClaskApp.getInstance();
    }

    @FXML
    private void initialize() {}

    public boolean validateAccount() {
        boolean flag = false;
        username = usernameField.getText();
        if (username.length() == 0 || username.equals("")) {
            errorMessageUser.setText("ERROR: Username cannot be empty.");
            flag = true;
        } else if (username.length() < 3 || username.length() > 20) {
            errorMessageUser.setText("ERROR: Username must be between 3-20 characters.");
            flag = true;
        } else if (UserDatabase.containsUser(username)) {
            errorMessageUser.setText("ERROR: Username already exists.");
            flag = true;
        } else {
            errorMessageUser.setText("");
        }

        password = passwordField.getText();
        if (password.length() == 0 || password.equals("")) {
            errorMessagePass.setText("ERROR: Password cannot be empty.");
            flag = true;
        } else if (password.length() < 3 || password.length() > 20) {
            errorMessagePass.setText("ERROR: Password must be between 3-20 characters.");
            flag = true;
        } else {
            errorMessagePass.setText("");
        }
        if (flag) {
            return false;
        }

        return true;
    }

    public void createStudent() {
        if (validateAccount()) {
            UserDatabase.addAccount(username, password, "student");
            try {
                mainInstance.setAccountMessage(true);
                mainInstance.switchScenes("InitialLogin");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void createInstructor() {
        if (validateAccount()) {
            UserDatabase.addAccount(username, password, "instructor");
            try {
                mainInstance.setAccountMessage(true);
                mainInstance.switchScenes("InitialLogin");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
