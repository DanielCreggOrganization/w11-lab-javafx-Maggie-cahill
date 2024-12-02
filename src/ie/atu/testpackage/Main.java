package ie.atu.testpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;




public class Main extends Application {
    public static void Main(String[]args) {}
    
    // @Override
    // public void start(Stage primaryStage) {
    //     // Create the main content node
    //     Label welcomeLabel = new Label("JavaFX is Cool!");
    //     welcomeLabel.setStyle("-fx-font-size: 40px;");
        
    //     // Create a container to hold our label
    //     StackPane root = new StackPane();
    //     root.getChildren().add(welcomeLabel);
        
    //     // Create and configure the scene
    //     Scene scene = new Scene(root, 400, 200);
        
    //     // Configure and show the stage
    //     primaryStage.setTitle("JavaFX Title");
    //     primaryStage.setScene(scene);
    //     primaryStage.show();

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


