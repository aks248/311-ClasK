package controllers;

import clask.ClaskApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import models.UserDatabase;

public class LoginController
{
    private static ClaskApp mainInstance;
    @FXML
    private Label accountCreationMessage;
    @FXML
    private Label errorMessageUser;
    @FXML
    private Label errorMessagePass;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    public LoginController() {
        mainInstance = ClaskApp.getInstance();
    }

    @FXML
    private void initialize() {
        if (mainInstance.getAccountMessageBoolean()) {
            accountCreationMessage.setText("Account creation successful!");
        } else {
            accountCreationMessage.setText("");
        }
        mainInstance.setAccountMessage(false);
    }

    @FXML
    public void authenticate() {
        String user_input = usernameField.getText();
        if (user_input.length() == 0 || user_input.equals("")) {
            errorMessageUser.setText("ERROR: Username cannot be empty.");
        } else if (user_input.length() < 3 || user_input.length() > 20) {
            errorMessageUser.setText("ERROR: Invalid username. Username must be between 3-20 characters.");
        } else if (!UserDatabase.containsUser(user_input)) {
            errorMessageUser.setText("ERROR: Username does not exist.");
        } else {
            errorMessageUser.setText("");
        }

        String pass_input = passwordField.getText();
        if (UserDatabase.containsUser(user_input)) {
            if (pass_input.length() == 0 || pass_input.equals("")) {
                errorMessagePass.setText("ERROR: Password cannot be empty.");
            } else if (!UserDatabase.authenticatePassword(user_input, pass_input)) {
                errorMessagePass.setText("ERROR: Incorrect username or password.");
            } else if (UserDatabase.authenticatePassword(user_input, pass_input)) {
                errorMessagePass.setText("");
                // SUCCESSFUL LOGIN CODE HERE
                if (UserDatabase.getAccountType(user_input).equals("instructor")) {
                    try {
                        mainInstance.switchScenes("InstructorLogin");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (UserDatabase.getAccountType(user_input).equals("student")){
                    try {
                        mainInstance.switchScenes("StudentLogin");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @FXML
    public void createAccount() {
        try {
            mainInstance.switchScenes("CreateAccount");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
