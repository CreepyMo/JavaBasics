package org.example.classes;

public class Library {

    public static void main(String[] args){

        Book book1 = new Book();
        book1.title = "Partners in Crime";
        book1.author = "Agatha Christie";
        book1.pages = 375;
        book1.isAvailable = true;

        book1.displayInfo();
        book1.borrowBook();
        book1.returnBook();
        int hours = book1.estimateReadingTime(55);
        System.out.printf("The book will take %s to finish.", hours);
        // also can be done without declaring method, only writing one line here
        // which is reducing amount of code in whole project
        //System.out.printf("\n2. The book will take %s to finish.", book1.pages / 55);


    }
}
