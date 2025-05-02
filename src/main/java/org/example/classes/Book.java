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
        if (isAvailable){ //simplified (isAvailable == false)
            System.out.println("You borrowed the book.");
            isAvailable = false;
        } else {
            System.out.println("The book is not available.");
        }
    }
    public void returnBook(){
        if (!isAvailable){//simplified (isAvailable == true)
            System.out.println("You returned the book.");
            isAvailable = true;
        } else {
            System.out.println("The book have not been taken.");
        }
    }
    public int estimateReadingTime(int pagesPerHour){
        return pages / pagesPerHour;
    }

}
