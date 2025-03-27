package org.example.strings;

public class CombineStrings {

    public static void main(String[] args) {
        combineStr();
      /*  System.out.println(combineStrings("Hello ", "World!")); // Hello, World! should be printed to console*/
    }
    /**
     Now let's learn how to concatenate strings using StringBuilder.
     In the combineStrings() method, join the input strings one and two.
     Return the new string as a result. Use the StringBuilder class to concatenate the strings.
     */
    public static void combineStr(){
        StringBuilder one = new StringBuilder("Hello ");
        StringBuilder two = new StringBuilder("Word!");
        System.out.println(one.append(two));
    }
    public static String combineStrings(String one, String two) {
        // Create StringBuilder object for string 'one'
        // Append string 'two'
        return ""; // Return String representation of StringBuilder Object
    }
}
