package com.group8.assignment3;

// Concrete implementation of the Model class
public class MeanCalculator extends Model {
    @Override
    public double calculateMean(double value1, double value2, double value3) {
        double[] values = {value1, value2, value3}; // Array to hold the input values
        double sum = 0; // Variable to store the sum of the values

        // Use foreach loop to sum the values
        for (double value : values) {
            sum += value; // Add each value to the sum
        }

        // Calculate and return the mean
        return sum / values.length; // Divide the sum by the number of values (3)
    }
}
