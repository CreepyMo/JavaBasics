package org.example.arrays;

import java.util.Arrays;

public class SpeedStatistics {

    /**
     Let's learn how to find the minimum and maximum values in an array, and then return them in a new array.
     Your task: Implement the getSpeedStatistic() method, which takes an array of speeds results and returns a statistics array where:
     - the first element is the minimum speed
     - the second element is the maximum speed

     Note:
     If the input array is empty, return a statistics array {0, 0};
     If the input array contains only one element, treat it as both the minimum and maximum speed.

     Examples:
     getSpeedStatistic({}); // {0, 0}
     getSpeedStatistic({10}); // {10, 10}
     getSpeedStatistic({8, 9, 9, 9}); // {8, 9}
     getSpeedStatistic({10, 10, 11, 9, 12, 8}); // {8, 12}

     Hint 1:
     Create an array of length 2 to return the minimum and maximum speeds.

     Hint 2:
     Create two variables min and max to store the minimum and maximum speeds.
     When creating them, assign the value at index 0 of the results array.

     Hint 3:
     Use for or for-each loop to iterate through array.
     On each iteration, compare the current element in the results array with min and max.
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSpeedStatistic(new int[]{1, 2, 100, 2})));
    }

    public static int[] getSpeedStatistic(int[] results) {
        int[] lengthOfSpeedStatistic = new int[2];
        int minSpeed = Integer.MAX_VALUE;
        int maxSpeed = Integer.MIN_VALUE;
        for (int speed : lengthOfSpeedStatistic){
            if (speed < minSpeed) {
                minSpeed = speed;
            }
            lengthOfSpeedStatistic[0] = minSpeed;
        }
        for (int speed2 : lengthOfSpeedStatistic) {
            if (speed2 > maxSpeed) {
                maxSpeed = speed2;
            }
            lengthOfSpeedStatistic[1] = maxSpeed;
        }
        return new int[]{0, 0}; // return actual result here
    }
}
