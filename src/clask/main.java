/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clask;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Instructor;
import model.Student;

/**
 *
 * @author jr110
 */
public class main extends Application {
    
    ObservableList<Student> studentData = FXCollections.observableArrayList();
    ObservableList<Instructor> instructorData = FXCollections.observableArrayList();
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("UserSelect.fxml"));
        stage.setTitle("Clask");
        Scene scene = new Scene(root,600,400);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        //studentData.add(new Student("Jeff", "Rowe", "jmr202", "pass3", "999001"));
        
    }
    
    
}
