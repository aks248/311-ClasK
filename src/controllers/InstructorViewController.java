package controllers;

import clask.ClaskApp;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import models.Course;
import models.CourseDatabase;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class InstructorViewController {
    private static ClaskApp mainInstance;
    


    public InstructorViewController() {
        mainInstance = ClaskApp.getInstance();
    }
    
    @FXML
    private void initialize() {}
    
    @FXML
    private void handleInstructorLogOutButtonAction(ActionEvent event) throws IOException {
        boolean result = ConfirmationBox.displayConfirm("Logout request", "Are you sure you want to logout?");
        if (result){
            Parent loginPageParent = FXMLLoader.load(getClass().getResource("/views/InitialLogin.fxml"));
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
            Parent loginPageParent = FXMLLoader.load(getClass().getResource("/views/StudentLogin.fxml"));
            Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
            Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_Stage.setScene(loginPageScene);
            app_Stage.show();
        }
        
        else;
    }


    @FXML
    public void createNewTopic() {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Topics");
        dialog.setHeaderText("New Topic");
        dialog.setContentText("Please enter the new topic:");

        // Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            System.out.println("New Topic: " + result.get());
        }

        // The Java 8 way to get the response value (with lambda expression).
        result.ifPresent(name -> System.out.println("New Topic: " + name));
    }
}
