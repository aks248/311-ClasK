package controllers;

import clask.ClaskApp;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import models.Message;

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
    private int currentTopicSelected = 0;
    
    private int understandCounter1 = 0;
    private int dontUnderstandCounter1 = 0;
    private int understandCounter2 = 0;
    private int dontUnderstandCounter2 = 0;
    private int understandCounter3 = 0;
    private int dontUnderstandCounter3 = 0;
    private int understandCounter4 = 0;
    private int dontUnderstandCounter4 = 0;
    private int understandCounter5 = 0;
    private int dontUnderstandCounter5 = 0;
    private int understandCounter6 = 0;
    private int dontUnderstandCounter6 = 0;
    private int understandCounter7 = 0;
    private int dontUnderstandCounter7 = 0;
    private int understandCounter8 = 0;
    private int dontUnderstandCounter8 = 0;
    
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private Button submitQ;
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
    private String text = "";
    
    public StudentViewController() {    
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
    private void initialize() {
        getUserLabel().setText(getMainInstance().getCurrentStudent().getStudentName());
        getCourseLabel().setText(getMainInstance().getCurrentCourse().getCourseName());
        getRoomLabel().setText(("Room #" + getMainInstance().getCurrentCourse().getRoomNum()));
        getTopic1Btn().setStyle("-fx-background-color: Blue");
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
    private void handleLogOutButtonAction(ActionEvent event) throws IOException, Exception {
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
            getMainInstance().switchScenes("StudentLogin");
        }
        
        else;
    }

    @FXML
    public void understandSelect1() {
            setDontUnderstandCounter1(0);
            setUnderstandCounter1(1);
            getDontUnderstand1().setText(Integer.toString(getDontUnderstandCounter1()));
            getUnderstand1().setText(Integer.toString(getUnderstandCounter1()));
    }
    
    @FXML
    public void dontUnderstandSelect1() {
            setDontUnderstandCounter1(1);
            setUnderstandCounter1(0);
            getDontUnderstand1().setText(Integer.toString(getDontUnderstandCounter1()));
            getUnderstand1().setText(Integer.toString(getUnderstandCounter1()));
    }
    
    @FXML
    public void understandSelect2() {
            setDontUnderstandCounter2(0);
            setUnderstandCounter2(1);
            getDontUnderstand2().setText(Integer.toString(getDontUnderstandCounter2()));
            getUnderstand2().setText(Integer.toString(getUnderstandCounter2()));
    }
    
    @FXML
    public void dontUnderstandSelect2() {
            setDontUnderstandCounter2(1);
            setUnderstandCounter2(0);
            getDontUnderstand2().setText(Integer.toString(getDontUnderstandCounter2()));
            getUnderstand2().setText(Integer.toString(getUnderstandCounter2()));
    }
    
    @FXML
    public void understandSelect3() {
            setDontUnderstandCounter3(0);
            setUnderstandCounter3(1);
            getDontUnderstand3().setText(Integer.toString(getDontUnderstandCounter3()));
            getUnderstand3().setText(Integer.toString(getUnderstandCounter3()));
    }
    
    @FXML
    public void dontUnderstandSelect3() {
            setDontUnderstandCounter3(1);
            setUnderstandCounter3(0);
            getDontUnderstand3().setText(Integer.toString(getDontUnderstandCounter3()));
            getUnderstand3().setText(Integer.toString(getUnderstandCounter3()));
    }
    
    @FXML
    public void understandSelect4() {
            setDontUnderstandCounter4(0);
            setUnderstandCounter4(1);
            getDontUnderstand4().setText(Integer.toString(getDontUnderstandCounter4()));
            getUnderstand4().setText(Integer.toString(getUnderstandCounter4()));
    }
    
    @FXML
    public void dontUnderstandSelect4() {
            setDontUnderstandCounter4(1);
            setUnderstandCounter4(0);
            getDontUnderstand4().setText(Integer.toString(getDontUnderstandCounter4()));
            getUnderstand4().setText(Integer.toString(getUnderstandCounter4()));
    }
    
    @FXML
    public void understandSelect5() {
            setDontUnderstandCounter5(0);
            setUnderstandCounter5(1);
            getDontUnderstand5().setText(Integer.toString(getDontUnderstandCounter5()));
            getUnderstand5().setText(Integer.toString(getUnderstandCounter5()));
    }
    
    @FXML
    public void dontUnderstandSelect5() {
            setDontUnderstandCounter5(1);
            setUnderstandCounter5(0);
            getDontUnderstand5().setText(Integer.toString(getDontUnderstandCounter5()));
            getUnderstand5().setText(Integer.toString(getUnderstandCounter5()));
    }
    
    @FXML
    public void understandSelect6() {
            setDontUnderstandCounter6(0);
            setUnderstandCounter6(1);
            getDontUnderstand6().setText(Integer.toString(getDontUnderstandCounter6()));
            getUnderstand6().setText(Integer.toString(getUnderstandCounter6()));
    }
    
    @FXML
    public void dontUnderstandSelect6() {
            setDontUnderstandCounter6(1);
            setUnderstandCounter6(0);
            getDontUnderstand6().setText(Integer.toString(getDontUnderstandCounter6()));
            getUnderstand6().setText(Integer.toString(getUnderstandCounter6()));
    }
    
    @FXML
    public void understandSelect7() {
            setDontUnderstandCounter7(0);
            setUnderstandCounter7(1);
            getDontUnderstand7().setText(Integer.toString(getDontUnderstandCounter7()));
            getUnderstand7().setText(Integer.toString(getUnderstandCounter7()));
    }
    
    @FXML
    public void dontUnderstandSelect7() {
            setDontUnderstandCounter7(1);
            setUnderstandCounter7(0);
            getDontUnderstand7().setText(Integer.toString(getDontUnderstandCounter7()));
            getUnderstand7().setText(Integer.toString(getUnderstandCounter7()));
    }
    
    @FXML
    public void understandSelect8() {
            setDontUnderstandCounter8(0);
            setUnderstandCounter8(1);
            getDontUnderstand8().setText(Integer.toString(getDontUnderstandCounter8()));
            getUnderstand8().setText(Integer.toString(getUnderstandCounter8()));
    }
    
    @FXML
    public void dontUnderstandSelect8() {
            setDontUnderstandCounter8(1);
            setUnderstandCounter8(0);
            getDontUnderstand8().setText(Integer.toString(getDontUnderstandCounter8()));
            getUnderstand8().setText(Integer.toString(getUnderstandCounter8()));
    }

    @FXML
    public void enterQ() {
        setText(getText() + "\n" + "Q - " + getTextField().getText());
        getTextArea().setText(getText());
        //this.addMessageToTopic("Question--",(this.getText()), "-Posted by student" );
        getTextField().clear(); 
       
        
    }
    
    @FXML
    public void enterA() {
        setText(getText() + "\n" + "A - " + getTextField().getText());
        getTextArea().setText(getText());
        //this.addMessageToTopic("Answer--",(this.getText()), "-Posted by student" );
        getTextField().clear();
    }
    
    @FXML
    public void addMessageToTopic(String type, String messageBody, String poster){
        switch (getCurrentTopicSelected()) {
            case 0:
                mainInstance.getTopic1().getMessages().add(new Message(type, messageBody, poster));
                break;
            case 1:
                mainInstance.getTopic2().getMessages().add(new Message(type, messageBody, poster));
                break;
            case 2:
                mainInstance.getTopic3().getMessages().add(new Message(type, messageBody, poster));
                break;
            case 3:
                mainInstance.getTopic4().getMessages().add(new Message(type, messageBody, poster));
                break;
            case 4:
                mainInstance.getTopic5().getMessages().add(new Message(type, messageBody, poster));
                break;
            case 5:
                mainInstance.getTopic6().getMessages().add(new Message(type, messageBody, poster));
                break;
            case 6:
                mainInstance.getTopic7().getMessages().add(new Message(type, messageBody, poster));
                break;
            case 7:
                mainInstance.getTopic8().getMessages().add(new Message(type, messageBody, poster));
                break;
            default:
                break;
        }
        
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
     * @return the rb1Y
     */
    public RadioButton getRb1Y() {
        return rb1Y;
    }

    /**
     * @param rb1Y the rb1Y to set
     */
    public void setRb1Y(RadioButton rb1Y) {
        this.rb1Y = rb1Y;
    }

    /**
     * @return the rb1N
     */
    public RadioButton getRb1N() {
        return rb1N;
    }

    /**
     * @param rb1N the rb1N to set
     */
    public void setRb1N(RadioButton rb1N) {
        this.rb1N = rb1N;
    }

    /**
     * @return the understand1
     */
    public Label getUnderstand1() {
        return understand1;
    }

    /**
     * @param understand1 the understand1 to set
     */
    public void setUnderstand1(Label understand1) {
        this.understand1 = understand1;
    }

    /**
     * @return the dontUnderstand1
     */
    public Label getDontUnderstand1() {
        return dontUnderstand1;
    }

    /**
     * @param dontUnderstand1 the dontUnderstand1 to set
     */
    public void setDontUnderstand1(Label dontUnderstand1) {
        this.dontUnderstand1 = dontUnderstand1;
    }

    /**
     * @return the understand2
     */
    public Label getUnderstand2() {
        return understand2;
    }

    /**
     * @param understand2 the understand2 to set
     */
    public void setUnderstand2(Label understand2) {
        this.understand2 = understand2;
    }

    /**
     * @return the dontUnderstand2
     */
    public Label getDontUnderstand2() {
        return dontUnderstand2;
    }

    /**
     * @param dontUnderstand2 the dontUnderstand2 to set
     */
    public void setDontUnderstand2(Label dontUnderstand2) {
        this.dontUnderstand2 = dontUnderstand2;
    }

    /**
     * @return the understand3
     */
    public Label getUnderstand3() {
        return understand3;
    }

    /**
     * @param understand3 the understand3 to set
     */
    public void setUnderstand3(Label understand3) {
        this.understand3 = understand3;
    }

    /**
     * @return the dontUnderstand3
     */
    public Label getDontUnderstand3() {
        return dontUnderstand3;
    }

    /**
     * @param dontUnderstand3 the dontUnderstand3 to set
     */
    public void setDontUnderstand3(Label dontUnderstand3) {
        this.dontUnderstand3 = dontUnderstand3;
    }

    /**
     * @return the understand4
     */
    public Label getUnderstand4() {
        return understand4;
    }

    /**
     * @param understand4 the understand4 to set
     */
    public void setUnderstand4(Label understand4) {
        this.understand4 = understand4;
    }

    /**
     * @return the dontUnderstand4
     */
    public Label getDontUnderstand4() {
        return dontUnderstand4;
    }

    /**
     * @param dontUnderstand4 the dontUnderstand4 to set
     */
    public void setDontUnderstand4(Label dontUnderstand4) {
        this.dontUnderstand4 = dontUnderstand4;
    }

    /**
     * @return the understand5
     */
    public Label getUnderstand5() {
        return understand5;
    }

    /**
     * @param understand5 the understand5 to set
     */
    public void setUnderstand5(Label understand5) {
        this.understand5 = understand5;
    }

    /**
     * @return the dontUnderstand5
     */
    public Label getDontUnderstand5() {
        return dontUnderstand5;
    }

    /**
     * @param dontUnderstand5 the dontUnderstand5 to set
     */
    public void setDontUnderstand5(Label dontUnderstand5) {
        this.dontUnderstand5 = dontUnderstand5;
    }

    /**
     * @return the understand6
     */
    public Label getUnderstand6() {
        return understand6;
    }

    /**
     * @param understand6 the understand6 to set
     */
    public void setUnderstand6(Label understand6) {
        this.understand6 = understand6;
    }

    /**
     * @return the dontUnderstand6
     */
    public Label getDontUnderstand6() {
        return dontUnderstand6;
    }

    /**
     * @param dontUnderstand6 the dontUnderstand6 to set
     */
    public void setDontUnderstand6(Label dontUnderstand6) {
        this.dontUnderstand6 = dontUnderstand6;
    }

    /**
     * @return the understand7
     */
    public Label getUnderstand7() {
        return understand7;
    }

    /**
     * @param understand7 the understand7 to set
     */
    public void setUnderstand7(Label understand7) {
        this.understand7 = understand7;
    }

    /**
     * @return the dontUnderstand7
     */
    public Label getDontUnderstand7() {
        return dontUnderstand7;
    }

    /**
     * @param dontUnderstand7 the dontUnderstand7 to set
     */
    public void setDontUnderstand7(Label dontUnderstand7) {
        this.dontUnderstand7 = dontUnderstand7;
    }

    /**
     * @return the understand8
     */
    public Label getUnderstand8() {
        return understand8;
    }

    /**
     * @param understand8 the understand8 to set
     */
    public void setUnderstand8(Label understand8) {
        this.understand8 = understand8;
    }

    /**
     * @return the dontUnderstand8
     */
    public Label getDontUnderstand8() {
        return dontUnderstand8;
    }

    /**
     * @param dontUnderstand8 the dontUnderstand8 to set
     */
    public void setDontUnderstand8(Label dontUnderstand8) {
        this.dontUnderstand8 = dontUnderstand8;
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
     * @return the understandCounter1
     */
    public int getUnderstandCounter1() {
        return understandCounter1;
    }

    /**
     * @param understandCounter1 the understandCounter1 to set
     */
    public void setUnderstandCounter1(int understandCounter1) {
        this.understandCounter1 = understandCounter1;
    }

    /**
     * @return the dontUnderstandCounter1
     */
    public int getDontUnderstandCounter1() {
        return dontUnderstandCounter1;
    }

    /**
     * @param dontUnderstandCounter1 the dontUnderstandCounter1 to set
     */
    public void setDontUnderstandCounter1(int dontUnderstandCounter1) {
        this.dontUnderstandCounter1 = dontUnderstandCounter1;
    }

    /**
     * @return the understandCounter2
     */
    public int getUnderstandCounter2() {
        return understandCounter2;
    }

    /**
     * @param understandCounter2 the understandCounter2 to set
     */
    public void setUnderstandCounter2(int understandCounter2) {
        this.understandCounter2 = understandCounter2;
    }

    /**
     * @return the dontUnderstandCounter2
     */
    public int getDontUnderstandCounter2() {
        return dontUnderstandCounter2;
    }

    /**
     * @param dontUnderstandCounter2 the dontUnderstandCounter2 to set
     */
    public void setDontUnderstandCounter2(int dontUnderstandCounter2) {
        this.dontUnderstandCounter2 = dontUnderstandCounter2;
    }

    /**
     * @return the understandCounter3
     */
    public int getUnderstandCounter3() {
        return understandCounter3;
    }

    /**
     * @param understandCounter3 the understandCounter3 to set
     */
    public void setUnderstandCounter3(int understandCounter3) {
        this.understandCounter3 = understandCounter3;
    }

    /**
     * @return the dontUnderstandCounter3
     */
    public int getDontUnderstandCounter3() {
        return dontUnderstandCounter3;
    }

    /**
     * @param dontUnderstandCounter3 the dontUnderstandCounter3 to set
     */
    public void setDontUnderstandCounter3(int dontUnderstandCounter3) {
        this.dontUnderstandCounter3 = dontUnderstandCounter3;
    }

    /**
     * @return the understandCounter4
     */
    public int getUnderstandCounter4() {
        return understandCounter4;
    }

    /**
     * @param understandCounter4 the understandCounter4 to set
     */
    public void setUnderstandCounter4(int understandCounter4) {
        this.understandCounter4 = understandCounter4;
    }

    /**
     * @return the dontUnderstandCounter4
     */
    public int getDontUnderstandCounter4() {
        return dontUnderstandCounter4;
    }

    /**
     * @param dontUnderstandCounter4 the dontUnderstandCounter4 to set
     */
    public void setDontUnderstandCounter4(int dontUnderstandCounter4) {
        this.dontUnderstandCounter4 = dontUnderstandCounter4;
    }

    /**
     * @return the understandCounter5
     */
    public int getUnderstandCounter5() {
        return understandCounter5;
    }

    /**
     * @param understandCounter5 the understandCounter5 to set
     */
    public void setUnderstandCounter5(int understandCounter5) {
        this.understandCounter5 = understandCounter5;
    }

    /**
     * @return the dontUnderstandCounter5
     */
    public int getDontUnderstandCounter5() {
        return dontUnderstandCounter5;
    }

    /**
     * @param dontUnderstandCounter5 the dontUnderstandCounter5 to set
     */
    public void setDontUnderstandCounter5(int dontUnderstandCounter5) {
        this.dontUnderstandCounter5 = dontUnderstandCounter5;
    }

    /**
     * @return the understandCounter6
     */
    public int getUnderstandCounter6() {
        return understandCounter6;
    }

    /**
     * @param understandCounter6 the understandCounter6 to set
     */
    public void setUnderstandCounter6(int understandCounter6) {
        this.understandCounter6 = understandCounter6;
    }

    /**
     * @return the dontUnderstandCounter6
     */
    public int getDontUnderstandCounter6() {
        return dontUnderstandCounter6;
    }

    /**
     * @param dontUnderstandCounter6 the dontUnderstandCounter6 to set
     */
    public void setDontUnderstandCounter6(int dontUnderstandCounter6) {
        this.dontUnderstandCounter6 = dontUnderstandCounter6;
    }

    /**
     * @return the understandCounter7
     */
    public int getUnderstandCounter7() {
        return understandCounter7;
    }

    /**
     * @param understandCounter7 the understandCounter7 to set
     */
    public void setUnderstandCounter7(int understandCounter7) {
        this.understandCounter7 = understandCounter7;
    }

    /**
     * @return the dontUnderstandCounter7
     */
    public int getDontUnderstandCounter7() {
        return dontUnderstandCounter7;
    }

    /**
     * @param dontUnderstandCounter7 the dontUnderstandCounter7 to set
     */
    public void setDontUnderstandCounter7(int dontUnderstandCounter7) {
        this.dontUnderstandCounter7 = dontUnderstandCounter7;
    }

    /**
     * @return the understandCounter8
     */
    public int getUnderstandCounter8() {
        return understandCounter8;
    }

    /**
     * @param understandCounter8 the understandCounter8 to set
     */
    public void setUnderstandCounter8(int understandCounter8) {
        this.understandCounter8 = understandCounter8;
    }

    /**
     * @return the dontUnderstandCounter8
     */
    public int getDontUnderstandCounter8() {
        return dontUnderstandCounter8;
    }

    /**
     * @param dontUnderstandCounter8 the dontUnderstandCounter8 to set
     */
    public void setDontUnderstandCounter8(int dontUnderstandCounter8) {
        this.dontUnderstandCounter8 = dontUnderstandCounter8;
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
     * @return the submitQ
     */
    public Button getSubmitQ() {
        return submitQ;
    }

    /**
     * @param submitQ the submitQ to set
     */
    public void setSubmitQ(Button submitQ) {
        this.submitQ = submitQ;
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
}