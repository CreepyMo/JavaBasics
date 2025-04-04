package org.example.methods;

public class Square {

    public static void main(String[] args) {
        System.out.println(square(4));
        // For example:
        // square(5); Output: 25
        // square(3); Output 9
    }
    public static int square(int num){
        int calculateSquare = num * num;
        return calculateSquare;
    }
    // Write a method called 'square' that takes an integer as a parameter and returns its square.
    // For a method definition use 'public static' keywords (we will learn them later).

    // Hint: method should return int. Use System.out.println and pass method call to see the result in console.
}
