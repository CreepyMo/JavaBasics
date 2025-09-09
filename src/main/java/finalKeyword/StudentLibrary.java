package finalKeyword;

public class StudentLibrary extends Library{

/*    public void rules(){
        got error message that this method cannot be overriden
    }*/

    public void borrowBook(Book b){

        System.out.println("Borrowed: " + b.getDetails());
    }

    public static void main(String[] var0){

        Book b1 = new Book("Java practice", "iy9879yiuh");
        Book b2 = new Book("Practice final keyword", "khj867hgjv");

        StudentLibrary st1 = new StudentLibrary();
        st1.rules();
        st1.borrowBook(b1);
        st1.borrowBook(b2);
    }
}
