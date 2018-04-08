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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 *
 * @author jr110
 */
public class FXMLLoginController implements Initializable {
    
      
    private static ClaskApp mainInstance;
    
    @FXML
    private Label loginWarningLabel;
    @FXML
    private Label loginWelcomeLabel;
    @FXML
    private TextField userField;
    @FXML
    private PasswordField passwordField;
    
    private clask.Student[] students;
    private Instructor[] instructors;
    private Course[] courses;
    
    
    //private static String userType;
    
    public FXMLLoginController() {
        mainInstance = ClaskApp.getInstance();
        
        
        createUsers();
        
    }
    
    private void createUsers(){
        students = new Student[] { //Manual student registration; testing purposes
            new Student("Adam", "Smith", "as001", "pass", "0001"),
            new Student("Ian", "Roach","ir002", "pass2", "0002"),
            new Student("Jeffrey", "Rowe", "jmr202", "pass3", "0003")
        };
         
        instructors = new Instructor[] {//Manual instructor registartion; testing purposes
            new Instructor("Richard", "Lomotey", "rkl5137", "pass4", "5137")
        };
        
    }
    
    
    
    
    @FXML
    private void handleStudentLoginButtonAction(ActionEvent event) throws IOException {
        mainInstance.setUserType("s");
        
        Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
        Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_Stage.setScene(loginPageScene);
        app_Stage.show();
    }
    
    @FXML
    private void handleInstructorLoginButtonAction(ActionEvent event) throws IOException {
        
        mainInstance.setUserType("i");
        Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
        Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_Stage.setScene(loginPageScene);
        app_Stage.show();
    }
    
    @FXML
    private void handleLoginBackButtonAction(ActionEvent event) throws IOException {
              
        Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/UserSelect.fxml"));
        Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
        Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_Stage.setScene(loginPageScene);
        app_Stage.show();
    }
    
    @FXML
    private void handleSignInButtonAction(ActionEvent event) throws IOException {
        String userEntered = userField.getText();
        String passEntered = passwordField.getText();
       
        
       if(mainInstance.getUserType().equals("s")){
           int studentNumber = students.length;
           System.out.println(studentNumber);
           boolean sValid = false;
           for(int i = 0; i < studentNumber; i++) {
              if(getStudentById(i).authenticate(userEntered, passEntered))
               {
                   mainInstance.setCurrentUser(getStudentById(i).getStudentName());
                   mainInstance.setUserFirstName(getStudentById(i).getFirstName());
                   System.out.println(mainInstance.getCurrentUser());
                   System.out.println(mainInstance.getUserFirstName());
   
                   sValid = true;
               }
           }
           if(sValid){
               Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/RoomSelect.fxml"));
               Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
               Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
               app_Stage.setScene(loginPageScene);
               app_Stage.show();
           }
           else{
               loginWarningLabel.setText("Invalid user name or password");
           }
       } else {                
       }                
                        
        if(mainInstance.getUserType().equals("i")){
                        int instructorNumber = getInstructors().length;
                        boolean iValid = false;
                        for(int i = 0; i < instructorNumber; i++) {
                            if(getInstructorById(i).authenticate(userEntered, passEntered))
                            {
                                mainInstance.setCurrentUser(getInstructorById(i).getInstructorName());
                                iValid = true;
                            }
                        }
                        if(iValid){
                                Parent loginPageParent = FXMLLoader.load(getClass().getResource("/view/RoomSelect.fxml"));
                                Scene loginPageScene = new Scene(loginPageParent, 1200, 800);
                                Stage app_Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                                app_Stage.setScene(loginPageScene);
                                app_Stage.show();
                            }
                        else{    
                        
                        }
             
        }                
        
    }                
                
            
        
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    } 
    
    public Student[] getStudents() {
        return students;
    }
    
    /**
     * @param i student index number
     * @return student of index i
     */
    public Student getStudentById(int i) {
        return students[i];
    }
    /**
     * @return the array of students
     */
    public Instructor[] getInstructors() {
        return instructors;
    }
    
    /**
     * @param i instructor index number
     * @return instructor of index i
     */
    public Instructor getInstructorById(int i) {
        return instructors[i];
    }
    
}
