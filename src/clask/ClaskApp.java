package clask;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Course;
import models.Instructor;
import models.Student;
import models.Topic;


public class ClaskApp extends Application {
    private static ClaskApp instance;
    private static boolean showAccountMessage = false;
    private Stage pStage;
    private ArrayList<Student> listOfStudents;
    private ArrayList<Instructor> listOfInstructors;
    private Topic topic1;
    private Topic topic2;
    private Topic topic3;
    private Topic topic4;
    private Topic topic5;
    private Topic topic6;
    private Topic topic7;
    private Topic topic8;
    private ArrayList<Course> listOfCourses;
    private Student currentStudent;
    private Instructor currentInstructor;
    private Course currentCourse;
    
    
  
    

    public ClaskApp() {
        instance = this;
        listOfStudents = new ArrayList<>();
        listOfInstructors = new ArrayList<>();
        listOfCourses = new ArrayList<>();
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
    
    /**
     * @return the listOfCourses
     */
    public ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }

    /**
     * @param listOfCourses the listOfCourses to set
     */
    public void setListOfCourses(ArrayList<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }
    
    public Student getCurrentStudent(){
        return currentStudent;
    }
    
    public void setCurrentStudent(models.Student currentStudent){
        this.currentStudent = currentStudent;
    }
    
    public Instructor getCurrentInstructor(){
        return currentInstructor;
    }
    
    public void setCurrentInstructor(models.Instructor currentInstructor){
        this.currentInstructor = currentInstructor;
    }
    
    public Course getCurrentCourse(){
        return currentCourse;
    }
    
    public void setCurrentCourse(models.Course currentCourse){
        this.currentCourse = currentCourse;
    }

    /**
     * @return the topic1
     */
    public Topic getTopic1() {
        return topic1;
    }

    /**
     * @param topic1 the topic1 to set
     */
    public void setTopic1(Topic topic1) {
        this.topic1 = topic1;
    }

    /**
     * @return the topic2
     */
    public Topic getTopic2() {
        return topic2;
    }

    /**
     * @param topic2 the topic2 to set
     */
    public void setTopic2(Topic topic2) {
        this.topic2 = topic2;
    }

    /**
     * @return the topic3
     */
    public Topic getTopic3() {
        return topic3;
    }

    /**
     * @param topic3 the topic3 to set
     */
    public void setTopic3(Topic topic3) {
        this.topic3 = topic3;
    }

    /**
     * @return the topic4
     */
    public Topic getTopic4() {
        return topic4;
    }

    /**
     * @param topic4 the topic4 to set
     */
    public void setTopic4(Topic topic4) {
        this.topic4 = topic4;
    }

    /**
     * @return the topic5
     */
    public Topic getTopic5() {
        return topic5;
    }

    /**
     * @param topic5 the topic5 to set
     */
    public void setTopic5(Topic topic5) {
        this.topic5 = topic5;
    }

    /**
     * @return the topic6
     */
    public Topic getTopic6() {
        return topic6;
    }

    /**
     * @param topic6 the topic6 to set
     */
    public void setTopic6(Topic topic6) {
        this.topic6 = topic6;
    }

    /**
     * @return the topic7
     */
    public Topic getTopic7() {
        return topic7;
    }

    /**
     * @param topic7 the topic7 to set
     */
    public void setTopic7(Topic topic7) {
        this.topic7 = topic7;
    }

    /**
     * @return the topic8
     */
    public Topic getTopic8() {
        return topic8;
    }

    /**
     * @param topic8 the topic8 to set
     */
    public void setTopic8(Topic topic8) {
        this.topic8 = topic8;
    }
    
}

