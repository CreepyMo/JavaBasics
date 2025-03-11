package org.example;
import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
//        task6();
    }

    // Task 1: Print details using variables
    public static void task1() {
        // Step 1. Declare String variables for a favorite hobby, a favorite food, and a dream destination.
        // Step 2. Print following sentence that use these variables:
        // "My favorite hobby is [hobby], and I love eating [food]. One day, I want to visit [destination]!"

        String hobby = "knitting";
        String food = "crapes";
        String destination = "Japan";

        System.out.println("My favorite hobby is " + hobby + ", and I love eating " + food + ". One day, I want to visit " + destination + "!");
        // Do this twice: first using string concatenation (+) and second using printf.
        /*Format Specifiers - begin with a % and are followed by a character that indicates the data type of the argument:
        %s: String, %d: Integer, %f: Floating-point number, %c: Character, %b: Boolean, %n: Newline, and %%: Literal .*/
        System.out.println("===============Format Specifiers=============");
        System.out.printf("My favorite hobby is %s, and I love eating %s. One day, I want to visit %s!%n", "rock-climbing", "borsch", "Europe");
    }

    // Task 2: Convert string to integer and double
    public static void task2() {
        String firstNumber = "25";
        String secondNumber = "3.14";

        int num1 = Integer.parseInt(firstNumber);
        double double1 = Double.parseDouble(secondNumber);
        System.out.println("===============Convert Strings to int and double=============");
        System.out.println("Converting firstNumber to int > " + num1 + ", and secondNumber to double > " + double1);

        // Convert given strings into an integer and a double, then print the results.
        // Hint: Use Integer.parseInt() and Double.parseDouble().
    }

    // Task 3: Simple arithmetic with user input
    public static void task3(){
        // Initialize two integer variables and print their sum, difference, and product (multiplication).
        // Step 2: Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 3: Print out message to ask user to enter the first number
        System.out.println("Please enter the first number:");
        // Step 4: Initialize first String variable with user input
        String firstInput = scanner.nextLine();

        // Step 5: Print out message to ask user to enter the SECOND number
        System.out.println("Please enter the first number:");
        // Step 6: Initialize second String variable with user input
        String secondInput = scanner.nextLine();

        // Converting String to integer of both inputs
        int firstNumber = Integer.parseInt(firstInput);
        int secondNumber = Integer.parseInt(secondInput);

        // Confirming numbers had been entered
        System.out.println("You entered: " + firstNumber + " and " + secondNumber);

        // Step 7: Print out the sum of these integers
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of numbers entered is: " + sum);


        // Close the scanner when done
        scanner.close();
    }

    // Task 4: Temperature conversion (Celsius to Fahrenheit)
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        // Step 1. Ask the user to enter a temperature in Celsius.
        System.out.println("Please enter temperature in Celsius:");
        String celsius = scanner.nextLine();

        // Hint: Use Scanner to read input and Double.parseDouble() to convert it.
        double tempCelsius = Double.parseDouble(celsius);
        // Step 2. Convert it to Fahrenheit using the formula: F = (C * 9/5) + 32
        double tempFahrenheit = tempCelsius * 9/5 + 32;
        // Step 3. Print the result.
        System.out.println("Temperature in Fahrenheit would be: " + tempFahrenheit);



    }

    // Task 5: Spot and fix the error
    public static void task5() {
        byte smallNumber = 127;

        smallNumber++;
        int intNum = smallNumber;
        System.out.println("The value of smallNumber is: " + intNum);
        // changed byte to int NK
        // Why is the output -128? Fix this using a different data type.



        // When you add 1 to 127 (binary 01111111), the bits overflow:
        // 01111111 (127) + 1 → 10000000 (-128)
        // It wraps around to the minimum value of a byte because there is no room left for a larger positive number in the 8-bit structure.
    }
}
