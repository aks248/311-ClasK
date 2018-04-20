package controllers;

import clask.ClaskApp;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import models.Course;
import models.CourseDatabase;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class StudentViewController {

    private static ClaskApp mainInstance;
    
    @FXML
    private Label userLabel;
    @FXML
    private Label courseLabel;
    @FXML
    private Label roomLabel;
    
    @FXML
    private RadioButton rb1Y;
    @FXML
    private RadioButton rb1N;
    
    @FXML
    private Label understand1;
    @FXML
    private Label dontUnderstand1;
    @FXML
    private Label understand2;
    @FXML
    private Label dontUnderstand2;
    @FXML
    private Label understand3;
    @FXML
    private Label dontUnderstand3;
    @FXML
    private Label understand4;
    @FXML
    private Label dontUnderstand4;
    @FXML
    private Label understand5;
    @FXML
    private Label dontUnderstand5;
    @FXML
    private Label understand6;
    @FXML
    private Label dontUnderstand6;
    @FXML
    private Label understand7;
    @FXML
    private Label dontUnderstand7;
    @FXML
    private Label understand8;
    @FXML
    private Label dontUnderstand8;
    
    int understandCounter1 = 0;
    int dontUnderstandCounter1 = 0;
    int understandCounter2 = 0;
    int dontUnderstandCounter2 = 0;
    int understandCounter3 = 0;
    int dontUnderstandCounter3 = 0;
    int understandCounter4 = 0;
    int dontUnderstandCounter4 = 0;
    int understandCounter5 = 0;
    int dontUnderstandCounter5 = 0;
    int understandCounter6 = 0;
    int dontUnderstandCounter6 = 0;
    int understandCounter7 = 0;
    int dontUnderstandCounter7 = 0;
    int understandCounter8 = 0;
    int dontUnderstandCounter8 = 0;
    
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private Button submitQ;
    @FXML
    private Button submitA;
    String text = "";
    
    /* @Override
    public void initialize(URL url, ResourceBundle rb) {
        userLabel.setText(mainInstance.getCurrentUser());
        courseLabel.setText(mainInstance.getCurrentCourse());
        roomLabel.setText("Room #" + mainInstance.getCurrentRoomNumber());
    }
    */
    public StudentViewController() {
        /*
        mainInstance.userFirstNameProperty();
        mainInstance.currentCourseProperty();
        mainInstance.currentRoomNumberProperty();
        
        userLabel.setText(mainInstance.getUserFirstName());
        courseLabel.setText(mainInstance.getCurrentCourse());
        roomLabel.setText(mainInstance.getCurrentRoomNumber());
        */
        
        mainInstance = ClaskApp.getInstance();
    }

    @FXML
    private void initialize() {}
    
    @FXML
    private void handleLogOutButtonAction(ActionEvent event) throws IOException {
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
    public void understandSelect1() {
            dontUnderstandCounter1 = 0;
            understandCounter1 = 1;
            dontUnderstand1.setText(Integer.toString(dontUnderstandCounter1));
            understand1.setText(Integer.toString(understandCounter1));
    }
    
    @FXML
    public void dontUnderstandSelect1() {
            dontUnderstandCounter1 = 1;
            understandCounter1 = 0;
            dontUnderstand1.setText(Integer.toString(dontUnderstandCounter1));
            understand1.setText(Integer.toString(understandCounter1));
    }
    
    @FXML
    public void understandSelect2() {
            dontUnderstandCounter2 = 0;
            understandCounter2 = 1;
            dontUnderstand2.setText(Integer.toString(dontUnderstandCounter2));
            understand2.setText(Integer.toString(understandCounter2));
    }
    
    @FXML
    public void dontUnderstandSelect2() {
            dontUnderstandCounter2 = 1;
            understandCounter2 = 0;
            dontUnderstand2.setText(Integer.toString(dontUnderstandCounter2));
            understand2.setText(Integer.toString(understandCounter2));
    }
    
    @FXML
    public void understandSelect3() {
            dontUnderstandCounter3 = 0;
            understandCounter3 = 1;
            dontUnderstand3.setText(Integer.toString(dontUnderstandCounter3));
            understand3.setText(Integer.toString(understandCounter3));
    }
    
    @FXML
    public void dontUnderstandSelect3() {
            dontUnderstandCounter3 = 1;
            understandCounter3 = 0;
            dontUnderstand3.setText(Integer.toString(dontUnderstandCounter3));
            understand3.setText(Integer.toString(understandCounter3));
    }
    
    @FXML
    public void understandSelect4() {
            dontUnderstandCounter4 = 0;
            understandCounter4 = 1;
            dontUnderstand4.setText(Integer.toString(dontUnderstandCounter4));
            understand4.setText(Integer.toString(understandCounter4));
    }
    
    @FXML
    public void dontUnderstandSelect4() {
            dontUnderstandCounter4 = 1;
            understandCounter4 = 0;
            dontUnderstand4.setText(Integer.toString(dontUnderstandCounter4));
            understand4.setText(Integer.toString(understandCounter4));
    }
    
    @FXML
    public void understandSelect5() {
            dontUnderstandCounter5 = 0;
            understandCounter5 = 1;
            dontUnderstand5.setText(Integer.toString(dontUnderstandCounter5));
            understand5.setText(Integer.toString(understandCounter5));
    }
    
    @FXML
    public void dontUnderstandSelect5() {
            dontUnderstandCounter5 = 1;
            understandCounter5 = 0;
            dontUnderstand5.setText(Integer.toString(dontUnderstandCounter5));
            understand5.setText(Integer.toString(understandCounter5));
    }
    
    @FXML
    public void understandSelect6() {
            dontUnderstandCounter6 = 0;
            understandCounter6 = 1;
            dontUnderstand6.setText(Integer.toString(dontUnderstandCounter6));
            understand6.setText(Integer.toString(understandCounter6));
    }
    
    @FXML
    public void dontUnderstandSelect6() {
            dontUnderstandCounter6 = 1;
            understandCounter6 = 0;
            dontUnderstand6.setText(Integer.toString(dontUnderstandCounter6));
            understand6.setText(Integer.toString(understandCounter6));
    }
    
    @FXML
    public void understandSelect7() {
            dontUnderstandCounter7 = 0;
            understandCounter7 = 1;
            dontUnderstand7.setText(Integer.toString(dontUnderstandCounter7));
            understand7.setText(Integer.toString(understandCounter7));
    }
    
    @FXML
    public void dontUnderstandSelect7() {
            dontUnderstandCounter7 = 1;
            understandCounter7 = 0;
            dontUnderstand7.setText(Integer.toString(dontUnderstandCounter7));
            understand7.setText(Integer.toString(understandCounter7));
    }
    
    @FXML
    public void understandSelect8() {
            dontUnderstandCounter8 = 0;
            understandCounter8 = 1;
            dontUnderstand8.setText(Integer.toString(dontUnderstandCounter8));
            understand8.setText(Integer.toString(understandCounter8));
    }
    
    @FXML
    public void dontUnderstandSelect8() {
            dontUnderstandCounter8 = 1;
            understandCounter8 = 0;
            dontUnderstand8.setText(Integer.toString(dontUnderstandCounter8));
            understand8.setText(Integer.toString(understandCounter8));
    }

    @FXML
    public void enterQ() {
        text = text + "\n" + "Q - " + textField.getText();
        textArea.setText(text);
        textField.clear();
    }
    
    @FXML
    public void enterA() {
        text = text + "\n" + "A - " + textField.getText();
        textArea.setText(text);
        textField.clear();
    }
}