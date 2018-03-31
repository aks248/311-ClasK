package mvc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LoginPanel extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("login_panel.fxml"));
        primaryStage.setTitle("ClaskFX");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
