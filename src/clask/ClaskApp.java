package clask;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Course;
import models.Instructor;
import models.Message;
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
    private ArrayList<Message> messagesTp1;
    private ArrayList<Message> messagesTp2;
    private ArrayList<Message> messagesTp3;
    private ArrayList<Message> messagesTp4;
    private ArrayList<Message> messagesTp5;
    private ArrayList<Message> messagesTp6;
    private ArrayList<Message> messagesTp7;
    private ArrayList<Message> messagesTp8;
    private ArrayList<Course> listOfCourses;
    private Student currentStudent;
    private Instructor currentInstructor;
    private Course currentCourse;
    
    
  
    

    public ClaskApp() {
        instance = this;
        listOfStudents = new ArrayList<>();
        listOfInstructors = new ArrayList<>();
        listOfCourses = new ArrayList<>();
        messagesTp1 = new ArrayList<>();
        messagesTp2 = new ArrayList<>();
        messagesTp3 = new ArrayList<>();
        messagesTp4 = new ArrayList<>();
        messagesTp5 = new ArrayList<>();
        messagesTp6 = new ArrayList<>();
        messagesTp7 = new ArrayList<>();
        messagesTp8 = new ArrayList<>();
        
        
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
        Scene scene = new Scene(root, 1200, 800);
        scene.getStylesheets().add("/views/mainStyle.css");
        primaryStage.setTitle("Clask");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void switchScenes(String fxml_file) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/" + fxml_file + ".fxml"));
        Scene scene = new Scene(root, 1200, 800);
        scene.getStylesheets().add("/views/mainStyle.css");
        getpStage().setScene(scene);
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

    /**
     * @return the messagesTp1
     */
    public ArrayList<Message> getMessagesTp1() {
        return messagesTp1;
    }

    /**
     * @param messagesTp1 the messagesTp1 to set
     */
    public void setMessagesTp1(ArrayList<Message> messagesTp1) {
        this.messagesTp1 = messagesTp1;
    }

    /**
     * @return the messagesTp2
     */
    public ArrayList<Message> getMessagesTp2() {
        return messagesTp2;
    }

    /**
     * @param messagesTp2 the messagesTp2 to set
     */
    public void setMessagesTp2(ArrayList<Message> messagesTp2) {
        this.messagesTp2 = messagesTp2;
    }

    /**
     * @return the messagesTp3
     */
    public ArrayList<Message> getMessagesTp3() {
        return messagesTp3;
    }

    /**
     * @param messagesTp3 the messagesTp3 to set
     */
    public void setMessagesTp3(ArrayList<Message> messagesTp3) {
        this.messagesTp3 = messagesTp3;
    }

    /**
     * @return the messagesTp4
     */
    public ArrayList<Message> getMessagesTp4() {
        return messagesTp4;
    }

    /**
     * @param messagesTp4 the messagesTp4 to set
     */
    public void setMessagesTp4(ArrayList<Message> messagesTp4) {
        this.messagesTp4 = messagesTp4;
    }

    /**
     * @return the messagesTp5
     */
    public ArrayList<Message> getMessagesTp5() {
        return messagesTp5;
    }

    /**
     * @param messagesTp5 the messagesTp5 to set
     */
    public void setMessagesTp5(ArrayList<Message> messagesTp5) {
        this.messagesTp5 = messagesTp5;
    }

    /**
     * @return the messagesTp6
     */
    public ArrayList<Message> getMessagesTp6() {
        return messagesTp6;
    }

    /**
     * @param messagesTp6 the messagesTp6 to set
     */
    public void setMessagesTp6(ArrayList<Message> messagesTp6) {
        this.messagesTp6 = messagesTp6;
    }

    /**
     * @return the messagesTp7
     */
    public ArrayList<Message> getMessagesTp7() {
        return messagesTp7;
    }

    /**
     * @param messagesTp7 the messagesTp7 to set
     */
    public void setMessagesTp7(ArrayList<Message> messagesTp7) {
        this.messagesTp7 = messagesTp7;
    }

    /**
     * @return the messagesTp8
     */
    public ArrayList<Message> getMessagesTp8() {
        return messagesTp8;
    }

    /**
     * @param messagesTp8 the messagesTp8 to set
     */
    public void setMessagesTp8(ArrayList<Message> messagesTp8) {
        this.messagesTp8 = messagesTp8;
    }
    
}

