package org.example.arrays;

import java.util.Arrays;

public class IndexOutOfBoundExceptionExample {

    /**
     Now you will learn how to fix errors in code.
     In the createArray() method, I created a new array and tried to add the element "lemon" to it.
     But something went wrong — after running the code, we got an IndexOutOfBoundsException.

     Your task: fix the code so that the method returns an array with the element "lemon" at index 2.
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
    }

    public static String[] createArray() {
        //change code below this line
        String[] fruits = new String[2];
        fruits[2] = "lemon";
        //change code above this line

        return fruits;
    }
}
