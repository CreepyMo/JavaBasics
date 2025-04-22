package org.example.arrays;

import java.util.Arrays;

public class CombineTwoArrays {

    /**
     In this task, you'll learn how to combine arrays.
     You're given a method getCombinedArray() that takes two arrays of numbers.
     You need to return a new array that contains all the elements from both arrays.

     For example:
     getCombinedArray(new int[] {1, 2}, new int[] {3, 4}); // [1, 2, 3, 4]
     getCombinedArray(new int[] {56}, new int[] {-32}); // [56, -32]
     getCombinedArray(new int[] {}, new int[] {}); // []
     getCombinedArray(new int[] {}, new int[] {20, 10}); // [20, 10]

     Hints:
     Step 1: Calculate the size of the final (combined) array. It should be the sum of the lengths of the two input arrays.
     Step 2: Create a new empty array using the size you calculated. This will be your result array that will store elements from both arrays.
     Step 3: Use a for loop to copy elements from the first array into the result array, starting from index 0.
     Step 4: Then, use another for loop to copy elements from the second array, starting from where you left off in the result array.
     */

    public static void main(String[] args) {
        int[] first = {1, 100, -5, 22, 9};
        int[] second = {99, 44, 2, 0, -2, 4, 3, 77};

        System.out.println(Arrays.toString(getCombinedArray(first, second)));
    }

    public static int[] getCombinedArray(int[] firstArray, int[] secondArray)
    {
        //  Step 1: Calculate the size of the final (combined) array
        int combinedArrays = firstArray.length + secondArray.length;
        // Step 2: Create a new empty array using the size you calculated
        int[] result = new int[combinedArrays];
        // Step 3: Use a for loop to copy elements from the first array into the result array, starting from index 0
        for (int i = 0; i < firstArray.length; i++ ) {
            result[i] = firstArray[i];
        }
        // Step 4: Then, use another for loop to copy elements from the second array, starting from where you left off in the result array
        for (int j = 0; j < secondArray.length; j++ ){
            result[j + firstArray.length]= secondArray[j];
            // the part [j + firstArray.length] was really hard to understand
            // made mistake in step 2 > but when Borya pointed out that the array has to be empty > was able to fix it right away
        }
        return result; // return actual result instead of an empty array
    }
}
