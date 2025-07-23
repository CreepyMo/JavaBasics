package org.example;

public class Loops {

    public static void main(String[] args) {
//        sumOfNumbers();
        reverseOrder();
        multiplicationTable(5);
    }

    public static void sumOfNumbers() {
        /**
         * Task: Write a program that calculates and prints the sum of numbers from 1 to 100 using a for loop.
         * Expected output:
         * The sum is: 5050
         */
        int sum = 0;
        for (int i = 1; i <= 100; i ++){
            sum = i + sum;
        }

        System.out.println(sum);
    }

    public static void reverseOrder() {
        /**
         * Task: Write a program that prints numbers from 10 to 1 in reverse order using a for loop.
         * Expected output:
         * 10 9 8 7 6 5 4 3 2 1
         */
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void multiplicationTable(int n) {
        /**
         * Task: Write a program that prints the multiplication table for a given number n (e.g., n = 5) using a for loop.
         * Expected output:
         * 5 x 1 = 5
         * 5 x 2 = 10
         * ...
         * 5 x 10 = 50
         */
        for (int i = 1; i <= 10; i++){
            int multiplication = 5 * i;
            System.out.println(multiplication);
        }
    }
}
