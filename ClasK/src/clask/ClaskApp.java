package clask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import models.UserDatabase;


public class ClaskApp extends Application implements EventHandler<ActionEvent>
{
    private static ClaskApp instance;
    private static boolean showAccountMessage = false;
    private Stage pStage;

    public ClaskApp() {
        instance = this;
        UserDatabase.init();
    }

    public static void setAccountMessage(boolean flag) {
        if (flag) {
            showAccountMessage = true;
        } else {
            showAccountMessage = false;
        }
    }

    public static boolean getAccountMessageBoolean() {
        return showAccountMessage;
    }

    public static ClaskApp getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        pStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../views/InitialLogin.fxml"));
        primaryStage.setTitle("Clask");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    }

    public void switchScenes(String fxml_file) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../views/" + fxml_file + ".fxml"));
        pStage.setScene(new Scene(root, 900, 500));
        pStage.show();
    }

    @Override
    public void handle(ActionEvent event) {

        if (event.getSource() == "login") {

        }

    }



}
