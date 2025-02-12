package org.example;

public class Lesson1 {

    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
    }

    // Task 1: Print details using variables
    public static void task1() {
        // Step 1. Declare String variables for a favorite hobby, a favorite food, and a dream destination.
        // Step 2. Print following sentence that use these variables:
        // "My favorite hobby is [hobby], and I love eating [food]. One day, I want to visit [destination]!"
        // Do this twice: first using string concatenation (+) and second using printf.
    }

    // Task 2: Convert string to integer and double
    public static void task2() {
        String firstNumber = "25";
        String secondNumber = "3.14";

        // Convert given strings into an integer and a double, then print the results.
        // Hint: Use Integer.parseInt() and Double.parseDouble().
    }

    // Task 5: Arithmetic operations
    public static void task3() {
       // Initialize two integer variables and print their sum, difference, and product (multiplication).
    }

    // Task 3: Simple arithmetic with user input
    public static void task4() {
        // Step 1: What is Scanner?
        // Scanner is a class in Java that helps us take input from the user via the console.
        // To use Scanner, we must first import it at the top of our program:
        // import java.util.Scanner;

        // Step 2: Creating a Scanner object:
        // Syntax: Scanner scannerName = new Scanner(System.in);

        // Step 3: Print out message to ask user to enter the first number ("Please enter the first number:")
        // Step 4: Initialize first String variable with user input; (int firstInput = scanner.nextLine();)

        // Step 4: Print out message to ask user to enter the second number ("Please enter the second number:")
        // Step 4: Initialize second String variable with user input;

        // Step 5: Convert first string variable and second string variable to integers
        // Step 6: Print out the sum of these integers
    }

    // Task 4: Temperature conversion (Celsius to Fahrenheit)
    public static void task5() {
        // Step 1. Ask the user to enter a temperature in Celsius.
        // Hint: Use Scanner to read input and Double.parseDouble() to convert it.
        // Step 2. Convert it to Fahrenheit using the formula: F = (C * 9/5) + 32
        // Step 3. Print the result.
    }

    // Task 5: Spot and fix the error
    public static void task6() {
        byte smallNumber = 127;
        smallNumber++;
        System.out.println("The value of smallNumber is: " + smallNumber);
        // Why is the output -128? Fix this using a different data type.

        // When you add 1 to 127 (binary 01111111), the bits overflow:
        // 01111111 (127) + 1 → 10000000 (-128)
        // It wraps around to the minimum value of a byte because there is no room left for a larger positive number in the 8-bit structure.
    }
}
