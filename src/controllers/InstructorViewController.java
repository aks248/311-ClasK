package controllers;

import clask.ClaskApp;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Optional;
import javafx.event.ActionEvent;
import models.Message;


public class InstructorViewController {
    private static ClaskApp mainInstance;
    @FXML
    private Label userLabel;
    @FXML
    private Label courseLabel;
    @FXML
    private Label roomLabel;
    
    
     @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private Button submitA;
    @FXML
    private Button topic1Btn;
    @FXML
    private Button topic2Btn;
    @FXML
    private Button topic3Btn;
    @FXML
    private Button topic4Btn;
    @FXML
    private Button topic5Btn;
    @FXML
    private Button topic6Btn;
    @FXML
    private Button topic7Btn;
    @FXML
    private Button topic8Btn;
    private int currentTopicSelected = 0;
    private String text = "";

    public InstructorViewController() {
        mainInstance = ClaskApp.getInstance();
    }
    
    @FXML
    private void resetButtonColor(){
        getTopic1Btn().setStyle("");
        getTopic2Btn().setStyle("");
        getTopic3Btn().setStyle("");
        getTopic4Btn().setStyle("");
        getTopic5Btn().setStyle("");
        getTopic6Btn().setStyle("");
        getTopic7Btn().setStyle("");
        getTopic8Btn().setStyle("");
    }
    
    @FXML
    private void chooseTopic1(){
        this.resetButtonColor();
        getTopic1Btn().setStyle("-fx-background-color: Blue");
        this.setCurrentTopicSelected(0);
    }
    
    @FXML
    private void chooseTopic2(){
        this.resetButtonColor();
        getTopic2Btn().setStyle("-fx-background-color: Blue");
        this.setCurrentTopicSelected(1);
    }
    
    @FXML
    private void chooseTopic3(){
        this.resetButtonColor();
        getTopic3Btn().setStyle("-fx-background-color: Blue");
        this.setCurrentTopicSelected(2);
    }
    
    @FXML
    private void chooseTopic4(){
        this.resetButtonColor();
        getTopic4Btn().setStyle("-fx-background-color: Blue");
        this.setCurrentTopicSelected(3);
    }
    
    @FXML
    private void chooseTopic5(){
        this.resetButtonColor();
        getTopic5Btn().setStyle("-fx-background-color: Blue");
        this.setCurrentTopicSelected(4);
    }
    
    @FXML
    private void chooseTopic6(){
        this.resetButtonColor();
        getTopic6Btn().setStyle("-fx-background-color: Blue");
        this.setCurrentTopicSelected(5);
    }
    
    @FXML
    private void chooseTopic7(){
        this.resetButtonColor();
        getTopic7Btn().setStyle("-fx-background-color: Blue");
        this.setCurrentTopicSelected(6);
    }
    
    @FXML
    private void chooseTopic8(){
        this.resetButtonColor();
        getTopic8Btn().setStyle("-fx-background-color: Blue");
        this.setCurrentTopicSelected(7);
    }
    
    @FXML
    private void initialize() {
        getUserLabel().setText(getMainInstance().getCurrentInstructor().getInstructorName());
        getCourseLabel().setText(getMainInstance().getCurrentCourse().getCourseName());
        getRoomLabel().setText(("Room #" + getMainInstance().getCurrentCourse().getRoomNum()));
        getTopic1Btn().setStyle("-fx-background-color: Blue");
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
    public void enterA() {
        setText(getText() + "\n" + "A - " + getTextField().getText());
        getTextArea().setText(getText());
        //this.addMessageToTopic("Answer--",(this.getText()), "-Posted by student" );
        getTextField().clear();
    }
    
    @FXML
    public void addMessageToTopic(Message messageBody){
        switch (getCurrentTopicSelected()) {
            case 0:
                getMainInstance().getTopic1().getMessages().add(messageBody);
                break;
            case 1:
                getMainInstance().getTopic2().getMessages().add(messageBody);
                break;
            case 2:
                getMainInstance().getTopic3().getMessages().add(messageBody);
                break;
            case 3:
                getMainInstance().getTopic4().getMessages().add(messageBody);
                break;
            case 4:
                getMainInstance().getTopic5().getMessages().add(messageBody);
                break;
            case 5:
                getMainInstance().getTopic6().getMessages().add(messageBody);
                break;
            case 6:
                getMainInstance().getTopic7().getMessages().add(messageBody);
                break;
            case 7:
                getMainInstance().getTopic8().getMessages().add(messageBody);
                break;
            default:
                break;
        }
        
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

    /**
     * @return the mainInstance
     */
    public static ClaskApp getMainInstance() {
        return mainInstance;
    }

    /**
     * @param aMainInstance the mainInstance to set
     */
    public static void setMainInstance(ClaskApp aMainInstance) {
        mainInstance = aMainInstance;
    }

    /**
     * @return the userLabel
     */
    public Label getUserLabel() {
        return userLabel;
    }

    /**
     * @param userLabel the userLabel to set
     */
    public void setUserLabel(Label userLabel) {
        this.userLabel = userLabel;
    }

    /**
     * @return the courseLabel
     */
    public Label getCourseLabel() {
        return courseLabel;
    }

    /**
     * @param courseLabel the courseLabel to set
     */
    public void setCourseLabel(Label courseLabel) {
        this.courseLabel = courseLabel;
    }

    /**
     * @return the roomLabel
     */
    public Label getRoomLabel() {
        return roomLabel;
    }

    /**
     * @param roomLabel the roomLabel to set
     */
    public void setRoomLabel(Label roomLabel) {
        this.roomLabel = roomLabel;
    }

    /**
     * @return the topic1Btn
     */
    public Button getTopic1Btn() {
        return topic1Btn;
    }

    /**
     * @param topic1Btn the topic1Btn to set
     */
    public void setTopic1Btn(Button topic1Btn) {
        this.topic1Btn = topic1Btn;
    }

    /**
     * @return the topic2Btn
     */
    public Button getTopic2Btn() {
        return topic2Btn;
    }

    /**
     * @param topic2Btn the topic2Btn to set
     */
    public void setTopic2Btn(Button topic2Btn) {
        this.topic2Btn = topic2Btn;
    }

    /**
     * @return the topic3Btn
     */
    public Button getTopic3Btn() {
        return topic3Btn;
    }

    /**
     * @param topic3Btn the topic3Btn to set
     */
    public void setTopic3Btn(Button topic3Btn) {
        this.topic3Btn = topic3Btn;
    }

    /**
     * @return the topic4Btn
     */
    public Button getTopic4Btn() {
        return topic4Btn;
    }

    /**
     * @param topic4Btn the topic4Btn to set
     */
    public void setTopic4Btn(Button topic4Btn) {
        this.topic4Btn = topic4Btn;
    }

    /**
     * @return the topic5Btn
     */
    public Button getTopic5Btn() {
        return topic5Btn;
    }

    /**
     * @param topic5Btn the topic5Btn to set
     */
    public void setTopic5Btn(Button topic5Btn) {
        this.topic5Btn = topic5Btn;
    }

    /**
     * @return the topic6Btn
     */
    public Button getTopic6Btn() {
        return topic6Btn;
    }

    /**
     * @param topic6Btn the topic6Btn to set
     */
    public void setTopic6Btn(Button topic6Btn) {
        this.topic6Btn = topic6Btn;
    }

    /**
     * @return the topic7Btn
     */
    public Button getTopic7Btn() {
        return topic7Btn;
    }

    /**
     * @param topic7Btn the topic7Btn to set
     */
    public void setTopic7Btn(Button topic7Btn) {
        this.topic7Btn = topic7Btn;
    }

    /**
     * @return the topic8Btn
     */
    public Button getTopic8Btn() {
        return topic8Btn;
    }

    /**
     * @param topic8Btn the topic8Btn to set
     */
    public void setTopic8Btn(Button topic8Btn) {
        this.topic8Btn = topic8Btn;
    }

    /**
     * @return the currentTopicSelected
     */
    public int getCurrentTopicSelected() {
        return currentTopicSelected;
    }

    /**
     * @param currentTopicSelected the currentTopicSelected to set
     */
    public void setCurrentTopicSelected(int currentTopicSelected) {
        this.currentTopicSelected = currentTopicSelected;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the textField
     */
    public TextField getTextField() {
        return textField;
    }

    /**
     * @param textField the textField to set
     */
    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    /**
     * @return the textArea
     */
    public TextArea getTextArea() {
        return textArea;
    }

    /**
     * @param textArea the textArea to set
     */
    public void setTextArea(TextArea textArea) {
        this.textArea = textArea;
    }

   

    /**
     * @return the submitA
     */
    public Button getSubmitA() {
        return submitA;
    }

    /**
     * @param submitA the submitA to set
     */
    public void setSubmitA(Button submitA) {
        this.submitA = submitA;
    }
}
