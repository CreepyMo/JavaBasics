package org.example;

import java.util.ArrayList;
import java.util.List;

public class LoopsDeepDive {
    public static void main(String[] args) {
//        reverseStarPyramid(10);
        longestWord();
    }

    public static void longestWord() {
        /**
         Task: Find and print out the longest word from a given ArrayList.
         Create two solutions. First one using the For loop, second one using the For-each loop
         */
       /* List<Integer> numList = new ArrayList<>(List.of(10, 6, 3, 23, 45));
        int nMax = numList.get(0);
        for (int j = 1; j < numList.size(); j++) {
            int nCur = numList.get(j);
            if (nCur < nMax) {
                nMax = nCur;
            }
        }*/
        List<String> words = new ArrayList<>(List.of("banana", "constructors", "skyscraper", "cherry", "boss"));
        // get length of every word
        int wMaxLength = words.get(0).length();
        int maxIndex = 0;

        // NK putting every word in the iteration
        for (int i = 1; i < words.size(); i++) {

            int wordLength = words.get(i).length();
            if (wMaxLength < wordLength) {
                wMaxLength = wordLength;
                maxIndex = i;
            }
        }
        System.out.println(words.get(maxIndex));
    }

    public static void sumEvenNumbers() {
        /**
         Task: Print out the sum of EVEN numbers from a given ArrayList
         Create two solutions. First one using the For loop, second one using the For-each loop
         */

        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 22, 4, 6, 5, 5, 891, 900, -4));
        int num1 = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++){
            //System.out.println(numbers.get(i));
            int num2 = numbers.get(i);
            int duplicate;
            if (num1 != num2){
                num1 = num2;
                duplicate = num1;
                System.out.println("Number 1 is: " + duplicate);
            }
        }
    }

    public static void reverseStarPyramid(int n) {
        /*
         Write a Java program that prints a reversed star pyramid.

         Example for n = 5:

         *****
         ****
         ***
         **
         *

         Hints:
         - Use nested for loops
         - Use System.out.print("*") in a nested loop in order to print stars on the same line
         - Once you are out of a nested loop, use System.out.println() to create a line break

         */
    }
}
