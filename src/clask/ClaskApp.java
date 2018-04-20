package clask;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.UserDatabase;
import models.CourseDatabase;
import models.Instructor;
import models.Student;


public class ClaskApp extends Application {
    private static ClaskApp instance;
    private static boolean showAccountMessage = false;
    private Stage pStage;
    private ArrayList<Student> listOfStudents;
    private ArrayList<Instructor> listOfInstructors;
    
    
  
    

    public ClaskApp() {
        instance = this;
        listOfStudents = new ArrayList<>();
        listOfInstructors = new ArrayList<>();
        UserDatabase.init();
        CourseDatabase.init();
    }

    public static void setAccountMessage(boolean flag) {
        if (flag) {
            setShowAccountMessage(true);
        } else {
            setShowAccountMessage(false);
        }
    }

    public static boolean getAccountMessageBoolean() {
        return isShowAccountMessage();
    }

    public static ClaskApp getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        setpStage(primaryStage);
        Parent root = FXMLLoader.load(getClass().getResource("/views/InitialLogin.fxml"));
        primaryStage.setTitle("Clask");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }

    public void switchScenes(String fxml_file) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/" + fxml_file + ".fxml"));
        getpStage().setScene(new Scene(root, 1200, 800));
        getpStage().show();
    }   

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(ClaskApp aInstance) {
        instance = aInstance;
    }

    /**
     * @return the showAccountMessage
     */
    public static boolean isShowAccountMessage() {
        return showAccountMessage;
    }

    /**
     * @param aShowAccountMessage the showAccountMessage to set
     */
    public static void setShowAccountMessage(boolean aShowAccountMessage) {
        showAccountMessage = aShowAccountMessage;
    }

    /**
     * @return the pStage
     */
    public Stage getpStage() {
        return pStage;
    }

    /**
     * @param pStage the pStage to set
     */
    public void setpStage(Stage pStage) {
        this.pStage = pStage;
    }

    /**
     * @return the listOfStudents
     */
    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    /**
     * @param listOfStudents the listOfStudents to set
     */
    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    
    /**
     * @return the listOfInstructors
     */
    public ArrayList<Instructor> getListOfInstructors() {
        return listOfInstructors;
    }

    /**
     * @param listOfInstructors the listOfInstructors to set
     */
    public void setListOfInstructors(ArrayList<Instructor> listOfInstructors) {
        this.listOfInstructors = listOfInstructors;
    }
    
}

