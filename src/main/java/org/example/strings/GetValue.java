package org.example.strings;

public class GetValue {

    public static void main(String[] args) {
        System.out.println(getValue("name=MaRyJaNE")); // maryjane should be printed to console
    }

    /**
     Now let's learn how to find extra characters in a string and convert the string to lowercase.
     Recently, we connected a database and started retrieving information in the following format: data=value.
     However, lately, the letters in value have been randomly uppercase or lowercase...
     As a result, we get complete nonsense instead of a proper value 🤔

     We've created a method getValue(), which takes a string dataFromDatabase in the format data=value.
     Your task: remove 'data' and '=' from the string, then return value in lowercase.
     Be careful, as value may also contain the = symbol.

     For example:
     getValue("name=joHN"); // "john"
     getValue("occupation=DeveLOPeR"); // "developer"
     getValue("language=JAVA"); // "java"
     getValue("login=Me=cOol!!1"); // "me=cool!!1"

     Hints:
     - use indexOf() to find the index of first occurrence of '=' symbol in a given string
     - use substring() to get the required part of the string
     - use toLowerCase() method to convert string into lowercase
     - method getValue() should return a string
     */
    public static String getValue(String dataFromDataBase) {
        // write your code here
        String str = "name=MaRyJaNE";
        int indexOfEquals = dataFromDataBase.indexOf("=");
        int nextIndex = indexOfEquals + 1;
        String partOfIt = str.substring(nextIndex);
        String strLowerCase = partOfIt.toLowerCase();

        return strLowerCase; // return your result instead of an empty string
    }
}
