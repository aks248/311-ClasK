package controllers;

import clask.ClaskApp;
import static controllers.CreateAccountController.getMainInstance;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Optional;
import javafx.event.ActionEvent;


public class InstructorViewController {
    private static ClaskApp mainInstance;
    @FXML
    private Label userLabel;
    @FXML
    private Label courseLabel;
    @FXML
    private Label roomLabel;
    


    public InstructorViewController() {
        mainInstance = ClaskApp.getInstance();
    }
    
    @FXML
    private void initialize() {
    userLabel.setText(mainInstance.getCurrentInstructor().getInstructorName());
    courseLabel.setText(mainInstance.getCurrentCourse().getCourseName());
    roomLabel.setText(("Room #" + mainInstance.getCurrentCourse().getRoomNum()));
    }
    
    @FXML
    private void handleInstructorLogOutButtonAction(ActionEvent event) throws IOException, Exception {
        boolean result = ConfirmationBox.displayConfirm("Logout request", "Are you sure you want to logout?");
        if (result){
            getMainInstance().switchScenes("InitialLogin");
        }
        
        else;
    }
    
    @FXML
    private void handleChangeRoomButtonAction(ActionEvent event) throws IOException, Exception {
        boolean result = ConfirmationBox.displayConfirm("Room Change", "Are you sure you want to change rooms?");
        if (result){
            getMainInstance().switchScenes("InstructorLogin");
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
