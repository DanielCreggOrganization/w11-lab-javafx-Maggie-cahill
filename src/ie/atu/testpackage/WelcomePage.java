package ie.atu.testpackage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;



public class WelcomePage extends Application {

    
    @Override
    public void start(Stage primaryStage) {
        // Create the main content node
        Label welcomeLabel = new Label("Welcome, Maggie!");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Label currentDate = new Label(LocalDateTime.now().format(formatter));
    

        currentDate.setStyle("-fx-font-size: 40px;");
        
        // Create a container to hold our label
        StackPane root = new StackPane();
        root.getChildren().add(welcomeLabel);
        root.getChildren().add(currentDate);
        
        // Create and configure the scene
        Scene scene = new Scene(root, 400, 200);
        
        // Configure and show the stage
        primaryStage.setTitle("Welcome!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


