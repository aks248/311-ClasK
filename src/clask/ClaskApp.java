/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clask;


import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jr110
 */
public class ClaskApp extends Application {
    
    private static ClaskApp instance;
    
    private final StringProperty currentUser = new SimpleStringProperty();
    private final StringProperty userType = new SimpleStringProperty();
    private final StringProperty userFirstName = new SimpleStringProperty(); 
    private final StringProperty currentRoomNumber = new SimpleStringProperty();
    private final StringProperty currentCourse = new SimpleStringProperty();
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/UserSelect.fxml"));
        stage.setTitle("Clask");
        Scene scene = new Scene(root,1200,800);
        stage.setScene(scene);
        stage.show();
    }
    
    public ClaskApp(){
        instance = this;          
    }
    
    public static ClaskApp getInstance() {
        return instance;
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);    
    }
    
     public StringProperty userFirstNameProperty() {
        return userFirstName;
    }

    public final String getUserFirstName() {
        return userFirstNameProperty().get();
    }

    public final void setUserFirstName(String userFirstName) {
       userFirstNameProperty().set(userFirstName);
    }
    
    public StringProperty currentUserProperty() {
        return currentUser ;
    }

    public final String getCurrentUser() {
        return currentUserProperty().get();
    }

    public final void setCurrentUser(String currentUser) {
        currentUserProperty().set(currentUser);
    }
    
    public StringProperty userTypeProperty() {
        return userType ;
    }

    public final String getUserType() {
        return userTypeProperty().get();
    }

    public final void setUserType(String userType) {
        userTypeProperty().set(userType);
    }
    
    public StringProperty currentRoomNumberProperty() {
        return currentRoomNumber ;
    }

    public final String getCurrentRoomNumber() {
        return currentRoomNumberProperty().get();
    }

    public final void setCurrentRoomNumber(String currentRoomNumber) {
        currentRoomNumberProperty().set(currentRoomNumber);
    }
    
    public StringProperty currentCourseProperty() {
        return currentCourse ;
    }

    public final String getCurrentCourse() {
        return currentCourseProperty().get();
    }

    public final void setCurrentCourse(String currentCourse) {
        currentCourseProperty().set(currentCourse);
    }
}