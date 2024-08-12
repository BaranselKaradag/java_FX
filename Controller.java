package com.group8.assignment3;

import javafx.fxml.FXML; // Import FXML annotation for linking FXML elements
import javafx.scene.control.TextField; // Import TextField for user input
import javafx.scene.control.Label; // Import Label for displaying text
import javafx.event.ActionEvent; // Import ActionEvent for handling button clicks

public class Controller {

    @FXML
    private TextField inputField1; // Input field for the first number

    @FXML
    private TextField inputField2; // Input field for the second number

    @FXML
    private TextField inputField3; // Input field for the third number

    @FXML
    private Label resultLabel; // Label to display the result or error message

    private Model model = new MeanCalculator(); // Create an instance of MeanCalculator

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        try {
            // Parse the text from input fields into double values
            double value1 = Double.parseDouble(inputField1.getText());
            double value2 = Double.parseDouble(inputField2.getText());
            double value3 = Double.parseDouble(inputField3.getText());

            // Calculate the mean using the model
            double mean = model.calculateMean(value1, value2, value3);

            // Display the calculated mean in the result label
            resultLabel.setText("Mean: " + mean);
        } catch (NumberFormatException e) {
            // Handle invalid input and display an error message
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }
}