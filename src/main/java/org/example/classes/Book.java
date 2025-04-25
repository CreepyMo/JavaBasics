package org.example.classes;

public class Book {

    String title;
    String author;
    int pages;
    boolean isAvailable;

    public void displayInfo(){
        System.out.printf("Title of the book is: %s\n", title);
        System.out.printf("The author of the book is: %s\n", author);
        System.out.printf("The book has %s pages\n", pages);
        System.out.printf("Availability of the book:  %s\n", isAvailable);

    }
    public void borrowBook(){
        if (isAvailable == false){
            System.out.println("You borrowed the book.");
        }
    }
    public void returnBook(){
        if (isAvailable == true){
            System.out.println("You returned the book.");
        }
    }
    public String estimateReadingTime(int pagesPerHour){
        pagesPerHour = 2 * pages;
        String message = "To read this book will take " + pagesPerHour + " hours.";
        System.out.println(message);
        return message;
    }

}
