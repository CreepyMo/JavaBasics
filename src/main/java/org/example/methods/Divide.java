package org.example.methods;

public class Divide {

    public static void main(String[] args) {
        int result = divide(46,2);
        System.out.println(result);
        // For example:
        // divide(5, 5); Output: 1
        // divide(100, 2); Output 50
    }
    public static int divide (int num1, int num2){
        int division = num1 / num2;
        return division;
    }

    // Write a method called 'divide' that takes two integers as parameters and return the division result.
    // For a method definition use 'public static' keywords (we will learn them later).

    // Hint: method should return int. Use System.out.println and pass method call to see the result in console.
}

