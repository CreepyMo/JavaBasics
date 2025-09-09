package finalKeyword;

public final class Book {

    final String title;
    final String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getDetails(){
        return "Title: " + title + ", ISBN: " + isbn;
    }

  /*  public String getTitle(){

        return title;
    }*/


}
