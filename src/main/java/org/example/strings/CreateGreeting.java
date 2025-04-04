package org.example.strings;

public class CreateGreeting {

    public static void main(String[] args) {
        System.out.println(createGreeting("Natalia")); // Hello, Natalia should be printed to console
        //writeGreeting();
    }

    /**
     Time to learn how to work with StringBuilder.
     In this task, I added the greeting "Hello, " to the 'input' and wanted to return the new string.
     However, the code didn’t work.
     Fix the code so that the createGreeting() method performs its function correctly.

     Hint:
     - You have to return String object instead of StringBuilder object.

     For example:
     createGreeting('Natalia'); // Hello, Natalia
     createGreeting('Stas'); // Hello, Stas
     */
    public static void writeGreeting(){
        StringBuilder builder = new StringBuilder("Hello, ");
        builder.append("Natalia");
        System.out.println(builder);
    }
    public static String createGreeting(String input) {
        StringBuilder builder = new StringBuilder("Hello, ");
        builder.append(input);
        return builder.toString(); // change this line
    }
}
