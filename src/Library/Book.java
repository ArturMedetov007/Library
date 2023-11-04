package Library;

public class Book {
    String author;
    String title;
    int id;

    void display() {
        System.out.println("ID: " + id + " | Book: '" + title + "' by Author: '" + author + "'");
    }
}
