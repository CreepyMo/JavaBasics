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
        book1.estimateReadingTime(book1.pages);

    }
}
