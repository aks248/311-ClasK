package clask;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmationBox {
    
    static boolean answer;
    
    public static boolean displayConfirm(String title, String message){
        Stage confirmWindow = new Stage();
        confirmWindow.initModality(Modality.APPLICATION_MODAL);
        confirmWindow.setTitle(title);
        confirmWindow.setMinWidth(350);
        Label boxLabel = new Label();
        boxLabel.setText(message);
        
        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e -> {
            answer = true;
            confirmWindow.close();
        });
        Button noButton = new Button("No");
        noButton.setOnAction(e -> {
            answer = false;
            confirmWindow.close();
        });
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(boxLabel, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        confirmWindow.setScene(scene);
        confirmWindow.showAndWait();
        
        
        return answer;
        
    }
    
}