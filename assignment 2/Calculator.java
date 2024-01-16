// Calculator.java
package Assign1;

import java.util.Arrays;

public class Calculator {
    // Method to add two numbers
    public static double add(double n1, double n2){
        return n1 + n2;
    }


    public static double subtract(double n1, double n2){
        return n1 - n2;
    }

    
    public static double multiply(double n1, double n2){
        return n1 * n2;
    }


    public static double divide(double n1, double n2){
        return n1 / n2;
    }


    public static double mean(double[] arr){
        return Arrays.stream(arr).sum() / arr.length;
    }

    public static double sqrt(double n){
        return Math.pow(n, 0.5);
    }


    public static double stddev(double[] arr){
        double standardDeviation = 0.0;
        
        // Calculate the sum of squared differences from the mean
        for (double num : arr) {
            standardDeviation += Math.pow(num - mean(arr), 2);
        }

        // Calculate the square root of the average of squared differences
        return Math.sqrt(standardDeviation / arr.length);
    }

    // Method to calculate the variance of an array of numbers
    public static double variance(double[] arr){
        // Variance is the square root of the standard deviation
        return sqrt(stddev(arr));
    }

    // Method to calculate the power of a number raised to another number
    public static double power(double n1, double n2){
        return Math.pow(n1, n2);
    }
}