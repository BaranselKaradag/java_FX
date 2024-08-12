package com.group8.assignment3;

import javafx.application.Application; // Import Application class for JavaFX app
import javafx.fxml.FXMLLoader;         // Import FXMLLoader for loading FXML files
import javafx.scene.Scene;            // Import Scene class to manage the content
import javafx.scene.layout.VBox;       // Import VBox layout for vertical arrangement
import javafx.stage.Stage;            // Import Stage class for the main window

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file for the view layout
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));

            // Load the root layout as a VBox
            VBox root = loader.load();

            // Create a new scene with the loaded layout and set its dimensions
            Scene scene = new Scene(root, 400, 300);

            // Set the title of the primary stage (main window)
            primaryStage.setTitle("Arithmetic Mean Calculator");

            // Set the scene on the primary stage
            primaryStage.setScene(scene);

            // Display the primary stage
            primaryStage.show();
        } catch (Exception e) {
            // Print any exception that occurs during loading
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}