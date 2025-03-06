package org.example;

import java.util.Scanner;

public class Calculator {
    // removed variable and added the action to return
    public static int add (int a, int b)
    {
        return a + b;
    }

    public static int subtract(int a, int b)
    {
        return a - b;
    }

    public static int multiply(int a, int b)
    {
        return a * b;
    }

    public static double divide(int a, int b)
    { // changed type to Double, and put the operation into return, also ignoring the muliply by 0 for now
        return (double) a / (double) b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // moved Scanner outside of While loop to let program run faster

        while (true)
        {
            System.out.print("\nEnter first number: ");
            String aStr = scanner.next(); // added string variable for input because we want user to be able to enter 'exit' at any moment
            int a; // declared variable a to use it within this While loop and inside the IF
            if (aStr.equals("exit"))
            {
                break;
            }
            else
            {
                a = Integer.parseInt(aStr);
            }

            System.out.print("Enter second number: ");
            String bStr = scanner.next();// same as for a variable
            int b;
            if (bStr.equals("exit")) {
                break;
            }
            else {
                b = Integer.parseInt(bStr);
            }

            System.out.print("Choose operation like +, -, *, /: ");
            String operation = scanner.next();

            switch (operation) { //replaced IF with SWITCH
                case "+" -> System.out.println("Result: " + a + " + " + b + " = " + add(a, b));
                case "-" -> System.out.println("Result: " + a + " - " + b + " = " + subtract(a, b));
                case "*" -> System.out.println("Result: " + a + " * " + b + " = " + multiply(a, b));
                case "/" -> System.out.println("Result: " + a + " / " + b + " = " + divide(a, b));
            }

            scanner.close();
        }
    }

}

        /**
         * Task: Create a Simple Calculator in Java

         * Goal:
         * - Learn how to create and call methods.
         * - Practice user input handling and conditional statements.

         * Instructions:
         * 1. Create a class called `Calculator`.
         * 2. Inside the class (above the main method), define four methods using `public static`:
         *    - `public static int add(int a, int b)`: returns the sum of `a` and `b`.
         *    - `public static int subtract(int a, int b)`: returns the difference of `a` and `b`.
         *    - `public static int multiply(int a, int b)`: returns the product of `a` and `b`.
         *    - `public static String divide(int a, int b)`: returns `a / b` as a `String`,
         *      but if `b == 0`, return `"Error: Cannot divide by zero!"`.

         * 3. Implement the `main` method:
         *    - Use a `Scanner` object to get user input.
         *    - Ask the user to enter two numbers.
         *    - Ask the user to choose an operation (`+`, `-`, `*`, `/`).
         *    - Use a `switch` statement or `if-else` conditions to call the correct method.
         *    - Print the result.
         *    - Repeat until the user types "exit".

         * General Logic in `main` Method:
         * --------------------------------
         * 1. Create a `Scanner` object.
         * 2. Use a loop (`while (true)`) to keep asking for input.
         * 3. Ask the user to enter a number (or "exit" to stop).
         * 4. Read the number (handle input correctly).
         * 5. Ask for the second number.
         * 6. Ask for an operation (`+`, `-`, `*`, `/`).
         * 7. Use `switch (operation)` or `if-else` to:
         *    - Call `add()`, `subtract()`, `multiply()`, or `divide()`.
         *    - Print the result.
         * 8. If the user types "exit", break the loop and end the program.

         * Example Run:
         * ------------
         * Enter first number (or type 'exit' to quit): 10
         * Enter second number: 5
         * Choose an operation (+, -, *, /): +
         * Result: 10 + 5 = 15

         * Enter first number: 8
         * Enter second number: 0
         * Choose an operation (+, -, *, /): /
         * Error: Cannot divide by zero!

         * Enter first number: 6
         * Enter second number: 3
         * Choose an operation (+, -, *, /): exit
         * Goodbye!

         * Hints:
         * - Use `Scanner scanner = new Scanner(System.in);` for input.
         * - Use a `while` loop to repeat until the user enters "exit".
         * - Use `switch (operation)` or `if-else` to handle operations.
         * - Close the `Scanner` when done: `scanner.close();`
         */


